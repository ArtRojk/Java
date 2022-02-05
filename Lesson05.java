package ru.geekbrains.lesson1.MainApp.java.Lesson03;

//** Java 1 Homework 5
//* @author Rozhkov
//*@version 05.02.2022

public class Lesson05 {

    public static void main(String[] args) {
        Worker[] workers = {
            new Worker("Ivanov Ivan", "Engineer", "gmail@gmail.com",
                       "89995557788", 79000, 35),
            new Worker("Ivanov Sergey", "Engineer", "gmail@gmail.com",
                       "89995557787", 90000, 45),
            new Worker("Ivanov Igor", "Engineer", "gmail@gmail.com",
                       "89995557786", 150000, 55),
            new Worker("Ivanov Petr", "Engineer", "gmail@gmail.com",
                       "89995557785", 55000, 25),
            new Worker("Ivanov Oleg", "Engineer", "gmail@gmail.com",
                       "89995557784", 80000, 37),
        };
        for (Worker worker : workers) {
            if (worker.getAge() > 40) {
                System.out.println(worker);
            }
        }
    }
}

class Worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Worker(String name, String position, String email, String phone,
                         int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return (name +
                "Position: " + position +
                "Email: " + email +
                "Phone: " + phone +
                "Salary: " + salary +
                "Age: " + age);
    }
}
