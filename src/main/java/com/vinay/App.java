package com.vinay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
   
        Dev d1 = (Dev) con.getBean("dev1");
        // System.out.println(d1.getVal());
        d1.build();
    }
}
