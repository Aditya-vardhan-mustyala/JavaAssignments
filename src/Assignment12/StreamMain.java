package Assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain
{
    public static void main(String[] args)
    {
        ArrayList<Student> students=FactoryStudent.getStudents();

        System.out.println("##############");
        getDepartments(students);
        System.out.println("##############");
        getNamesAfter2018(students);
        System.out.println("##############");
        getMales(students);
        System.out.println("##############");
        getCountOfGenders(students);
        System.out.println("#############");
        getAverageAge(students);
        System.out.println("#############");
        getHighestPercent(students);
        System.out.println("#############");
        CountStudentInDept(students);
        System.out.println("#############");
        AverageOfDepartments(students);
        System.out.println("############");
        YoungestMale(students);
        System.out.println("#############");
        getDetailsOFCse(students);

   }

    private static void getDetailsOFCse(ArrayList<Student> students)
    {
        System.out.println("How many male and female students are there in the computer science");
        Stream<Student> s=students.stream();
        s.filter(student -> student.engDepartment=="Computer Science")
               .collect(Collectors.groupingBy(student -> student.gender,Collectors.counting()))
               .forEach((gender,count)-> System.out.println(gender+" "+count));

    }

    private static void YoungestMale(ArrayList<Student> students)
    {
        System.out.println("details of youngest male student in the Electronic department");
        Stream<Student> s=students.stream();
        s.filter(student -> student.engDepartment=="Electric")
                .filter(student -> student.gender=="Male")
                .min(Comparator.comparing(student->student.age))
                .ifPresent(System.out::println);

    }

    private static void AverageOfDepartments(ArrayList<Student> students)
    {
        System.out.println("average percentage achieved in each department");
        Stream<Student> s=students.stream();
        s.collect(Collectors.groupingBy(student -> student.engDepartment,Collectors.averagingDouble(student->student.perTillDate)))
                .forEach((dep,avg)-> System.out.println(dep+" "+avg));

    }

    private static void CountStudentInDept(ArrayList<Student> students)
    {
        System.out.println("Count the number of students in each department");
        Stream<Student> s=students.stream();
        s.collect(Collectors.groupingBy(student -> student.engDepartment,Collectors.counting()))
                .forEach((dep,count)-> System.out.println(dep+" "+count));
    }

    private static void getHighestPercent(ArrayList<Student> students)
    {
        System.out.println("details of highest student having highest percentage ");
        Stream<Student> s=students.stream();
        s.max(Comparator.comparing(student->student.perTillDate))
                .ifPresent(System.out::println);
    }

    private static void getAverageAge(ArrayList<Student> students)
    {
        System.out.println("average age of male and female students");
        Stream<Student> s=students.stream();
        s.collect(Collectors.groupingBy(student -> student.gender,Collectors.averagingInt(student
        -> student.age)))
                .forEach((gender,avg)-> System.out.println(gender+" "+avg));
    }

    private static void getCountOfGenders(ArrayList<Student> students)
    {
        System.out.println("count of  male and female student");
        Stream<Student> s=students.stream();
        s.collect(Collectors.groupingBy(student -> student.gender,Collectors.counting()))
                .forEach((gender,count)-> System.out.println(gender+" "+count));
    }


    private static void getMales(ArrayList<Student> students)
    {
        System.out.println("details of all male student in the computer sci department");
        Stream<Student> s=students.stream();
        s.filter(student -> student.gender=="Male")
                .filter(student -> student.engDepartment=="Computer Science")
                .forEach(System.out::println);

    }

    private static void getNamesAfter2018(ArrayList<Student> students)
    {
        System.out.println("names of all students who have enrolled after 2018");
        Stream<Student> s=students.stream();
        s.filter(student -> student.year>18)
                .map(student -> student.name)
                .forEach(System.out::println);
    }

    private static void getDepartments(ArrayList<Student> students)
    {
        System.out.println("name of all departments in the college");
        Stream<Student> s=students.stream();
        s.map(student-> student.engDepartment).distinct().forEach(System.out::println);
    }
}
