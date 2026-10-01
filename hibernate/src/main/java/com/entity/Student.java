package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//we mark @Entity to the classes which we need to perform the operations with DB by that it can understand.
@Table(name="students")
public class Student {
    @Id//we mark @Id to inform that it is the primary key
    private int id;
    private String name;
    private int marks;

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public Student(){

    }
    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    public Student(int id,String name,int marks){
        this.id= id;
        this.name = name;
        this.marks= marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
