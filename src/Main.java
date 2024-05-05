package src;

import src.company.beans.Person;
import src.company.exceptions.InvalidAgeException;
import src.company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            // Tworzenie instancji Person
            Person person = new Person("John Doe", 30);

            // Wypisywanie danych
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            // Obsługa wyjątku InvalidAgeException
            System.err.println("Invalid age: " + e.getMessage());
        }


        // Tworzenie instancji EmailMessenger
        EmailMessenger emailMessenger = new EmailMessenger();

        // Wywołanie metody sendMessage
        emailMessenger.sendMessage("Hello, this is an email message!");

    }
}