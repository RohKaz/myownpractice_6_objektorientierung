package org.example;

import org.example.model.Student;

import java.util.Arrays;

public class StudentDB {


    Student[] studentArray = new Student[4];

    public StudentDB() {
        studentArray[0] = new Student("1", "John", "Math");
        studentArray[1] = new Student("2", "Mary", "English");
        studentArray[2] = new Student("3", "Peter", "Math");
        studentArray[3] = new Student("4", "Jane", "English");
    }

    public Student[] getAllStudents() {
        return studentArray;
    }

    

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }

    public Student randomStudent() {
        int randomIndex = (int) (Math.random() * studentArray.length);
        return studentArray[randomIndex];
    }
}
