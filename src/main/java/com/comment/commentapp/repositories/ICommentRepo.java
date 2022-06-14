package com.comment.commentapp.repositories;

import com.comment.commentapp.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentRepo extends JpaRepository<Comment, Long> {
    @Query("select c from Comment  c where c.BlogId =:blogId")
    List<Comment> getByBlogId(@Param("blogId") Long blogId);
}
