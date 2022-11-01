package com.tccspringboot.postservice.service;

import com.tccspringboot.postservice.model.Comment;
import com.tccspringboot.postservice.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment getCommentById(Long id) {
        try {
            return commentRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    public Comment[] getAllCommentsByPostId(Long id) {
        try {
            return commentRepository.findAll().stream().filter((comment -> comment.getPostId() == id)).toArray( Comment[]::new );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Comment createComment(Comment comment) {
       try {
           return commentRepository.save(comment);
       } catch (Exception e) {
           e.printStackTrace();
           throw  e;
       }
    }

    public Comment updateComment(Comment comment) {
       try {
                return commentRepository.save(comment);
            } catch (Exception e) {
                e.printStackTrace();
                throw  e;
            }
    }

    public Comment deleteCommentById(Long id) {


        try {
            Comment comment = commentRepository.findById(id).get();
            commentRepository.delete(comment);
            return comment;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    

}
