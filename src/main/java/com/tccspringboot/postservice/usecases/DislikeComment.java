package com.tccspringboot.postservice.usecases;

import com.tccspringboot.postservice.model.Comment;
import com.tccspringboot.postservice.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class DislikeComment {

    private static CommentService service;

    public DislikeComment(CommentService service) {
        this.service = service;
    }

    public static Comment dislikeComment(Long id, Long userId) {

        Comment comment = service.getCommentById(id);

        //comment.getLikes().remove(userId);

        return service.updateComment(comment);
    }

}
