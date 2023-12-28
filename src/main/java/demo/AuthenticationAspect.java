package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut() {

    }
    @Pointcut("within(demo.ShoppingCart.*)")
    public void authorizationPointCut() {

    }
}
