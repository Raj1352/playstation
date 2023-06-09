package com.play.core.models;

public class Sample {

    private String name;
    private String city;
    public static void main(String[] args) {
        Sample sample=new Sample();

        sample.setCity("Chennai");
        System.out.println(sample.getName());
        System.out.println(sample.getCity());
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
