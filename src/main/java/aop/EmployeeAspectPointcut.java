package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by karlen on 6/6/17.
 */
@Aspect
public class EmployeeAspectPointcut {

    @Before("getNamePointcut()")
    public void loggingAdvice() {
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice() {
        System.out.println("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(public String getName())")
    public void getNamePointcut() {}

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice() {
        System.out.println("Before executing service method");
    }

    @Pointcut("within(service.*)")
    public void allMethodsPointcut() {}
}
