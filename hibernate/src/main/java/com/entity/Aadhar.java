package com.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="aadhars")
public class Aadhar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int aadarId;
    @Column(unique = true)
    private int number;
    private LocalDate date;

    public Aadhar() {

    }

    public int getAadarId() {
        return aadarId;
    }

    public void setId(int id) {
        this.aadarId = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Aadhar(int number ,LocalDate date){
        this.number = number;
        this.date=date;

    }

    @Override
    public String toString() {
        return "Aadhar{" +
                "id=" + aadarId +
                ", number=" + number +
                ", date=" + date +
                '}';
    }
}
