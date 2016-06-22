/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pres;

import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class Presentation {
    public static void main(String[] args) {
        try {
            // DaoImpl dao= new DaoImpl();
            // MetierImpl metier=new MetierImpl();
            // metier.setDao(dao);
            // System.out.println(metier.calcule());
            Scanner scanner =new  Scanner(new File("config.txt"));
            String daoClassName=scanner.next();
            String metierClassName=scanner.next();
            Class cDao=Class.forName(daoClassName);
            IDao dao=(IDao)cDao.newInstance();//doit avoir un constructeur par defaut
            //System.out.println(dao.getTemperature());
            Class cMetier=Class.forName(metierClassName);
            IMetier metier=(IMetier)cMetier.newInstance();
            Method m=cMetier.getMethod("setMetier", new Class[]{IDao.class});
            m.invoke(metier,new Object[]{dao});
        } catch (Exception ex) {
            Logger.getLogger(Presentation.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
   
}
