/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BSTree.BinarySearchTree;
import BSTree.Node;
import Entity.Book;
import Main.Main;
import Manager.Manager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuan
 */
public class BookController {
    public Manager m = new Manager();
    public Validation v = new Validation();

    public BookController() {
    }
    
    public void loadFileBook(){
        m.getBooks().clear();
        try {
            String file = v.inputString("Enter the file name: ");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            String[] a;
            String bCode;
            String title;
            int quantity;
            int lended;
            double price;
            while (true) {
                s = br.readLine();
                if (s == null || s.trim().length() < 3) {
                    break;
                }
                a = s.split("[|]");
                bCode = a[0].trim();
                title = a[1].trim();
                quantity = Integer.parseInt(a[2].trim());
                lended = Integer.parseInt(a[3].trim());
                price = Double.parseDouble(a[4].trim());
                m.addBook(new Book(bCode, title, quantity, lended, price));
            }
            fr.close();
            br.close();
            System.err.println("Loaded!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    public void inputInsertBook() {
        String code;
        do {
            code = v.inputString("Enter Book's code: ");
            Node check = m.getBooks().search(m.getBooks().root, code);
            if (check != null) {
                System.out.print("The code is duplicated! Please re-enter: ");
            } else {
                break;
            }
        } while (true);

        String name = v.inputString("Enter book's name: ");
        int quantity = v.inputInt("Enter quantity: ", 0, Integer.MAX_VALUE);
        int lended = v.inputInt("Enter number of book lended: ", 0, quantity);
        double price = v.inputDouble("Enter price: ", 0, Double.MAX_VALUE);

        m.addBook(new Book(code, name, quantity, lended, price));
        System.out.println("Added sucessfully!");
    }
    
    public void inOrder() {
        System.out.println("code |       Title        |  Quantity  |  Lended  |  Price");
        m.getBooks().inOrderTravesal(m.getBooks().root);
    }

    public void breath() {
        System.out.println("code |       Title        |  Quantity  |  Lended  |  Price");
        m.getBooks().breath(m.getBooks().root);
    }

    public void saveFileBookInorder(){ // Using FileReader class
        try {
            String file = v.inputString("Enter the file name: ");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            ArrayList<Book> list = new ArrayList<>();
            Node p = m.getBooks().root;
            m.getBooks().inOrderAdd(list, p);

            for (Book book : list) {
                pw.printf("%5s | %20s | %2d | %3d | %.1f\r\n", book.getBcode(), book.getTitle(),
                        book.getQuantity(), book.getLended(), book.getPrice());
            }

            pw.close();
            fw.close();
            System.err.println("Saved!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void searchBook() {
        String codeSearch = v.inputString("Enter a code to search: ");
        Node b = m.getBooks().search(m.getBooks().root, codeSearch);
        if (b == null) {
            System.out.println("There is no book fit your require!");
        } else {
            System.out.println("code |       Title        |  Quantity  |  Lended  |  Price");
            System.out.printf("%3s | %18s | %10d | %8d | %7.1f\n", b.data.getBcode(), b.data.getTitle(),
                    b.data.getQuantity(), b.data.getLended(), b.data.getPrice());
        }
    }
    public void deleteBook() {
        String code;
        Node book;
        do {
            code = v.inputString("Enter Book's code: ");
            book = m.getBooks().search(m.getBooks().root, code);
            if (book == null) {
                System.out.print("There is no Book fit your input!");
                return;
            } else {
                m.deleteBookByCopy(book.data);
                break;
            }
        } while (true);

        System.out.println("Deleted!");
    }
    
    public void balance(){
        m.balance();
        breath();
    }

    public void countBook() {
        System.out.println("Number of books: " + m.countBook());
    }
}
