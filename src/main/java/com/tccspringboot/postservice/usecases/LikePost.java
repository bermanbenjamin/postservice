package com.tccspringboot.postservice.usecases;

import com.tccspringboot.postservice.model.Post;
import com.tccspringboot.postservice.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class LikePost {

     private static PostService service;

    public LikePost(PostService service) {
        this.service = service;
    }

    public static Post likePost(Long id, Long userId) {

        service.getPostById(id).getLikes().add(userId);

        return service.updatePost(service.getPostById(id));

    }
}
