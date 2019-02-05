package mymovies;
/**
 *
 * @author Labrinos
 */
import model.*;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

public class MyMovies {

    public static void main(String[] args) {
        // Creation of Entity Manager Facttory at the start of the program
        EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myMoviesPU");
        EntityManager em=managerFactory.createEntityManager();
        
        //Start of main menu
        
 
      
        
        //  Closing Entity Manager at the end of the program
        em.close();
        managerFactory.close();
    } 
    
    //test line 
    //iliana
}
