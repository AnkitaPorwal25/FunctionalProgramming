package L6DataProcessingAndTransformation.Q35AverageSalaryOfEmployees;
import java.util.*;
import java.util.stream.*;

public class AverageSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "HR", 55000),
                new Employee("David", "Finance", 70000),
                new Employee("Eve", "IT", 65000),
                new Employee("Frank", "Finance", 75000),
                new Employee("Grace", "IT", 62000)
        );

        // Group by department and calculate average salary
        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        // Print results
        averageSalaries.forEach((dept, avgSalary) ->
                System.out.println(dept + ": " + avgSalary));
    }
}
