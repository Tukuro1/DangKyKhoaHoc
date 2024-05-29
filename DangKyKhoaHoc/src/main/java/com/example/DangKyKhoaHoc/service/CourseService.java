package com.example.DangKyKhoaHoc.service;


import com.example.DangKyKhoaHoc.molel.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private List<Course> listCourse = new ArrayList<>();
    private void add(Course newProduct){
        listCourse.add(newProduct);
    }
    public List<Course> GetAll(){
        return listCourse;
    }
}
