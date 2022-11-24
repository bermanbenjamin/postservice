package com.tccspringboot.postservice.delivery;

import com.tccspringboot.postservice.model.Comment;
import com.tccspringboot.postservice.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private static CommentService service;

    @GetMapping("/{id}")
    public static ResponseEntity getCommentById(@PathVariable("id")Long id) {
      try {
          return ResponseEntity.ok(service.getCommentById(id));
      } catch (Exception e) {
          e.printStackTrace();
          return ResponseEntity.badRequest().body(e.getMessage());
      }
    }

    @GetMapping("/post/{id}")
    public static ResponseEntity getAllCommentsByPostId(@PathVariable("id")Long id) {
        try  {
            return ResponseEntity.ok(service.getAllCommentsByPostId(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/create")
    public static ResponseEntity createComment(@RequestBody Comment comment) {
       try
         {
              return ResponseEntity.ok(service.createComment(comment));
         } catch (Exception e) {
              e.printStackTrace();
              return ResponseEntity.badRequest().body(e.getMessage());
         }
    }

    @PutMapping("/update/{id}")
    public static ResponseEntity<Comment> updateComment(@PathVariable("id")Long id, @RequestBody Comment comment) {
        try {
               return ResponseEntity.ok(service.updateComment(comment));
            } catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.badRequest().body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public static ResponseEntity<Comment> deleteComment(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(service.deleteCommentById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }

}
