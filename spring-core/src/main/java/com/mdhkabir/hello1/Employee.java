package com.mdhkabir.hello1;

/**
 * @author humayun
 */
import org.springframework.stereotype.Component;
@Component
public class Employee {

    public String getEmployee(int empId) {
        System.out.println("execute method..");
        if (empId == 1) {
            return "Ankita";
        } else {
            return "Renu";
        }
    }
}