package com.akshay;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.akshay")
@ComponentScan(basePackages = "com.akshay")
@EnableCaching
public class Application {

    private final static Logger logger = LoggerFactory.getLogger(Application.class);
    public static ApplicationContext ctx;

    public static void main(String[] args) {

//        ctx = SpringApplication.run(Application.class, args);
//        logger.info("*************Application Started***************");
//        DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
//        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }

}
