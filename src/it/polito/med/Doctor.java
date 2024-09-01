package it.polito.med;

import java.util.TreeMap;
import java.util.List;
import java.util.LinkedList;

public class Doctor {

    //String id, String name, String surname, String speciality
    private String id;
    private String name;
    private String surname;
    private String speciality;
    private TreeMap<String, List<Slot>> calendar = new TreeMap<>();

    
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

    public TreeMap<String, List<Slot>> getCalendar() {
        return calendar;
    }

    public void addSlot(Slot s){
        if(!calendar.containsKey(s.getDate())){
            List<Slot> l = new LinkedList<>();
            l.add(s);
            calendar.put(s.getDate(), l);
            return;
        }
        calendar.get(s.getDate()).add(s);
    }

    
}
