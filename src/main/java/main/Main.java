package main;


import main.model.Comment;
import main.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);



       //CommentService commentService1 = context.getBean(CommentService.class);
//        CommentService commentService2 = context.getBean(CommentService.class);
//
//        boolean same = commentService1 == commentService2;
//
//        System.out.println(same);

        //System.out.println("Nothing is created");

        //CommentService commentService = context.getBean(CommentService.class);


//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot parrot = context.getBean(Parrot.class);
        //System.out.println(parrot.getName());
//        parrot.setName("Kesha");
//        System.out.println(parrot.getName());

//        Comment comment = new Comment();
//        comment.setAuthor("Qarl");
//        comment.setMessage("Yo");
//        comment.setTime(1L);
//
//        CommentService commentService = context.getBean(CommentService.class);
//
//        commentService.publicComment(comment);

//        SingletonTest singletonTest = SingletonTest.getInstance();
//        CommentService commentService = context.getBean(CommentService.class);
//
//        boolean same = singletonTest == commentService.getSingletonTest();
//
//        System.out.println(same);

//        CommentService commentService1 = context.getBean("commentService1", CommentService.class);
//        CommentService commentService2 = context.getBean("commentService1", CommentService.class);
//        boolean same = commentService1 == commentService2;
//
//        System.out.println(same);

    }
}
