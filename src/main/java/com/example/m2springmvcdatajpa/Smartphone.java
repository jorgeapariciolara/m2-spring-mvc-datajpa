package com.example.m2springmvcdatajpa;

public class Smartphone {

    private Long id;
    private Integer ram;
    private String model;
    private Double price;

    public Smartphone () {}

    public Smartphone(Long id, Integer ram, String model, Double price) {
        this.id = id;
        this.ram = ram;
        this.model = model;
        this.price = price;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public Integer getRam() {return ram;}
    public void setRam(Integer ram) {this.ram = ram;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public Double getPrice() {return price;}
    public void setPrice(Double price) {this.price = price;}

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", ram=" + ram +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
