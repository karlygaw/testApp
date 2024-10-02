package main;

//import org.springframework.context.annotation.Bean;
import main.service.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {
// 1й способ добавления в контекст
//    @Bean
//    Parrot parrot(){
//        Parrot parrot = new Parrot();
//        parrot.setName("Kesha");
//        return parrot;
//    }
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    //@Lazy //этот бин создается не сразу а тогда когда нам понадобится
    CommentService commentService(){
        return new CommentService();
    }

//    @Bean
//    CommentService commentService2(){
//        return new CommentService();
//    }

}
