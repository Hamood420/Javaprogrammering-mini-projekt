package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            File file = new File("\\C:\\Users\\Muhammed\\Desktop\\grades.txt");
/*            Scanner scan = new Scanner(System.in);
            System.out.println("Your score");
            System.out.println("Enter student name please");
            System.out.println("Enter 1 for s1");
            System.out.println("Enter 2 for s2");
            System.out.println("Enter 3 for s3");
            System.out.println("Enter 4 for s4");
            System.out.println("Enter 5 for s5");
            System.out.println("Enter 6 for s6");
            System.out.println("Enter 7 for s7");
            System.out.println("Enter 8 for s8");
            System.out.println("Enter 9 for s9");
            System.out.println("Enter 10 for s10");
            System.out.println("Type Exit for exit");*/


            //double grade = scan.nextDouble();
            List<student> students = new ArrayList<>();

            students.add(new student("1", "1", new recordbook()));
            students.add(new student("2", "1", new recordbook()));
            students.add(new student("3", "1", new recordbook()));
            students.add(new student("4", "1", new recordbook()));
            recordcatalogue c1 = new recordcatalogue(students);

            for (var student : c1.students)
            {
                System.out.println(student.getName());
                student.getRecordbook().AddGrade(34);
                student.getRecordbook().AddGrade(42);
                System.out.println(student.getRecordbook().getGradeList());
            }


        }
    }


