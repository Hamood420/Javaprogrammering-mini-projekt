package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class recordbook {

    private List<Integer> gradeList;
    public recordbook(){
        gradeList = new ArrayList<>();


    }

    public List<Integer> getGradeList() {
        return gradeList;
    }

    public int higestgrade(){
        return gradeList.get(gradeList.size() -1);
    }

    public int lowestgrade(){
        return -1;
    }

    public int averagegrade(){
        return -1;
    }


    public void AddGrade(int grade){
        gradeList.add(grade);
    }


    public void AddGrade() {

    }
}


