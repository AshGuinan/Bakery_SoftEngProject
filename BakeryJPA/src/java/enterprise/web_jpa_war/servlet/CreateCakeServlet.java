package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.Cake;
import enterprise.web_jpa_war.entity.CakeFacade;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.transaction.UserTransaction;



/**
 * The sevelet class to insert Cake into database
 */
@WebServlet(name="CreateCakeServlet", urlPatterns={"/CreateCake"})
public class CreateCakeServlet extends HttpServlet {
   @EJB
   private CakeFacade cakeFacade;
    
    @PersistenceUnit
    //The emf corresponding to 
    private EntityManagerFactory emf;  
    
    @Resource
    private UserTransaction utx;
    
    

    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
      
       throws ServletException {
        assert emf != null;  //Make sure injection went through correctly.
        EntityManager em = null;
        try {
            
            //Get the data from user's form
            String ID = (String) request.getParameter("ID");
            String cakeName = (String) request.getParameter("CakeName");
            String ingredients  = (String) request.getParameter("Ingredients");
            int stock   = Integer.parseInt(request.getParameter("Stock"));
            
            //Create a cake instance out of it
            Cake cake = new Cake(ID, cakeName, ingredients, stock);
            //teh facade classes do all the work
            cakeFacade.create(cake);
           
            //Forward to ListCake servlet to list cakes along with the newly
            //created cake above
            request.getRequestDispatcher("ListCake").forward(request, response);
        } catch (Exception ex) {
            throw new ServletException(ex);
        } finally {
            //close the em to release any resources held up by the persistebce provider
            if(em != null) {
                em.close();
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
