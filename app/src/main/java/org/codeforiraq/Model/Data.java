package org.codeforiraq.Model;

public class Data {

    private int id;
    private String name;
    private String job;
    private String timeStamp;
    private String phone;



    public Data() {
    }

    public Data(int id, String name, String job, String timeStamp, String phone) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.timeStamp = timeStamp;
        this.phone = phone;
    }






    public Data(int id,String name, String lname, String description) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.phone = phone;
    }

    public Data( String name, String lname, String description) {

        this.name = name;
        this.job = job;
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
