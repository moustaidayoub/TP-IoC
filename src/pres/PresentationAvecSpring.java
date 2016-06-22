/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pres;

import metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class PresentationAvecSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println(metier.calcule());
       
    }
    
}
