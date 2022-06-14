package com.comment.commentapp.controllers;

import com.comment.commentapp.models.BlogWithComment;
import com.comment.commentapp.models.Comment;
import com.comment.commentapp.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/save")
    public String save(@RequestBody Comment comment) {
        commentService.save(comment);
        return "saved successfully";
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Comment comment) {
        commentService.save(comment);
        return "Edited successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        commentService.deleteById(id);
        return "Deleted Successfully";
    }

    @GetMapping("/getByBlogId/{id}")
    public BlogWithComment getByBlogId(@PathVariable Long id) {
        List<Comment> comments = commentService.getByBlogId(id);
        BlogWithComment bwc = new BlogWithComment();
        bwc.setComments(comments);
        return bwc;
    }
}
