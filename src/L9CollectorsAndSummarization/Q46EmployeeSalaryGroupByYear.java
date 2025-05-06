package L9CollectorsAndSummarization;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int joiningYear;
    private double salary;

    public Employee(String name, int joiningYear, double salary) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', joiningYear=%d, salary=%.2f}", name, joiningYear, salary);
    }
}

public class Q46EmployeeSalaryGroupByYear {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = List.of(
                new Employee("Alice", 2015, 50000),
                new Employee("Bob", 2015, 60000),
                new Employee("Charlie", 2016, 55000),
                new Employee("David", 2016, 70000),
                new Employee("Eva", 2017, 65000),
                new Employee("Frank", 2017, 60000)
        );

        // Group employees by joining year and find max salary in each year
        Map<Integer, Employee> maxSalaryByYear = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getJoiningYear,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                optional -> optional.orElse(null)
                        )
                ));

        // Print out the results
        maxSalaryByYear.forEach((year, employee) -> {
            if (employee != null) {
                System.out.println("Year: " + year + ", Max Salary Employee: " + employee);
            }
        });
    }
}
