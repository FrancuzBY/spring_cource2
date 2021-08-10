package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("exceptionHandlingAspect")
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: except get the book or magazine");
        System.out.println("---------------------------------------------------");
    }
}
