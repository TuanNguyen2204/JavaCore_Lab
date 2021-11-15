
package PEtest;

import java.util.Scanner;

public class Teacher {
    private String name;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return name + " " + salary;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter Teacher name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter Teacher salary: ");
        Double salary = sc.nextDouble();
        System.out.println("1. TC = 1 - test getName()\n2. TC = 2 - test setSalary()\n3. TC = 3 - test toString()");
        System.out.print("Enter TC : ");
        int number = sc.nextInt();
        Teacher tc = new Teacher(name, salary);
        switch(number) {
            case 1:               
                System.out.println(tc.getName());
                break;
            case 2:
                System.out.print("Enter new salary : ");
                //Double nsalary = sc.nextDouble();
                tc.setSalary(sc.nextDouble());
                System.out.println(tc.getSalary());
                break;
            case 3:          
                System.out.print(tc.toString());
                break;
            default :
                System.out.print("Invalid Input!");
        }
    }
}


