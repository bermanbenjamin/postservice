package com.tccspringboot.postservice.usecases;

import com.tccspringboot.postservice.model.Comment;
import com.tccspringboot.postservice.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LikeComment {

    private static CommentService service;

    public LikeComment(CommentService service) {
        this.service = service;
    }

    public static Comment likeComment(Long id, Long userId) {

       Comment comment = service.getCommentById(id);

     //  comment.getLikes().add(userId);

       return service.updateComment(comment);
    }
}
