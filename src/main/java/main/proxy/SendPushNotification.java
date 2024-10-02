package main.proxy;

import main.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pushNotification")
public class SendPushNotification implements NotifyUsers{

    @Override
    public void sendNotification(Comment comment){
        System.out.println("Sending push notification - " + comment.getAuthor());
    }
}
