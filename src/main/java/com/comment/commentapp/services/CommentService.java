package com.comment.commentapp.services;

import com.comment.commentapp.models.Comment;
import com.comment.commentapp.repositories.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private ICommentRepo commentRepo;

    public void save(Comment comment)
    {
        commentRepo.save(comment);
    }
}
