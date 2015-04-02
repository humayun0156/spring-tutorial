package com.mdhkabir.hello1;

/**
 * @author humayun
 */
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mdhkabir.hello1")
public class AppConfig {
    @PostConstruct
    public void doSomething() {
        System.out.println("Done from App Config side");
    }

}