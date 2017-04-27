package com.spring.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MailerTest {
 
    public static void main(String[] args) 
    {
        //Create the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
         
        //Get the mailer instance
        ApplicationMailer mailer = (ApplicationMailer) context.getBean("mailService");
 
        //Send a composed mail
        mailer.sendMail("sendto@gmail.com", "Tesing Spring mailsender", "Hi , hru? Testing Spring mail sender body");
 
        //Send a pre-configured mail
        mailer.sendPreConfiguredMail("Exception occurred everywhere.. where are you ????");
    }
}