/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LinkedList;
import Controller.Validate;
import Model.Book;
import Model.Lending;
import Model.Reader;

/**
 *
 * @author Tuan
 */
public class Main {
     static void menu() {
        System.out.println("1.Process book list");
        System.out.println("2.Process reader list");
        System.out.println("3.Process lending list");
        System.out.println("4.Exit");
        
    }
    public static void main(String[] args) {
        LinkedList<Book> bookList = new LinkedList<>();
        LinkedList<Reader> readerList = new LinkedList<>();
        LinkedList<Lending> lendList = new LinkedList<>();
        
        BookView bv = new BookView(bookList);
        ReaderView rv = new ReaderView(readerList);
        LendingView lv = new LendingView(readerList, bookList, lendList);
        int choice = 0;
        do {            
            menu();
            choice = Validate.checkInputIntLimit(1, 4, "Enter your choice: ");
            switch(choice){
                case 1:
                    bv.run();
                    break;
                case 2:
                    rv.run();
                    break;
                case 3:
                    lv.run();
                case 4:
                    return;
            }
        } while (true);
    }
}
