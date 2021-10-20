package CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int linesToRead = Integer.parseInt(scan.nextLine());

        Map<String,Department> departments = new HashMap<>();

        while (linesToRead-->0){
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email;
            int age;

            Employee employee = null;
            if (input.length == 4){
                employee = new Employee(name,salary,position,department);
            }else if (input.length==6){
                email = input[4];
                age = Integer.parseInt(input[5]);
                employee = new Employee(name,salary,position,department,email,age);
            }else if(input.length ==5){
                try {
                    age =Integer.parseInt(input[4]);
                    employee = new Employee(name,salary,position,department,age);
                }catch (NumberFormatException e){
                    email = input[4];
                    employee = new Employee(name,salary,position,department,email);
                }
            }
            departments.putIfAbsent(department,new Department(department));
            departments.get(department).getEmployees().add(employee);
        }

        Department highestPaidDepartment = departments
                .entrySet()
                .stream()
                .max(Comparator.comparing(entry->
                        entry.getValue().calculateAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: "
                + highestPaidDepartment.getName());

        highestPaidDepartment
                .getEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
    }
}
