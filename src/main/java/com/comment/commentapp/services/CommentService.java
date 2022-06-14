package com.comment.commentapp.services;

import com.comment.commentapp.models.Comment;
import com.comment.commentapp.repositories.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CommentService {
    @Autowired
    private ICommentRepo commentRepo;

    public void save(Comment comment)
    {
        commentRepo.save(comment);
    }

    public String deleteById(@PathVariable Long id) {
        commentRepo.deleteById(id);
        return "Deleted Successfully";
    }
}
