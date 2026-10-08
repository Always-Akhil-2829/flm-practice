package com.beans;

public class Laptop {
    private int laptopId;
    private String brand;
    private int ram;
    private int storage;
    private String processor;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", processor='" + processor + '\'' +
                '}';
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public Laptop(){

    }

    public Laptop(int laptopId, String brand, int ram, int storage, String processor) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
    }
}
