package com.snm.demo.collections.ranking;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shahid", 45));
        students.add(new Student("Nazir", 100));
        students.add(new Student("Basheer", 60));
        students.add(new Student("Shabeer", 85));
        students.add(new Student("Arshad", 57));
        students.add(new Student("Amjad", 77));
        UniversityRanking ranking = new UniversityRanking();
        ranking.allocateRank(students);
        ranking.displayRanking();
    }
}
