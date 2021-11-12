package com.company;
import java.util.ArrayList;
import java.util.List;

public class student {
   //State
   private String name;
   private String id;
   private recordbook recordbook;

    public student(String name, String id, recordbook r1){
        this.name = name;
        this.id = id;
        recordbook = r1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.company.recordbook getRecordbook() {
        return recordbook;
    }

    public void setRecordbook(com.company.recordbook recordbook) {
        this.recordbook = recordbook;
    }
}

