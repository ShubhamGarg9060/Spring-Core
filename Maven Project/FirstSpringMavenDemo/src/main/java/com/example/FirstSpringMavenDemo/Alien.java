package com.example.FirstSpringMavenDemo;

public class Alien {
    private int age;
//    private  Laptop laptop;
    private Computer com;
    public Alien()
    {
        System.out.println("Constructor called");
    }
//    public Alien(int age)
//    {
//        this.age=age;
//    }

    public void code()
    {
        System.out.println("I'm Coding");
//        laptop.compile();
          com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

}
