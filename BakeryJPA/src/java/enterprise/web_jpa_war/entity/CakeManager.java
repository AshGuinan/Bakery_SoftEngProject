/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise.web_jpa_war.entity;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tgiunipero
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CakeManager 
{
    //uses the cakeFacade class
    @EJB
    private CakeFacade cakeFacade;
    

    @PersistenceContext(unitName = "web-jpaPU")
    private EntityManager em;
    @Resource
    private SessionContext context;

    //takes teh cake input data and inputs it into db
    private Cake addCake(String ID, String CakeName, String Ingriedients, int stock) 
    {

        Cake cake = new Cake(ID, CakeName, Ingriedients, stock);
        
        cakeFacade.create(cake);
        em.flush();
        return cake;
        
            //Create a cake instance out of it
            
    }
    //takes teh cake data, finds it adn then removes it from the db
    private void deleteCake(String ID, String CakeName, String Ingriedients, int stock) 
    {

        Cake cake = cakeFacade.find(ID);
                //new Cake(ID, CakeName, Ingriedients, stock);
        
        cakeFacade.remove(cake);
        em.flush();
        
        
            //Create a cake instance out of it
            
    }

    

    
}