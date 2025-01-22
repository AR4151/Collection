package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    String name;
    int marks;

    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        List<Student> std = new ArrayList<>();
        std.add(new Student("Roshan",85));
        std.add(new Student("Rohan",60));
        std.add(new Student("Raj",55));
        std.add(new Student("Shreyash",55));
        std.add(new Student("Rushi",70));

        Function<Student,String> st = s->{
                if(s.marks>=80) return "A";
                else if(s.marks>=60) return "First Class";
                else if(s.marks>=40) return "Second Class";
                else if(s.marks<=35) return "Fail";

                return s.name+" "+s.marks;
        };

        Predicate<Student> ss = su -> su.marks>=60;

        for(Student s1 : std){

            if(ss.test(s1)){
            System.out.println("Student Name: "+s1.name);
            System.out.println("Student Marks: "+s1.marks);
            System.out.println("Student Grades: "+st.apply(s1));
            System.out.println();

        }
        }

        for(Student s1 : std){
            System.out.println(ss.test(s1));
        }


    }
}
