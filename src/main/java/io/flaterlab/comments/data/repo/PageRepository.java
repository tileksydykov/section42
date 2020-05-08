package io.flaterlab.comments.data.repo;

import io.flaterlab.comments.data.models.Comment;
import io.flaterlab.comments.data.models.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByPage(Page p);
}