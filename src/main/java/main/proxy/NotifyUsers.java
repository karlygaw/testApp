package main.proxy;

import main.model.Comment;

public interface NotifyUsers {

    void sendNotification(Comment comment);
}
