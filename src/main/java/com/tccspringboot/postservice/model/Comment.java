package com.tccspringboot.postservice.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long postId;
    private Long userId;
    private String body;
    private String date;
    private Long likes;
    private Long dislikes;

    public Comment(Long id, Long postId, Long userId, String body, String date, Long likes, Long dislikes) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.body = body;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    //generate getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
}
