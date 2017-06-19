package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by karlen on 6/6/17.
 */
@Aspect
public class EmployeeAnnotationAspect {

    @Before("@annotation(annotation.Loggable)")
    public void myAdvice() {
        System.out.println("Executing myAdvice!!");
    }
}
