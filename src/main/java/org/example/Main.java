package org.example;

import third_case.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.addContact("Андрей", "953-638-85-16");
        smartphone.addContact("Даниил", "953-638-85-16");
        smartphone.addContact("Славик", "953-638-85-16");
        smartphone.addContact("Тема", "953-638-85-16");

        smartphone.callContact("Андрей");
        smartphone.takePhoto();
    }
}