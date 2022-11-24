package com.tccspringboot.postservice.delivery;

import com.tccspringboot.postservice.model.Post;
import com.tccspringboot.postservice.service.PostService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.logging.Logger;

@RestController
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
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    //get all posts
    @GetMapping("/all")
    public static ResponseEntity getAllPosts() {
        try {
            return ResponseEntity.ok(service.getAllPosts());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //get all posts by user id
    @GetMapping("/user/{id}")
    public static ResponseEntity getAllPostsByUserId(@PathVariable("id")Long id) {
        try {
            return ResponseEntity.ok(service.getAllPostsByUserId(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //create post
    @PostMapping("/create")
    public static ResponseEntity createPost(@RequestBody Post post) {
       try {
           return ResponseEntity.ok(service.createPost(post));
       } catch (Exception e) {
           e.printStackTrace();
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }

    //update post
    @PutMapping("/update")
    public static ResponseEntity updatePost(@RequestBody  Post post) {
       try {
           return ResponseEntity.ok(service.updatePost(post));
       } catch (Exception e) {
           e.printStackTrace();
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }

    //delete post
    @DeleteMapping("/delete")
    public static ResponseEntity deletePost(@RequestBody Post post) {
       try {
           return ResponseEntity.ok(service.deletePost(post));
       } catch (Exception e) {
           e.printStackTrace();
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }


}

