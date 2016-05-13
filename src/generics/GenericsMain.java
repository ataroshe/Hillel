package generics;

import inheritance.hierarce.Employee;
import inheritance.hierarce.Manager;
import inheritance.hierarce.Person;
import multithreading.bank.Bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MBCNEWMAIN on 06.05.2016.
 */
public class GenericsMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager());

        Employee employee = employees.get(0);
        employee.getPosition();
    }
}