package com.example.hwrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<Student> studentList = new ArrayList<>();
    Student_adapter student_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.RecyclerView);

        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));
        studentList.add(new Student("20153293","Ola Ashour","level 5","88%"));


        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        student_adapter = new Student_adapter(studentList,this);
        recyclerView.setAdapter(student_adapter);

    }
}
