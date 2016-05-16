package generics;

import inheritance.hierarce.Employee;
import inheritance.hierarce.Manager;
import inheritance.hierarce.Person;
import multithreading.bank.Bank;

import java.util.*;

/**
 * Created by MBCNEWMAIN on 06.05.2016.
 */
public class GenericsMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager());

        Employee employee = employees.get(0);
        employee.getPosition();

        Manager manager = new Manager();
        manager.setName("Vasya");
        Employee employee1 = new Employee();

        employee1 = manager;
        employee1.greeting();

        ArrayList<Manager> managers = new ArrayList<>();
        employees.add(new Employee());
        employee = employees.get(0);

        managers.add(new Manager());
        Manager manager1 = managers.get(0);

        employee = manager;
        //employees = managers;

        employees.add(new Employee());
        fire(employees);
        fire(managers);

        Pair<Person, Person> personPair = new Pair<>(new Person(), new Person());
        Person first = personPair.getFirst();

        Pair<String, String> stringPair = new Pair<>("sdf", "ASDF");
        String second = stringPair.getSecond();

        Map<Person, String> personStringMap = new HashMap<>();
        personStringMap.put(manager, "some string");

        copy(employees, new ArrayList<>());

        List<Employee> employees1 = copy(managers);

        fire(Collections.singletonList(employee));
        fire(Collections.emptyList());
        fire(Collections.<Employee>emptyList()); //esli nugen Generic

    }
    //так не работает
//    public static void fire(List<Manager> employees){
//        for (Manager employee : employees){
//            System.out.println(employee.getName() + " is fired");
//        }
//    }




    public static void fire(List<? extends Employee> employees){
        for (Employee employee : employees){
            System.out.println(employee.getName() + " is fired");
        }
        // добавлять нельзя т.е. потом может быть конфликт / employees.add(new Employee());
    }

    public static void addEmployee (List<? super Employee> employees) {
        employees.add(new Employee());
        //Employee employee = employees.get(0);  нельзя т.к. может быть конфликт.
    }

    public static <T> void copy(List<? extends T> source, List<T> target) {
        target.addAll(source);
    }
    public static <T> List<T> copy(List<? extends T> source) {
        List<T> target = new ArrayList<>();
        target.addAll(source);
        return target;
    }


}