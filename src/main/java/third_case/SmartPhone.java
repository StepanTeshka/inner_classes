package third_case;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhone {

    private ArrayList<Contact> contacts;
    private Camera camera;

    public SmartPhone() {
        contacts = new ArrayList<>();
        camera = new Camera();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
    }

    public void callContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Вызываем контакт: " + name);
                return;
            }
        }
        System.out.println("Контакт " + name + " не найден.");
    }

    public void takePhoto() {
        camera.open();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Фронтальная 2.горизонтальная:");
        int front = sc.nextInt();
        if(front == 1){
            camera.takePicture();
        }else if(front == 2){
            camera.takePicture();
        }else {
            System.out.println("Вы ввели не правильное значение и были выбрашенны");
            takePhoto();
        }
    }

    public class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }

    public class Camera {
        private boolean isOpen;

        public Camera() {
            isOpen = false;
        }

        public void open() {
            isOpen = true;
            System.out.println("Камера открыта.");
        }

        public void takePicture() {
            if (isOpen) {
                System.out.println("Сделан снимок и сохранен в памяти телефона.");
            } else {
                System.out.println("Невозможно сделать снимок, пока камера закрыта.");
            }
        }
    }
}
