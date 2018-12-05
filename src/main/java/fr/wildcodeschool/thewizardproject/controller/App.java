package fr.wildcodeschool.thewizardproject.controller;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public void start(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myGandalf = context.getBean("thisisGandalf", WizardInterface.class);
        context.close();
        System.out.println("");
        System.out.println("******************");
        System.out.println(myGandalf.giveAdvice());
        System.out.println(myGandalf.changeDress());
        System.out.println("******************");

        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myDumbledore = context2.getBean("thisisDumbledore", WizardInterface.class);
        context.close();
        System.out.println("");
        System.out.println("******************");
        System.out.println(myDumbledore.giveAdvice());
        System.out.println(myDumbledore.changeDress());
        System.out.println("******************");
    }
}
