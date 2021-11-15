/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Reader;
import LinkedList.Node;
import Main.Main;
import Manager.Manager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuan
 */
public class ReaderController {
    public Manager m = new Manager();
    public Validation v = new Validation();

    public void loadFileReader() {
        m.getReadersList().clear();
        try {
            String file = v.inputString("Enter the file name: ");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            String[] a;
            String rCode;
            String name;
            int byear;
            while (true) {
                s = br.readLine();
                if (s == null || s.trim().length() < 3) {
                    break;
                }
                a = s.split("[|]");
                rCode = a[0].trim();
                name = a[1].trim();
                byear = Integer.parseInt(a[2].trim());
                m.addReader(new Reader(rCode, name, byear));
            }
            fr.close();
            br.close();
            System.err.println("Loaded!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveFileReader() { // Using FileReader class
        try {
            String file = v.inputString("Enter the file name: ");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            Node<Reader> p = m.getReadersList().head;
            while (p != null) {
                pw.printf("%10s | %30s | %4d\r\n", p.data.getRcode(), p.data.getName(), p.data.getByear());
                p = p.next;
            }
            pw.close();
            fw.close();
            System.err.println("Saved!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addReader() {
        String code;
        do {
            code = v.inputString("Enter Reader's code: ");
            Reader check = m.searchReaderByRCode(code);
            if (check != null) {
                System.out.print("The code is duplicated! Please re-enter: ");
            } else {
                break;
            }
        } while (true);

        String name = v.inputString("Enter book's name: ");
        int byear = v.inputInt("Enter Birth year: ", 1900, 2010);

        m.addReader(new Reader(code, name, byear));
        System.out.println("Added sucessfully!");
    }

    public void searchReader() {
        String codeSearch = v.inputString("Enter a code to search: ");
        Reader r = m.searchReaderByRCode(codeSearch);
        if (r == null) {
            System.out.println("There is no reader fit your require!");
        } else {
            System.out.println("code |       Name        |  Birth Year");
            System.out.printf("%4s | %18s | %5d\n", r.getRcode(), r.getName(), r.getByear());
        }
    }

    public void deleteReader() {
        String code;
        Reader r;
        do {
            code = v.inputString("Enter Reader's code: ");
            r = m.searchReaderByRCode(code);
            if (r == null) {
                System.out.print("There is no Reader fit your input!");
                return;
            } else {
                m.deleteReaderByRCode(code);
                break;
            }
        } while (true);
        System.out.println("Deleted!");
    }
    
    public void displayReaders() {
        System.out.println("code |       Name        |  Birth Year");
        Node<Reader> p = m.getReadersList().head;
        while (p != null) {
            System.out.printf("%4s |   %10s      | %5d\n", p.data.getRcode(), p.data.getName(), p.data.getByear());
            p = p.next;
        }
    }

}
