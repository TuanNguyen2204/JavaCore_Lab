package Main;

import Controller.BookController;
import Controller.LendingController;
import Controller.ReaderController;
import Controller.Validation;
import Manager.Manager;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Validation v = new Validation();
    public static Manager m = new Manager();
    public static BookController bookController = new BookController();
    public static ReaderController readerController = new ReaderController();
    public static LendingController lendingController = new LendingController();

    public static void MenuBook() {
        int option;
        do {
            System.out.println("=========BOOK MANAGEMENT=========");
            System.out.println("1. Load data from file");
            System.out.println("2. Input & insert data");
            System.out.println("3. In-order traverse");
            System.out.println("4. Breath-first traverse");
            System.out.println("5. In-order traverse to file");
            System.out.println("6. Search by bcode");
            System.out.println("7. Delete by bcode by copying");
            System.out.println("8. Simply balancing");
            System.out.println("9. Count number of books");
            System.out.println("10. Quit");
            option = v.inputInt("Choose 1 option: ", 1, 10);
            switch (option) {
                case 1:
                    bookController.loadFileBook();
                    break;
                case 2:
                    bookController.inputInsertBook();
                    break;
                case 3:
                    bookController.inOrder();
                    break;
                case 4:
                    bookController.breath();
                    break;
                case 5:
                    bookController.saveFileBookInorder();
                    break;
                case 6:
                    bookController.searchBook();
                    break;
                case 7:
                    bookController.deleteBook();
                    break;
                case 8:
                    bookController.balance();
                    break;
                case 9:
                    bookController.countBook();
                    break;
                case 10:
                    return;
            }
        } while (true);
    }

    public static void MenuReader() {
        int option;
        do {
            System.out.println("=========READER MANAGEMENT=========");
            System.out.println("1. Load data from file");
            System.out.println("2. Input & add to the end");
            System.out.println("3. Display data");
            System.out.println("4. Save reader list to file");
            System.out.println("5. Search by rcode");
            System.out.println("6. Delete by rcode");
            System.out.println("7. Quit");
            option = v.inputInt("Choose 1 option: ", 1, 7);
            switch (option) {
                case 1:
                    readerController.loadFileReader();
                    break;
                case 2:
                    readerController.addReader();
                    break;
                case 3:
                    readerController.displayReaders();
                    break;
                case 4:
                    readerController.saveFileReader();
                    break;
                case 5:
                    readerController.searchReader();
                    break;
                case 6:
                    readerController.deleteReader();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }

    public static void MenuBookLending() {
        int option;
        do {
            System.out.println("=========LENDING MANAGEMENT=========");
            System.out.println("1. Input data");
            System.out.println("2. Display data");
            System.out.println("3. Sort by bcode + rcode");
            System.out.println("4. Quit");
            option = v.inputInt("Choose 1 option: ", 1, 4);
            switch (option) {
                case 1:
                    lendingController.addLending();
                    break;
                case 2:
                    lendingController.displayLending();
                    break;
                case 3:
                    lendingController.sortLending();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("******LIBRARY MANAGEMENT SYSTEM******");
            System.out.println("1. Book List");
            System.out.println("2. Reader List");
            System.out.println("3. Lending List");
            System.out.println("4. Quit");
            option = v.inputInt("Select the list you want to work on: ", 1, 4);
            switch (option) {
                case 1:
                    MenuBook();
                    break;
                case 2:
                    MenuReader();
                    break;
                case 3:
                    MenuBookLending();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

}
