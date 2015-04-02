package com.mdhkabir.hello1;

/**
 * @author humayun
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();

        Employee employee = ctx.getBean(Employee.class);

        System.out.println(employee.getEmployee(1));

    }
}