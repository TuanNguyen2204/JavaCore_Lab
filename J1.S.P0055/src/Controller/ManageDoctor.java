package Controller;

import Model.Doctor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ManageDoctor {

    ArrayList<Doctor> listDoctor = new ArrayList<>();
    Validate val = new Validate();

    //add Doctor method
    public void addDoctor() {
        System.out.println("Enter code: ");
        String code = val.getInputString();
        //check code exist or not
        //true - not exist; false - exist
        if (!val.checkDuplicateCode(code, listDoctor)) {
            System.out.println("Doctor code is exist.");
            return;
        }
        System.out.println("Enter name: ");
        String name = val.getInputString();
        System.out.println("Enter specialization: ");
        String spec = val.getInputString();
        int avail = val.getAvailability();
        Doctor doctor = new Doctor(code, name, spec, avail);
        listDoctor.add(doctor);
        System.out.println("Add successful.");
    }

    //update Doctor method
    public void updateDoctor() {
        if (listDoctor.isEmpty()) {
            System.out.println("Empty data.");
        } else {
            System.out.println("Enter code: ");
            String code = val.getInputString();
            if (val.checkDuplicateCode(code, listDoctor)) {
                System.out.println("Doctor code isn't exist");
            } else {
                listDoctor.forEach((Doctor doctor) -> {
                    if (code.equalsIgnoreCase(doctor.getCode())) {
                        System.out.println("Enter name: ");
                        String name = val.checkInputOfString();
                        if (name == null) {
                            name = doctor.getName();
                        }
                        System.out.println("Enter specialization: ");
                        String spec = val.checkInputOfString();
                        if (spec == null) {
                            spec = doctor.getSpecialization();
                        }
                        System.out.println("Enter availability: ");
                        int avail = val.checkInputOfAvailability();
                        if (avail == -1) {
                            avail = doctor.getAvailability();
                        }
                        doctor.setName(name);
                        doctor.setSpecialization(spec);
                        doctor.setAvailability(avail);
                    }
                });
                System.out.println("Update successful.\n");
            }
        }
    }

    //delete Doctor method
    public void deleteDoctor() {
        if (listDoctor.isEmpty()) {
            System.out.println("Empty data.");
        } else {
            System.out.println("Enter code: ");
            String code = val.getInputString();
            if (val.checkDuplicateCode(code, listDoctor)) {
                System.out.println("Doctor code isn't exist");
            } else {
                Iterator<Doctor> it = listDoctor.iterator();
                while (it.hasNext()) {
                    Doctor doctor = it.next();
                    if (doctor.getCode().equalsIgnoreCase(code)) {
                        it.remove();
                    }
                }
                System.out.println("Delete successful.\n");
            }
        }
    }

    //search Doctor method
    public void searchDoctor() {
        System.out.println("Enter name: ");
        String name = val.getInputString();
        ArrayList<Doctor> listFindByName = listFindByName(listDoctor, name);
        if (listFindByName.isEmpty()) {
            System.out.println("Cannot find data");
        } else {
            System.out.println("------- Result -------");
            System.out.printf("%-20s%-20s%-20s%-20s\n", "Doctor code", "Doctor name", "Specialization", "Availability");
            for (Doctor doctor : listFindByName) {
                displayADoctor(doctor);
            }
        }
    }

    // method to return list doctor search by name
    public ArrayList<Doctor> listFindByName(ArrayList<Doctor> listDoctor, String name) {
        ArrayList<Doctor> listFindByName = new ArrayList<>();
        for (Doctor doctor : listDoctor) {
            if (doctor.getName().contains(name)) {
                listFindByName.add(doctor);
            }
        }
        return listFindByName;
    }

    public void displayDoctorList() {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Doctor code", "Doctor name", "Specialization", "Availability");
        for (int i = 0; i < listDoctor.size(); i++) {
            displayADoctor(listDoctor.get(i));
        }
    }

    public void displayADoctor(Doctor doctor) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability());
    }
}
