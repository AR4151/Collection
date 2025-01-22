package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {

    String name;
    double salary;


    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Roshan",80000.00));
        empList.add(new Employee("Rohan",70000.00));
        empList.add(new Employee("Raj",60000.00));
        empList.add(new Employee("Sameer",75000.00));
        empList.add(new Employee("Akash",65000.00));
        empList.add(new Employee("Saurabh",67000.00));

        Predicate<Employee> ee = e -> e.salary>60000.00;
        Predicate<Employee> ss = s -> s.salary%2==0;
        for(Employee e1 : empList){
            if(ee.and(ss).test(e1)){
                System.out.println(e1.name+" "+e1.salary);
            }
            //System.out.println(ee.test(e1));

        }
        System.out.println();


        Function<Double,List<Employee>> sal = s -> empList.stream().filter(e->e.salary>s).collect(Collectors.toList());
        List<Employee> hs = sal.apply(70000.00);
        hs.forEach(emp-> System.out.println(emp.name +" " +emp.salary));
        //System.out.println(hs);
    }
}
