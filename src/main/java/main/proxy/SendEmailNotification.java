package main.proxy;

import main.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("emailNotification")
public class SendEmailNotification implements NotifyUsers{

    @Override // не забываем обьявлять оферрайд потому что нам нужно показывать что класс был обьявлен в интерфейсе выше
    public void sendNotification(Comment comment){
        System.out.println("Sending email to - " + comment.getAuthor());

    }
}
