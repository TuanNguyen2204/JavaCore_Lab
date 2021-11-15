/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Book;
import Entity.Lending;
import Entity.Reader;
import LinkedList.Node;
import Manager.Manager;

/**
 *
 * @author Tuan
 */
public class LendingController {
    public Manager m = new Manager();
    public Validation v = new Validation();
    
    public  void addLending() {
        String bCode = v.inputString("Enter book's code: ");
        String rCode = v.inputString("Enter reader's code: ");

        Book book = m.getBooks().search(m.getBooks().root,bCode).data;
        Reader reader = m.searchReaderByRCode(rCode);
        Lending lending = m.searchLendingByBCodeAndRCode(bCode, rCode);

        if (book == null) {
            System.out.println("added failed! The book's code is not existed");
            return;
        }
        if (reader == null) {
            System.out.println("added failed! The reader's code is not existed");
            return;
        }
        if (lending != null && lending.getState() == 1) {
            System.out.println("added failed! The book is still borrowing by" + rCode);
            return;
        }
        if (book.getLended() == book.getQuantity()) {
            System.out.println("No more book to borrow!");
            m.addLending(new Lending(bCode, rCode, 0)); //add with state cannot borrow
        } else if (book.getLended() < book.getQuantity()) {
            book.setLended(book.getLended() + 1);
            m.addLending(new Lending(bCode, rCode, 1)); //lended
        }
        System.out.println("Added!");
    }

    public void displayLending() {
        System.out.println("Bcode | Rcode | State ");
        Node<Lending> p = m.getLendingsList().head;
        double value;
        while (p != null) {
            System.out.printf("%4s | %4s | %3d \n", p.data.getBcode(), p.data.getRcode(), p.data.getState());
            p = p.next;
        }
    }
    
    public void sortLending(){
        m.sortLendingByBCodeAndRCode();
        displayLending();
    }
}
