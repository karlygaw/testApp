package main.repository;

import main.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentRepositoryImpl implements CommentRepository {

    public void storeComment(Comment comment){
        System.out.println("Saving next comment" + comment.getMessage());
    }
}
