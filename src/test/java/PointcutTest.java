import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;

/**
 * Created by karlen on 6/4/17.
 */
public class PointcutTest {

    @Test
    public void testTransferXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        System.out.println(employeeService.getEmployee().getName());

        employeeService.getEmployee().setName("Kal");

        employeeService.getEmployee().throwException();
    }
}
