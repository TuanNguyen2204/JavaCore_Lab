/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author dell
 */
public class Emloyee {
    public String employeeNo ;
    public String name;
    public String Date;
    public String address;
    public String email;
    public int phone;
    public String placeOfWord;

    public Emloyee() {
    }

    public Emloyee(String employeeNo, String name, String Date, String address, String email, int phone, String placeOfWord) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.Date = Date;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.placeOfWord = placeOfWord;
    }
    
    

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPlaceOfWord() {
        return placeOfWord;
    }

    public void setPlaceOfWord(String placeOfWord) {
        this.placeOfWord = placeOfWord;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeNo=" + employeeNo + ", name=" + name + ", Date=" + Date + ", address=" + address + ", email=" + email + ", phone=" + phone + ", placeOfWord=" + placeOfWord + '}';
    }
    
    
}
