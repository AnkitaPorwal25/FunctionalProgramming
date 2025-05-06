package L4ComplexOperationsandComposition;


import java.util.*;
        import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
}

public class Q25ListOfPeople {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 17),
                new Person("Bob", 20),
                new Person("Charlie", 22),
                new Person("Diana", 15)
        );

        List<String> adultNames = people.stream()
                .filter(p -> p.getAge() > 18)       // Filter adults
                .map(Person::getName)               // Get names
                .collect(Collectors.toList());      // Collect to list

        System.out.println(adultNames);  // Output: [Bob, Charlie]
    }
}
