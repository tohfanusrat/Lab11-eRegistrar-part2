package edu.miu.cs.cs425.eregistrar.eregistrar.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @NotNull
    private String studentNumber;
    @NotNull
    private String firstName;
    private String middleName;
    @NotNull
    private String lastName;
    private Double cgpa;
    @NotNull
    private String enrollmentDate;
    @NotNull
    private String isInternational;

    public Student() {
        //This constructor is for Hibernate's use only
    }

    public Student(Long studentId,@NotNull String studentNumber, @NotNull String firstName, String middleName, @NotNull String lastName, Double cgpa, @NotNull String enrollmentDate, @NotNull String isInternational) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Student(@NotNull String studentNumber, @NotNull String firstName, String middleName, @NotNull String lastName, Double cgpa, @NotNull String enrollmentDate, @NotNull String isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public @NotNull String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(@NotNull String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public @NotNull String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public @NotNull String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public @NotNull String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(@NotNull String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public @NotNull String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(@NotNull String isInternational) {
        this.isInternational = isInternational;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) && Objects.equals(studentNumber, student.studentNumber) && Objects.equals(firstName, student.firstName) && Objects.equals(middleName, student.middleName) && Objects.equals(lastName, student.lastName) && Objects.equals(cgpa, student.cgpa) && Objects.equals(enrollmentDate, student.enrollmentDate) && Objects.equals(isInternational, student.isInternational);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentNumber, firstName, middleName, lastName, cgpa, enrollmentDate, isInternational);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", enrollmentDate=" + enrollmentDate +
                ", isInternational='" + isInternational + '\'' +
                '}';
    }
}
