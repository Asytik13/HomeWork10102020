package com.company;
public class Main {

    public static void main(String[] args) {
        void person = new Person(); // need to be Person person = new Person();
        person.setNameAndAge("John", 35);
        int greet = person.greet; // need to be String greet = person.greet()
        System.out.println(greet);
    }
}

class Person {
    String name;
    int age // missed ‘;’

    void setNameAndAge(String newName, int newAge) {
        name = newName;
        age = newAge // missed ‘;’
    }

    String greet() {
        return "I am " + name + ", " + age + " years old";
    }
}
