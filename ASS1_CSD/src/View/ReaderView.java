/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LinkedList;
import Controller.Node;
import Controller.Validate;
import Model.Reader;
import Model.Status;

/**
 *
 * @author Tuan
 */
public class ReaderView {

    private static LinkedList<Reader> readerList;

    public ReaderView(LinkedList<Reader> readerList) {
        this.readerList = readerList;
    }

    

    public static void menu() {
        System.out.println("********* Process reader list *********\n");
        System.out.println("1.Load data from file");
        System.out.println("2.Input & add data to the end");
        System.out.println("3.Display data");
        System.out.println("4.Save reader list to file");
        System.out.println("5.Search by code");
        System.out.println("6.Delete by code");
        System.out.println("7.Exit\n");
    }


    public void run() {
        int choice = 0;
        Node p;
        do {
            menu();
            choice = Validate.checkInputIntLimit(0, 7, "Enter your choice: ");
            switch (choice) {
                case 1:
                    String fPath = Validate.checkInputString("Enter file path: ");
                    try {
                        readerList.loadFromFile(fPath, Status.INPUT_READER);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    readerList.addLast(Validate.getReader());
                    break;
                case 3:
                    readerList.traverse();
                    break;
                case 4:
                    String path = Validate.checkInputString("Enter file path: ");
                    try {
                        readerList.saveToFile(path);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 5:
                    String code = Validate.checkInputString("Enter code to search: ");
                    p = readerList.search(code);
                    if (p == null) {
                        System.out.println("Not found book have code = " + code);
                    } else {
                        System.out.println(p.value.toString());
                    }
                    break;

                case 6:
                    String delCode = Validate.checkInputString("Enter code to delete: ");
                    p = readerList.search(delCode);
                    if (p == null) {
                        System.out.println("Not found book have code = " + delCode);
                    } else {
                        readerList.delete(p);
                        System.out.println("Delete success");
                    }
                    break;
            }
        } while (choice != 7);

    }
}
