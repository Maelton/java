package maelton.java_functional_programming.common_functional_interfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String validatePerson(Predicate<Person> predicate) {
        return predicate.test(this) ? this.name + " is valid" : this.name + " is not valid";
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}

public class PredicateFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
            people.add(new Person("Maelton", 21, "Male"));
            people.add(new Person("Felícia", 22, "Female"));
            people.add(new Person("Odin", 5_000, "Male"));

        Predicate<Person> plus18CinemaMovie = person -> person.age >= 18;
        Predicate<Person> plus65CarParkingArea = person -> person.age >= 65;
        Predicate<Person> plus45yearsOld = person -> person.age >= 45;
        Predicate<Person> isMale = person -> Objects.equals(person.sex, "Male");


        System.out.println("========== Plus 18 movies ==========");
        people.forEach(person -> System.out.println(person.validatePerson(plus18CinemaMovie)));

        System.out.println("\n========== Plus 65 Car Parking Area ==========");
        people.forEach(person -> System.out.println(person.validatePerson(plus65CarParkingArea)));

        System.out.println("\n========== Prostate-Specific Antigen (PSA) test ==========");
        people.forEach(person -> System.out.println(person.validatePerson(plus45yearsOld.and(isMale))));
    }
}
