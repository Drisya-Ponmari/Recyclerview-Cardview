package com.example.dris_iit.recyclerview;

public class Cities {
    private String Cityname;
    private String State;
    public Cities(String Cityname,String State){
        this.Cityname=Cityname;
        this.State=State;
    }
    /*getters and setters to accept private members*/

    public String getCityname(){
        return Cityname;
    }

    public void setCityname(String Cityname){
        this.Cityname=Cityname;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State=State;
    }
}

