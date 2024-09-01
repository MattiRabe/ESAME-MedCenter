package it.polito.med;

public class Doctor {

    //String id, String name, String surname, String speciality
    private String id;
    private String name;
    private String surname;
    private String speciality;

    
    public Doctor(String id, String name, String surname, String speciality) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
    }
    
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getSpeciality() {
        return speciality;
    }

    
}
