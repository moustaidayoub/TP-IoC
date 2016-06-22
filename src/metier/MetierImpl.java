/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.IDao;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class MetierImpl implements IMetier{
    private IDao dao;
    @Override
    public double calcule() {
        double val=dao.getTemperature();
        return val*10;
    }
    
    public  void setDao(IDao dao)
    {
    this.dao=dao;
    }
    
}
