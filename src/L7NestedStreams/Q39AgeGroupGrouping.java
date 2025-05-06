package L7NestedStreams;
import java.util.*;
import java.util.stream.*;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class Q39AgeGroupGrouping {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 19),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 45),
                new Person("Eva", 15),
                new Person("Frank", 30),
                new Person("Grace", 55)
        );

        // Create a map of age group -> list of people
        Map<String, List<Person>> ageGroupMap = people.stream()
                .collect(Collectors.groupingBy(person -> {
                    if (person.getAge() < 20) {
                        return "<20";
                    } else if (person.getAge() <= 40) {
                        return "20-40";
                    } else {
                        return "40+";
                    }
                }));

        // Print the result
        ageGroupMap.forEach((ageGroup, peopleInGroup) -> {
            System.out.println(ageGroup + ": " + peopleInGroup.stream()
                    .map(Person::getName)
                    .collect(Collectors.joining(", ")));
        });
    }
}
