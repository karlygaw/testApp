package main;

import main.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* main.service.*.*(..))")
    public Object logging(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Method started: " + proceedingJoinPoint.getSignature());
        Object[] originalParams = proceedingJoinPoint.getArgs();



        Comment comment = new Comment();
        comment.setAuthor("Frank");
        comment.setMessage("Very bad!");
        comment.setTime(123456L);

        Object[] newParam = {comment};

        Object result = proceedingJoinPoint.proceed(newParam); // Вызов целевого метода
        logger.info("Method finished: " + proceedingJoinPoint.getSignature());

        result = "Fail";
        return result;
    }
}

