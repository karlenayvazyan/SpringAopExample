package aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Objects;

/**
 * Created by karlen on 6/6/17.
 */
public class EmployeeXMLConfigAspect {

    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("EmployeeXMLConfigAspect:: Before invoking getName() method");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("EmployeeXMLConfigAspect:: After invoking getName() method. Return value="+value);
        return value;
    }
}
