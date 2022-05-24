package Sap_xep_voi_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsMain {
    public static void main(String[] args) {
        Students student = new Students("Kien", 30, "HT");
        Students student1 = new Students("Nam", 26, "HN");
        Students student2 = new Students("Anh", 39, "HT" );
        Students student3 = new Students("Tung", 38, "HT" );

        List<Students> lists = new ArrayList<Students>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Students st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Students st : lists){
            System.out.println(st.toString());
        }
    }
}
