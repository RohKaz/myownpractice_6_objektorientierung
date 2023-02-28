package org.example;

import org.example.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents() {
        //GIVEN
        StudentDB studentDB = new StudentDB();
        //WHEN
        Student[] allStudents = studentDB.getAllStudents();
        //THEN
        assertEquals(4, allStudents.length);
    }

    @Test
    void testToString() {
        //GIVEN
        StudentDB studentDB = new StudentDB();
        //WHEN
        String toString = studentDB.toString();
        //THEN
        assertEquals("StudentDB{studentArray=[Student{id='1', name='John', subject='Math'}, Student{id='2', name='Mary', subject='English'}, Student{id='3', name='Peter', subject='Math'}, Student{id='4', name='Jane', subject='English'}]}", toString);
    }
}