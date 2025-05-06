package L6DataProcessingAndTransformation.Q34ListOfEmployeesObject;
import java.util.*;
import java.util.stream.*;

public class EmployeeGrouping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "Finance"),
                new Employee("Eve", "IT"),
                new Employee("Frank", "Finance"),
                new Employee("Grace", "IT")
        );

        // Group by department and count employees
        Map<String, Long> departmentCounts = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,         // Grouping key: department
                        Collectors.counting()            // Value: count of employees in each group
                ));

        // Print results
        departmentCounts.forEach((dept, count) ->
                System.out.println(dept + ": " + count));
    }
}
