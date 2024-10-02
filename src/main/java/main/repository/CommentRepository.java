package main.repository;

import main.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
