package maelton.java_functional_programming.common_functional_interfaces.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

}

public class ConsumerFunctionalInterfaceExample {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
                people.add(new Person("Maelton", 21));
                people.add(new Person("Felícia", 22));

        Consumer<Person> myConsumer = System.out::println;

        people.forEach(myConsumer);

    }
}
