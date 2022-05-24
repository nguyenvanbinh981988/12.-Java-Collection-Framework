package Phan_biet_HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        // write your code here
        Map<Integer,Student> students = new HashMap<>();
        students.put(1,student1);
        students.put(2,student2);
        students.put(3,student3);
        students.put(4,student1);

        for(Map.Entry<Integer,Student> entry : students.entrySet()){
            System.out.println(entry.toString());
        }

        System.out.println("...........Set");
        Set<Student> studentsSet = new HashSet<>();
        studentsSet.add(student1);
        studentsSet.add(student2);
        studentsSet.add(student3);
        studentsSet.add(student1);

        for(Student student : studentsSet){
            System.out.println(student.toString());
        }


    }
}
