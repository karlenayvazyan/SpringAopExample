package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by karlen on 6/6/17.
 */
@Aspect
public class EmployeeAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice() {
        System.out.println("Executing Advice on getName()");
    }

    @Before("execution(* service.*.get*())")
    public void getAllAdvice() {
        System.out.println("Service method getter called");
    }
}
