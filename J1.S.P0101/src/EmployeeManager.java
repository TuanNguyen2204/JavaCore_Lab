
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeManager {

    private ArrayList<Employee> list;

    Validate v = new Validate();

    public EmployeeManager() {
        list = new ArrayList<>();
    }

    public void menu() {
        System.out.println("1.Add employees");
        System.out.println("2.Update employee");
        System.out.println("3.Remove employee");
        System.out.println("4.Search employee");
        System.out.println("5.Sort employees by salary");
        System.out.println("6.Exit");
        System.out.print("Enter your choice: ");
    }

    public boolean checkDuplicate(String id) {
        for (Employee e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    //add employee
    public void addEmployee() throws ParseException {
        String id, firstname, lastname, phone, email, address, dob, gender, egency;
        double salary;
        while (true) {
            id = v.getString("ID: ", "Invalid ID. Enter again: ", "[a-zA-Z0-9 ]+");
            if (checkDuplicate(id)) { //chua ton tai
                break;
            } else {
                System.out.println("This id is already exsit!");
            }
        }
        firstname = v.getString("First Name: ", "Invalid name.", "[a-zA-Z ]+");
        firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
        lastname = v.getString("Last Name: ", "Invalid name.", "[a-zA-Z ]+");
        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
        phone = v.getString("Phone: ", "Phone number must have 10 digits", "[0-9]{10}");
        email = v.getString("Email(@gmail.com): ", "Invalid email", "^[A-Za-z0-9]+@gmail.com+$");
        address = v.getString("Address: ", "Invalid address.", "[a-zA-Z0-9 ]+"); 
        while (true) {
            dob = v.getDate("Date of birth(dd/MM/yyyy): ");
            if (v.checkAge(dob)) {
                break;
            } else {
                System.out.println("Not in employee age.");
            }
        }
        gender = v.getString("Gender(male/female): ", "Please input male or female", "[a-zA-Z]+");
        salary = v.getDouble("Salary: ", "Invalid double number.");
        egency = v.getString("Egency: ", "Invalid.", "[a-zA-Z ]+");
        list.add(new Employee(id, firstname, lastname, phone, email, address, dob, gender, salary, egency));
        System.out.println("Add successful.");
    }

    //update Employee
    public void updateEmployee() {
        String id;
        if (list.isEmpty()) {
            System.out.println("List employee is empty.");
            return;
        } else {
            id = v.getString("ID: ", "Invalid ID. Enter again: ", "[a-zA-Z0-9 ]+");
            if (checkDuplicate(id)) {//chua ton tai
                System.out.println("Not exist employee to update.");
            } else {
                list.forEach((Employee e) -> {
                    if (id.equalsIgnoreCase(e.getId())) {
                        System.out.println("*****Update Menu****");
                        System.out.println("1. Update first name");
                        System.out.println("2. Update last name");
                        System.out.println("3. Update phone");
                        System.out.println("4. Update email");
                        System.out.println("5. Update address");
                        System.out.println("6. Update dob");
                        System.out.println("7. Update gender");
                        System.out.println("8. Update salary");
                        System.out.println("9. Update egency");
                        System.out.print("Input your choice: ");
                        int x = v.getChoice(1, 9);
                        switch (x) {
                            case 1:
                                String firstname = v.getString("First Name: ", "Invalid name.", "[a-zA-Z ]+");
                                e.setFirstName(firstname);
                                break;
                            case 2:
                                String lastname = v.getString("First Name: ", "Invalid name.", "[a-zA-Z ]+");

                                e.setLastName(lastname);
                                break;
                            case 3:
                                String phone = v.getString("Phone: ", "Phone number must have 10 digits", "[0-9]{10}");
                                e.setPhone(phone);
                                break;
                            case 4:
                                String email = v.getString("Email(@gmail.com): ", "Invalid email", "^[A-Za-z0-9]+@gmail.com+$");
                                e.setEmail(email);
                                break;
                            case 5:
                                String address = v.getString("Address: ", "Invalid address.", "[a-zA-Z0-9 ]+");
                                e.setAddress(address);
                                break;
                            case 6:
                                String dob;
                                while (true) {
                                    dob = v.getDate("Date of birth(dd/MM/yyyy): ");
                            try {
                                if (v.checkAge(dob)) {
                                    break;
                                } else {
                                    System.out.println("Not in employee age.");
                                }
                            } catch (ParseException ex) {
                                ex.getMessage();
                            }
                                }
                                e.setDob(dob);
                                break;
                            case 7:
                                String gender = v.getString("Gender(male/female): ", "Please input male or female", "[a-zA-Z]+");
                                e.setGender(gender);
                                break;
                            case 8:
                                double salary = v.getDouble("Salary: ", "Invalid double number.");
                                e.setSalary(salary);
                                break;
                            case 9:
                                String egency = v.getString("Egency: ", "Invalid.", "[a-zA-Z ]+");
                                e.setEgency(egency);
                                break;
                            default:
                                break;
                        }
                        System.out.println("Update successful.");
                    }

                });
            }
        }
    }

    //remove Employee
    public void removeEmployee() {
        String id;
        if (list.isEmpty()) {
            System.out.println("List employee is empty.");
            return;
        } else {
            id = v.getString("ID: ", "Invalid ID. Enter again: ", "[a-zA-Z0-9 ]+");
            if (checkDuplicate(id)) {//chua ton tai
                System.out.println("Not exist employee to remove.");
            } else {
                System.out.println("Do you want to delete?(Y/N)");
                String checkYN = v.checkYN();
                if (checkYN.equalsIgnoreCase("y")) {
                    Iterator<Employee> it = list.iterator();
                    while (it.hasNext()) {
                        Employee e = it.next();
                        if (e.getId().equalsIgnoreCase(id)) {
                            it.remove();
                        }
                    }
                    System.out.println("Deleted successful.");
                }
            }
        }

    }

    //Search by name
    public void searchEmployee() {
        if (list.isEmpty()) {
            System.out.println("List employee is empty.");
            return;
        } else {
            String name = v.getString("Input name to search: ", "Invalid name", "[a-zA-Z0-9 ]+");
            ArrayList<Employee> listSearch = listFindByName(list, name);
            if (listSearch.isEmpty()) {
                System.out.println("Name is not exist");
            } else {
                System.out.println("------- Result -------");
                System.out.format("%-10s %-10s %-15s %-15s %-10s %-10s %-15s %-10s %-10s %-10s\n", "Id", "FirstName", "LastName", "Phone", "Email", "address", "DateOfBirth", "Gender", "Salary", "Egency");
                for (Employee e : listSearch) {
                    System.out.println(e);
                }
            }
        }
    }

    public ArrayList<Employee> listFindByName(ArrayList<Employee> listEmployee, String name) {
        String fullname;
        name = name.toUpperCase();
        ArrayList<Employee> listFindByName = new ArrayList<>();
        for (Employee e : listEmployee) {
            fullname = (e.getFirstName().toUpperCase() + " " + e.getLastName().toUpperCase()).trim();
            if (fullname.contains(name)) {
                listFindByName.add(e);
            }
        }
        return listFindByName;
    }

    //sort Employee
    public void sortEmployee() {
        if (list.isEmpty()) {
            System.out.println("List employee is empty.");
            return;
        } else {
            Collections.sort(list, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (o1.getSalary() > o2.getSalary()) {
                        return 1;
                    } else if (o1.getSalary() < o2.getSalary()) {
                        return -1;
                    } else {
                        return o1.getId().compareTo(o2.getId());
                    }
                }
            });
            System.out.format("%-10s %-10s %-15s %-15s %-10s %-10s %-15s %-10s %-10s %-10s\n", "Id", "FirstName", "LastName", "Phone", "Email", "address", "DateOfBirth", "Gender", "Salary", "Egency\n");
            for (Employee e : list) {
                System.out.println(e);
            }
        }
    }

    public void add() {
        list.add(new Employee("E1", "Duong", "Pham", "0123456789", "tuan@gmail.com", "HN", "22/04/2001", "male", 9999.5, "SE"));
        list.add(new Employee("E2", "Chieu", "Van", "0123123489", "chieu@gmail.com", "HN", "23/4/2001", "male", 5678.5, "AI"));
        list.add(new Employee("E3", "Nam", "Pham", "0989097678", "nam@gmail.com", "HN", "15/10/2001", "male", 1234.7, "IB"));
        list.add(new Employee("E4", "Chi", "Nguyen", "0975961446", "chi@gmail.com", "HP", "1/6/2001", "female", 2345.6, "JL"));
        list.add(new Employee("E5", "Thao", "Hoang", "0987678767", "thao@gmail.com", "QN", "12/12/2001", "female", 11234.2, "HF"));
    }
}
