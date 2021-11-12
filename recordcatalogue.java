package com.company;

import java.util.ArrayList;
import java.util.List;

public class recordcatalogue {
    List<student> students;

    public recordcatalogue(List<student> students) {
        this.students = students;
    }

    public recordcatalogue() {
        students = new ArrayList<>();
    }
}

