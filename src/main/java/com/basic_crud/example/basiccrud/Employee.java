package com.basic_crud.example.basiccrud;

public class Employee {
    private Long id;
    private String name;

    private String contact;
    private int salary;

    public Employee(Long id, String name, String contact, int salary) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
