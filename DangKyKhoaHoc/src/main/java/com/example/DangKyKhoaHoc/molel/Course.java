package com.example.DangKyKhoaHoc.molel;

import java.time.LocalDate;

public class Course {
    private int id;
    private String lectureName;
    private String place;
    private LocalDate startdate;

    public Course(int id, String lectureName, String place, LocalDate startdate) {
        this.id = id;
        this.lectureName = lectureName;
        this.place = place;
        this.startdate = startdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", lectureName='" + lectureName + '\'' +
                ", place='" + place + '\'' +
                ", startdate=" + startdate +
                '}';
    }
}
