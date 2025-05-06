package L6DataProcessingAndTransformation.Q32ListOfStudents;
import java.util.*;
import java.util.stream.*;

public class StudentProcessor {
    public static void main(String[] args) {
        // List of students with names and grades
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 70),
                new Student("Charlie", 90),
                new Student("David", 60),
                new Student("Eva", 95)
        );

        // Process the list: filter, map, and sort
        List<String> filteredSortedNames = students.stream()
                .filter(s -> s.getGrade() > 80)      // Step 1: Filter students who scored above 80
                .map(Student::getName)               // Step 2: Map to names
                .sorted()                            // Step 3: Sort names alphabetically
                .collect(Collectors.toList());       // Step 4: Collect result into a list

        System.out.println(filteredSortedNames);  // Output: [Alice, Charlie, Eva]
    }
}
