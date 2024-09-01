package it.polito.med;

public class Appointment {

    private final static int BASE =1;
    private static int INCREMENT =0;

    //String ssn, String name, String surname, String code, String date, String slot
    private String id;
    private String fiscalcode;
    private String name;
    private String surname;
    private String medId;
    private String date;
    private String slot;

    

    public Appointment(String fiscalcode, String name, String surname, String medId, String date, String slot) {
        this.fiscalcode = fiscalcode;
        this.name = name;
        this.surname = surname;
        this.medId = medId;
        this.date = date;
        this.slot = slot;
        this.id=Integer.toString(BASE +INCREMENT++);
    }

    public String getId() {
        return id;
    }

    public String getFiscalcode() {
        return fiscalcode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMedId() {
        return medId;
    }

    public String getDate() {
        return date;
    }

    public String getSlot() {
        return slot;
    }

    public String getStart(){
        String[] start = this.slot.split("-");
        return start[0];
    }

    

    

}
