package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course() {
        this.enrolledStudents = new ArrayList<>();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void addStudents(Student student) {
        ArrayList<Student> students = this.getEnrolledStudents();
        students.add(student);
        this.setEnrolledStudents(students);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Course: ");
        str.append(this.topic);
        str.append("\nTeacher: ");
        str.append(this.instructor.getFirstName());
        str.append(" ");
        str.append(this.instructor.getLastName());
        str.append("\n************");
        str.append("\nStudents enrolled in ");
        str.append(this.topic);
        str.append("\n************ \n");
        for (Student s : this.enrolledStudents) {
            str.append(s.getName());
            str.append("\n");
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return topic.equals(course.topic) &&
                instructor.equals(course.instructor) &&
                enrolledStudents.equals(course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }
}
