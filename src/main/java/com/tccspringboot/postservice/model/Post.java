package com.tccspringboot.postservice.model;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @Column(name = "postId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "date")
    private String date;

    @Column(name = "likes")
    private Long likes;

    @Column(name = "dislikes")
    private Long dislikes;

    @Column(name = "comments")
    private ArrayList<Comment> comments;

    public Post(Long id, Long userId, String title, String body, String date, Long likes, Long dislikes, ArrayList<Comment> comments) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    //generate getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getDislikes() {
        return dislikes;
    }

    public void setDislikes(Long dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

}
