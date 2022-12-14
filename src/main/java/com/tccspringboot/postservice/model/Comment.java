package com.tccspringboot.postservice.model;


import javax.persistence.*;


@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "post_id")
    private Long postId;
    
    @Column(name = "user_id")
    private Long user;
    
    @Column(name = "content")
    private String content;
    
    @Column(name = "comment_date")
    private String date;

    @Column(name = "likes")
    private Long likes;
    
    @Column(name = "dislikes")
    private Long dislikes;

    public Comment() {}
    
    public Comment(Long id, Long postId, Long user, String content, String date, Long likes, Long dislikes) {

        this.id = id;
        this.postId = postId;
        this.user = user;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}
}
