/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LinkedList;
import Controller.Node;
import Controller.Validate;
import Model.Book;
import Model.Status;

/**
 *
 * @author Tuan
 */
public class BookView {

    private static LinkedList<Book> bookList;

    public BookView(LinkedList<Book> bookList) {
        this.bookList = bookList;
    }
   

    public static void menu() {
        System.out.println("********* Process book list *********\n");
        System.out.println("1.Load data from file");
        System.out.println("2.Input & add data to the end");
        System.out.println("3.Display data");
        System.out.println("4.Save book list to file");
        System.out.println("5.Search by code");
        System.out.println("6.Delete by code");
        System.out.println("7.Sort by code");
        System.out.println("8.Input & add data to the begining");
        System.out.println("9.Add after position k");
        System.out.println("10.Delete position k");
        System.out.println("11.Exit.\n");
    }


    public void run() {

        int choice;
        Node<Book> p;
        do {
            menu();
            choice = Validate.checkInputIntLimit(1, 11, "Enter your choice: ");
            switch (choice) {
                case 1:
                    String filePath = Validate.checkInputString("Enter file path: ");
                    try {
                        bookList.loadFromFile(filePath, Status.INPUT_BOOK);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    bookList.addLast(Validate.getBook());
                    break;
                case 3:
                    System.out.println("code |   Title        |  Quantity  |  Lended |  Price   |   Value");
                    System.out.println("-------------------------------------------------------------------");
                    bookList.traverse();
                    break;
                case 4:
                    String path = Validate.checkInputString("Enter file path: ");
                    try {
                        bookList.saveToFile(path);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    String code = Validate.checkInputString("Enter code to search: ");
                    p = bookList.search(code);
                    if (p == null) {
                        System.out.println("Not found book have code = " + code);
                    } else {
                        System.out.println(p.value.toString());
                    }
                    break;
                case 6:
                    String dCode = Validate.checkInputString("Enter code to delete: ");
                    p = bookList.search(dCode);
                    if (p == null) {
                        System.out.println("Not found book have code = " + dCode);
                    } else {
                        bookList.delete(p);
                        System.out.println("Delete Success.");
                    }
                    break;
                case 7:
                    bookList.sort();
                    bookList.traverse();
                case 8:
                    bookList.addFirst(Validate.getBook());
                    break;
                case 9:
                    int k = Validate.checkInputIntLimit(0, bookList.size() - 1, "Enter position to add: ");
                    bookList.addAfter(k, Validate.getBook());
                    break;
                case 10:
                    int pos = Validate.checkInputIntLimit(0, bookList.size() - 1, "Enter position do delete: ");
                    bookList.delete(bookList.getNode(pos));
            }
        } while (choice != 11);
    }
}
