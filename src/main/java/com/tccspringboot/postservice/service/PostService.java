package com.tccspringboot.postservice.service;

import com.tccspringboot.postservice.model.Post;
import com.tccspringboot.postservice.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getPostById(Long id) {
        try {
            return postRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    public Post[] getAllPosts() {
        try {
        return postRepository.findAll().toArray(new Post[0]);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Post[] getAllPostsByUserId(Long id) {
        try {
            return postRepository.findAll().stream().map((post -> post.getId() == id)).toArray( Post[]::new );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Post createPost(Post post) {
        try {
            return postRepository.save(post);
        } catch (Exception e) {
            e.printStackTrace();
            throw  e;
        }
    }

    public Post updatePost(Post post) {
        try {
            return postRepository.save(post);
        } catch (Exception e) {
            e.printStackTrace();
            throw  e;
        }
    }

    public Post deletePost(Post post) {

        try {
            postRepository.delete(post);
            return post;
        } catch (Exception e) {
            e.printStackTrace();
            throw  e;
        }
    }

}
