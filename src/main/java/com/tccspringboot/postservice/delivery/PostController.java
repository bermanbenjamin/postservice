package com.tccspringboot.postservice.delivery;

import com.tccspringboot.postservice.model.Post;
import com.tccspringboot.postservice.service.PostService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.logging.Logger;

@RestController("/posts")
@RequestMapping("/posts")
public class PostController {

    private static PostService service;

    private static Logger logger = Logger.getLogger(PostController.class.getName());

    public PostController(PostService service) {
        this.service = service;
    }

    //get post by id
    @GetMapping("/{id}")
    public static ResponseEntity getPostById(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(service.getPostById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e);
        }
    }


    //get all posts
    @GetMapping("/all")
    public static Post[] getAllPosts() {
        return service.getAllPosts();
    }

    //get all posts by user id
    @GetMapping("/user/{id}")
    public static Post[] getAllPostsByUserId(@PathVariable("id")Long id) {
        return service.getAllPostsByUserId(id);
    }

    //create post
    @PostMapping("/create")
    public static Post createPost(@RequestBody Post post) {
        return service.createPost(post);
    }

    //update post
    @PutMapping("/update")
    public static Post updatePost(@RequestBody  Post post) {
        return service.updatePost(post);
    }

    //delete post
    @GetMapping("/delete")
    public static Post deletePost(@RequestBody Post post) {
        return service.deletePost(post);
    }


}

