package com.social.socialmedia.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="post")
public class Post {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd",iso= DateTimeFormat.ISO.DATE)
    @Column(name="created_date")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name="author")
    private User person;

    public Post() {
    }

    public Post(String title, String content, Date createdDate, User person) {
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getPerson() {
        return person;
    }

    public void setPerson(User person) {
        this.person = person;
    }
}
