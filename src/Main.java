package src;

import src.company.beans.Person;
import src.company.exceptions.InvalidAgeException;
import src.company.implementations.EmailMessenger;
import src.company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy people z pięcioma obiektami instancji Person
        Person[] people = new Person[5];

        // Tworzenie stałej b o wartości 10
        final int b = 10;

        try {
            // Przypisanie dla każdej instancji nowej instancji Person
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Jane Smith", 25);
            people[2] = new Person("Alice Johnson", 40);
            people[3] = new Person("Bob Brown", 50);
            people[4] = new Person("Emma Wilson", 35);

            // Wyliczenie wartości dla każdej osoby z osobna
            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);
                String message = "Wynik dla osoby " + person.getName() + ": " + result;

                // Tworzenie instancji EmailMessenger i przekazanie wyniku jako treści wiadomości
                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage(message);
            }
        } catch (InvalidAgeException e) {
            // Obsługa wyjątków
            System.err.println("Invalid age: " + e.getMessage());
        }
    }
}