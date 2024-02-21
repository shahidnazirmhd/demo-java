package com.snm.demo.collections.ranking;

import java.util.*;

public class UniversityRanking {
    private final Map<Student, Integer> ranking;
    public UniversityRanking() {
        this.ranking = new LinkedHashMap<>();
    }
    public void allocateRank(List<Student> students) {
        students.sort(Comparator.comparingInt(Student::getScore).reversed());
        int rank = 1;
        for (Student stu : students) {
            ranking.put(stu, rank++);
        }
    }
    public  void displayRanking() {
        for (Map.Entry<Student, Integer> entry : ranking.entrySet()) {
            System.out.println("Rank: " + entry.getValue() + " Name: " + entry.getKey().getName() + " Score: "+ entry.getKey().getScore());
        }
    }
}
