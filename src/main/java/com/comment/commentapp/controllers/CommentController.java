package com.comment.commentapp.controllers;

import com.comment.commentapp.models.Comment;
import com.comment.commentapp.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/save")
    public String save(@RequestBody Comment comment)
    {
        commentService.save(comment);
        return "saved successfully";
    }
    @PutMapping("/edit")
    public String edit(@RequestBody Comment comment)
    {
        commentService.save(comment);
        return "Edited successfully";
    }
}
