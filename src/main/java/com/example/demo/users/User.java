package com.example.demo.users;

public class User {
    String fName, lName, profession;
    int id, age, salary;

    public User() {

    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getProfession() {
        return profession;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public User(String fName, String lName, int age, String profession, int salary) {
        this.id = (int) (Math.random() * 1000);
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.profession = profession;
        this.salary = salary;
    }

}
