package com.tccspringboot.postservice.usecases;

import com.tccspringboot.postservice.model.Post;
import com.tccspringboot.postservice.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class DislikePost {

        private static PostService service;

        public DislikePost(PostService service) {
            this.service = service;
        }

        public static Post dislikePost(Long id, Long userId) {

           // service.getPostById(id).getLikes().remove(userId);

            return service.updatePost(service.getPostById(id));

        }
}
