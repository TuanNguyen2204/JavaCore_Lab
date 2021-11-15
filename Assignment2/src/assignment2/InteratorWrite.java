/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import static assignment2.InteratorRead.getAllUsers;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 *
 * @author dell
 */
public class InteratorWrite {
   

    public static void writeEmployeeXML(List<Emloyee> employees) {
        String path = "Employee.xml";
        InputStream is = null;
        OutputStream os = null;
        XMLEventReader reader = null;
        XMLEventWriter writer = null;
        try {
            is = new FileInputStream(new File(path));
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLEventFactory ef = XMLEventFactory.newInstance();
            String path_new = "Employee_new.xml";
            reader = inputFactory.createXMLEventReader(is);
            os = new FileOutputStream(path_new);
            writer = outputFactory.createXMLEventWriter(os);
            boolean isWrite = false;
            while (reader.hasNext()) {
                XMLEvent event = reader.nextEvent();
                if (event.isStartElement() && "employees".equals(event.asStartElement().getName().toString())) {
                    writer.add(event);
                    isWrite = true;
                    StartElement s_employee = ef.createStartElement("", "", "employee");
                    EndElement e_employee = ef.createEndElement("", "", "employee");
                    StartElement s_name = ef.createStartElement("", "", "name");
                    EndElement e_name = ef.createEndElement("", "", "name");

                    StartElement s_dob = ef.createStartElement("", "", "dob");
                    EndElement e_dob = ef.createEndElement("", "", "dob");

                    StartElement s_address = ef.createStartElement("", "", "address");
                    EndElement e_address = ef.createEndElement("", "", "address");

                    StartElement s_email = ef.createStartElement("", "", "email");
                    EndElement e_email = ef.createEndElement("", "", "email");

                    StartElement s_phone = ef.createStartElement("", "", "phone_no");
                    EndElement e_phone = ef.createEndElement("", "", "phone_no");

                    StartElement s_place_of_work = ef.createStartElement("", "", "place_of_work");
                    EndElement e_place_of_work = ef.createEndElement("", "", "place_of_work");

                    for (Emloyee employee : employees) {
                        writer.add(s_employee);
                        Attribute employee_no = ef.createAttribute("employee_no", employee.getEmployeeNo());
                        writer.add(employee_no);

                        writer.add(s_name);
                        writer.add(ef.createCharacters(employee.getName())); // lay noi dung
                        writer.add(e_name);

                        writer.add(s_dob);
                        writer.add(ef.createCharacters(employee.getDate()));
                        writer.add(e_dob);

                        writer.add(s_address);
                        writer.add(ef.createCharacters(employee.getAddress()));
                        writer.add(e_address);

                        writer.add(s_email);
                        writer.add(ef.createCharacters(employee.getEmail()));
                        writer.add(e_email);

                        writer.add(s_phone);
                        writer.add(ef.createCharacters(String.valueOf(employee.getPhone())));
                        writer.add(e_phone);

                        writer.add(s_place_of_work);
                        writer.add(ef.createCharacters(String.valueOf(employee.getPlaceOfWord())));
                        writer.add(e_place_of_work);

                        writer.add(e_employee);
                    }
                    continue;
                } else if (event.isEndElement() && "employees".equals(event.asEndElement().getName().toString())) {
                    isWrite = false;
                } else if (isWrite) {
                    continue;
                }
                writer.add(event);
            }
            writer.flush();
            writer.close();
            is.close();
            os.close();
            File file = new File(path);
            file.delete();
            file = null;
            file = new File(path_new);
            file.renameTo(new File(path));
        } catch (FileNotFoundException | XMLStreamException ex) {
            Logger.getLogger(InteratorWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InteratorWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
