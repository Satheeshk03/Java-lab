package collectionsLab;
import java.util.*;
class Doctor{
	String name;
	int id;
	String specialisation;


public Doctor(String name,int id,String specialisation) {
	this.id=id;
	this.name=name;
	this.specialisation=specialisation;
}
 
public String toString() {
	return " name="+name  +",id=" + id +
            ", specialisation=" + specialisation + 
            "";
}}

public class List2 {
public static void main(String args[]) {
ArrayList<Doctor> doctor=new ArrayList<>();
doctor.add(new Doctor("Dr.Akash",1,"Daermatologist"));
doctor.add(new Doctor("Dr.Ramesh",2,"Cardiologist"));
doctor.add(new Doctor("Dr.Suresh",3,"gynacologist"));
doctor.add(new Doctor("Dr.Dhanush",4,"Neurologist"));
doctor.add(new Doctor("Dr.Venkat",5,"oncologist"));
System.out.println(doctor);

doctor.add(new Doctor("Dr.Surya",6,"Daermatologist"));
doctor.add(new Doctor("Dr.Karthik",7,"Daermatologist"));
	
	
System.out.println(doctor);
	
	
}
}
