package com.social.socialmedia.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="person")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="university")
    private String university;

    @Column(name="mail")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="birthday")
    private Date birthDay;

    @Column(name="created_date")
    private Date createDate;

    @Column(name="job")
    private String job;

    @Column(name="location")
    private String location;

    @OneToOne
    @JoinColumn(name="role_id")
    private Role role;

    public User() {
    }

    public User(String firstName, String lastName, String university, String email, String password, Date birthDay, Date createDate, String job, String location, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
        this.email = email;
        this.password = password;
        this.birthDay = birthDay;
        this.createDate = createDate;
        this.job = job;
        this.location = location;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
