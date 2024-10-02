package main.service;

import main.SingletonTest;
import main.model.Comment;
import main.proxy.NotifyUsers;
import main.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;
import main.model.Comment;

//@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());


//    public CommentService(){
//
//    }

//    private final NotifyUsers notifyUsers;
//
//    private final CommentRepository commentRepository;
//
//    private SingletonTest singletonTest;
//
//    @Autowired
//    public CommentService(@Qualifier("emailNotification") NotifyUsers notifyUsers, CommentRepository commentRepository){
//        this.commentRepository = commentRepository;
//        this.notifyUsers = notifyUsers;
//        singletonTest = SingletonTest.getInstance();
//    }


    public void publicComment(Comment comment){
//        System.out.println("Publishing comment - " + comment);
//        commentRepository.storeComment(comment);
//        notifyUsers.sendNotification(comment);

        logger.info("Publisging a comment -  " + comment.getMessage() + "Author" + comment.getAuthor());
    }

//    public SingletonTest getSingletonTest() {
//        return singletonTest;
//    }

}
