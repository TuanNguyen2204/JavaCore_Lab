/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 *
 * @author dell
 */
public class InteratorRead {
//       public static void main(String[] args) {
//        List<Emloyee> employees = getAllUsers();
//        for (Emloyee employee : employees) {
//            System.out.println(employee);
//        }
//    }

    public static List<Emloyee> getAllUsers() {
        List<Emloyee> employees = new ArrayList<>();
               Emloyee tmpEmployee = null;
           try {   
               XMLInputFactory factory = XMLInputFactory.newInstance();
               XMLEventReader reader;      
               try {
                   reader = factory.createXMLEventReader(new FileInputStream("Employee.xml"));
                   while (reader.hasNext()) {
                   XMLEvent event = reader.nextEvent();
                   if (event.isStartElement()) {
                       StartElement s_element = event.asStartElement();
                       String tag_name = s_element.getName().toString();
                       if ("employee".equals(tag_name)) {
                           tmpEmployee = new Emloyee();
                           Attribute uid = s_element.getAttributeByName(new QName("employee_no"));
                           tmpEmployee.setEmployeeNo(uid.getValue());
                       }
                       if ("name".equals(tag_name)) {
                           tmpEmployee.setName(reader.getElementText());
                       }
                       if ("dob".equals(tag_name)) {
                           tmpEmployee.setDate(reader.getElementText());
                       }
                       if ("address".equals(tag_name)) {
                           tmpEmployee.setAddress(reader.getElementText());
                       }
                       if ("phone_no".equals(tag_name)) {
                           tmpEmployee.setPhone(Integer.parseInt(reader.getElementText()));
                       }
                       if ("place_of_work".equals(tag_name)) {
                           tmpEmployee.setPlaceOfWord(reader.getElementText());
                       }
                       
                       if ("email".equals(tag_name)) {
                           tmpEmployee.setEmail(reader.getElementText());
                       }
                       
                   }
                   if (event.isEndElement()) {
                       EndElement e_element = event.asEndElement();
                       String end_tag = e_element.getName().toString();
                       if ("employee".equals(end_tag)) {
                           employees.add(tmpEmployee);
                           tmpEmployee = null;
                       }
                   }
                   
               }
               } catch (FileNotFoundException ex) {
                   Logger.getLogger(InteratorRead.class.getName()).log(Level.SEVERE, null, ex);
               }
               
              
           } catch (XMLStreamException ex) {
               Logger.getLogger(InteratorRead.class.getName()).log(Level.SEVERE, null, ex);
           }
           return employees;
    }
}
