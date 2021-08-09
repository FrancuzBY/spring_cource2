package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("securityAspect")
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Checking the rights to recieve the book/magazine.");
    }

}
