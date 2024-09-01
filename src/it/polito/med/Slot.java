package it.polito.med;

public class Slot {

    private String date;
    private String startStr;
    private String endStr;
    private Integer startInt;
    private Integer endInt;
    private String medId;

    
    public Slot(String date, String startStr, String endStr, String code) {
        String[] st = startStr.split(":");
        String[] ed = endStr.split(":");

        this.date = date;
        this.startStr = startStr;
        if(st[0].equals("0") && st[1].equals("0")){
            this.startStr="00:00";
        }
        else if(st[0].equals("0")){
            this.startStr = "00"+":"+st[1];
        }
        else if(st[1].equals("0")){
            this.startStr = st[0]+":"+"00";
        }

        this.endStr = endStr;
        if(ed[0].equals("0") && ed[1].equals("0")){
            this.endStr="00:00";
        }
        else if(ed[0].equals("0")){
            this.endStr = "00"+":"+ed[1];
        }
        else if(ed[1].equals("0")){
            this.endStr = ed[0]+":"+"00";
        }
        this.medId=code;

        this.startInt= Integer.parseInt(st[0]+st[1]);
        this.endInt=Integer.parseInt(ed[0]+ed[1]);
    }


    public String getDate() {
        return date;
    }
    public String getStartStr() {
        return startStr;
    }
    public String getEndStr() {
        return endStr;
    }
    public Integer getStartInt() {
        return startInt;
    }
    public Integer getEndInt() {
        return endInt;
    }

    


    @Override
    public String toString() {
        return startStr+"-"+endStr;
    }


    public String getMedId() {
        return medId;
    }

    



}
