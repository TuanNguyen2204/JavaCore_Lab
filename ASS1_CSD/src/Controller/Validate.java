/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import Model.Lending;
import Model.Reader;
import Model.Status;
import java.util.Scanner;

/**
 *
 * @author Tuan
 */
public class Validate {
    private final static Scanner sc = new Scanner(System.in);
    
    //check user input number in range 
    public static int checkInputIntLimit(int min, int max, String mes){
        while (true) {            
            try {
                System.out.println(mes);
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.err.println("Input number in range  [" + min + ", " + max + "]");
                System.out.println("Input again: ");
            }
        }
    }
    
      public static double checkInputDoubleLimit(double min, double max, String message) {
        //loop until user input correct
        while (true) {
            try {
                System.out.println(message);
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
      
      //check input String
      public static String checkInputString(String mes){
          while (true) {              
              System.out.println(mes);
              String result = sc.nextLine().trim();
              if(result.isEmpty()){
                  System.err.println("Not empty");
                  System.out.println("Input again: ");
              }
              else {
                  return result;
              }
          }
      }
      //input book
      public static Book getBook() {
          String bcode = Validate.checkInputString("Enter bcode: ");
          String title = Validate.checkInputString("Enter title: ");
          int quantity = Validate.checkInputIntLimit(0, Integer.MAX_VALUE, "Enter quantity: ");
          int lended = 0;
          double price = Validate.checkInputDoubleLimit(0,Double.POSITIVE_INFINITY, "Enter price");
          Book book = new Book(bcode, title, quantity, lended, price);
          return book;
      }
      
      //input reader
       public static Reader getReader() {
        String rcode = Validate.checkInputString("Enter rcode: ");
        String name = Validate.checkInputString("Enter name: ");
        int year = Validate.checkInputIntLimit(1900, 2010, "Enter year: ");
        return new Reader(rcode, name, year);
    }
       

    //input lending
       public static void getLending(LinkedList<Reader> readerList, LinkedList<Book> bookList, LinkedList<Lending> lendList) {
        String bcode = Validate.checkInputString("Enter bcode: ");
        String rcode = Validate.checkInputString("Enter rcode: ");
        boolean valid = true;
        if(bookList.search(bcode) == null) {
            System.out.println(bcode + " not found in book list.");
            valid = false;
        }
        if(readerList.search(rcode) == null) {
            System.out.println(rcode + " not found in reader list.");
            valid = false;
            
        }
        if(!valid) return;
        
        int state = 0;
        
        Node<Lending> lendNode = lendList.searchBy2Code(bcode, rcode);
        if(lendNode != null) {
            if(lendNode.value.getState() == Status.NOT_GIVEN_READER) {
                System.out.println("The book is not given for reader");
            }
            if(lendNode.value.getState() == Status.NOT_GIVEN_BACK) {
                System.out.println("The book is not given back");
            }
        }else {
            Book book = bookList.search(bcode).value;
            if(book.getLended() == book.getQuantity()) {
                System.out.println();
            }else {
                book.setLended(book.getLended() + 1);
                state = 1;
            }
            
        }

        lendList.addLast( new Lending(bcode, rcode, state));
    }
}
