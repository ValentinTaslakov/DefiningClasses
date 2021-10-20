package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    List<Employee> employees;
    private String name;

    public Department(String department) {
        this.name = department;
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public double calculateAverageSalary(){
        return this.employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }
}
