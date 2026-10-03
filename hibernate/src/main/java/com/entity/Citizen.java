package com.entity;

import jakarta.persistence.*;



@Entity
@Table(name="citizens")
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int citizenId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="aadar_id")
    private Aadhar aadhar;
    private int age;

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Citizen(){

    }
    public Citizen(String name,Aadhar aadhar,int age){
        this.name=name;
        this.aadhar=aadhar;
        this.age= age;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "citizenId=" + citizenId +
                ", name='" + name + '\'' +
                ", aadhar=" + aadhar +
                ", age=" + age +
                '}';
    }
}
