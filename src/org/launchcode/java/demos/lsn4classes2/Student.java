package org.launchcode.java.demos.lsn4classes2;

import java.text.DecimalFormat;
import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        String gradeLevel = "Freshman";
        if (this.getNumberOfCredits() >= 90) {
            gradeLevel = "Senior";
        } else if (this.getNumberOfCredits() >= 60 && this.getNumberOfCredits() < 90) {
            gradeLevel = "Junior";
        } else if (this.getNumberOfCredits() >= 30 && this.getNumberOfCredits() < 60) {
            gradeLevel = "Sophomore";
        }
        return gradeLevel;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        DecimalFormat df = new DecimalFormat("#.0");
        double currentTotalQualityScore = this.getGpa() * this.getNumberOfCredits();
        double newQualityScore = grade * courseCredits;
        double newGpa = (currentTotalQualityScore + newQualityScore) / (this.getNumberOfCredits() + courseCredits);
        setGpa(Double.parseDouble(df.format(newGpa)));
        setNumberOfCredits(this.getNumberOfCredits() + courseCredits);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name);
        str.append(" is a ");
        str.append(this.getGradeLevel());
        str.append(" and has a ");
        str.append(gpa);
        str.append(" gpa with ");
        str.append(numberOfCredits);
        if (this.numberOfCredits == 1) {
            str.append(" credit.");
        } else {
            str.append(" credits.");
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println();

        Teacher teacher = new Teacher("Denis", "Duarte", "Math", 1);
        Student crystal = new Student("Crystal Castillo");
        Course course = new Course();
        course.setTopic("Math");
        course.setInstructor(teacher);
        course.addStudents(sally);
        course.addStudents(crystal);
        System.out.println(course);
    }
}
