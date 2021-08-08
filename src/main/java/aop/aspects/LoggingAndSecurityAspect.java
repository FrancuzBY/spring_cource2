package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("loggingAspectBean")
@Aspect
public class LoggingAndSecurityAspect {

    @Before("execution(* get*())")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: trying to get a book/magazine");
    }

    @Before("execution(* get*())")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Сhecking the rights to recieve the book/magazine.");
    }


}
