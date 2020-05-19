package teinehomework;

import java.time.ZonedDateTime;

public class Course {

    private String name;
    private int eap;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private Teacher teacher;

    //constructor
    public Course(String name, int eap, ZonedDateTime startDate, ZonedDateTime endDate, Teacher teacher) {
        this.name = name;
        this.eap = eap;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacher = teacher;
    }

    //getter and setter
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }
}
