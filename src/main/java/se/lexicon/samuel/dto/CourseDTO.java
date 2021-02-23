package se.lexicon.samuel.dto;

import se.lexicon.samuel.model.Student;

import java.time.LocalDate;
import java.util.List;

//connect to studentDTO but it can lead to cyclic dependency
public class CourseDTO {

    private String courseId;
    private String courseName;
    private LocalDate start;
    private LocalDate end;
    private List<StudentDTO> students;

    //create your setters and getters

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }
}
