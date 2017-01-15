package org.laptech.gws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

/**
 * @author rlapin on 12/12/16.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    @Value("${connection.username}")
    String value;
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }


    @PostConstruct
    public void test(){
        System.out.println(value);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
