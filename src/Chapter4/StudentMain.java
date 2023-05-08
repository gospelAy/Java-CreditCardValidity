package Chapter4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String... args){
        List<Student> studentList = new ArrayList<>();
        Student student = new Student(10, "James");
        Student student1 = new Student(11, "Spencer");
        Student student2 = new Student(10, "Yk");
        Student student3 = new Student(15, "Blessing");
        Student student4 = new Student(12, "King face");

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Comparator<Student> studentComparator = Comparator.comparing(Student::getAge).thenComparing(Student::getName);
        studentList.sort(studentComparator);
        for (Student students :studentList) {
            System.out.println(students.getAge() + ", " + students.getName());
        }
        }

    }
