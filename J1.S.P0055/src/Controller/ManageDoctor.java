package Controller;

import Model.Doctor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ManageDoctor {

    ArrayList<Doctor> listDoctor = new ArrayList<>();
    Validate val = new Validate();

    
    //add Doctor method
    public void addDoctor() {
        String code = val.checkCode();
        //check code exist or not
        //true - not exist; false - exist
        if (!val.checkDuplicateCode(code, listDoctor)) {
            System.out.println("Doctor code is exist.\n");
            return;
        }
        String name = val.checkName();
        String spec = val.checkSpecialization();
        int avail = val.checkAvailability();
        Doctor doctor = new Doctor(code, name, spec, avail);
        listDoctor.add(doctor);
        System.out.println("Add successful.\n");
    }

    
    //update Doctor method
    public void updateDoctor() {
        if (listDoctor.isEmpty()) {
            System.out.println("Empty data.");
        } else {
            String code = val.checkCode();
            if (val.checkDuplicateCode(code, listDoctor)) {
                System.out.println("Doctor code isn't exist");
            } else {
                String name = val.checkName();
                String spec = val.checkSpecialization();
                int avail = val.checkAvailability();
                listDoctor.forEach((Doctor doctor) -> {
                    if (code.equals(doctor.getCode())) {
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
            String code = val.checkCode();
            if (val.checkDuplicateCode(code, listDoctor)) {
                System.out.println("Doctor code isn't exist");
            } else {
                Iterator<Doctor> it = listDoctor.iterator();
                while(it.hasNext()) {
                    Doctor doctor = it.next();
                    if(doctor.getCode().equalsIgnoreCase(code)){
                        it.remove();
                    }
                } 
                System.out.println("Delete successful.\n");
            }
        }
    }
    
    //search Doctor method
    public void searchDoctor() {
        String name = val.checkName();
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
    
    public void displayDoctorList(){
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Doctor code", "Doctor name", "Specialization", "Availability");
        for(int i=0; i< listDoctor.size(); i++){
            displayADoctor(listDoctor.get(i));
        }
    }
    
    public void displayADoctor(Doctor doctor){
        System.out.printf("%-20s%-20s%-20s%-20s\n", doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability());
    }
}
