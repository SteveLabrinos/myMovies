/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymovies;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.FavoriteList;
import model.Movie;


/**
 *
 * @author SHADOW
 */
public class MovieSearchManipulation {
    
    private Movie searchMovie;
    private String searchGenreID;
    private String searchYear;
    private int searchInt;
    private Component rootPane;    

    public MovieSearchManipulation() {
    }

    public Movie getSearchMovie() {
        return searchMovie;
    }

    public String getSearchGenreID() {
        return searchGenreID;
    }

    public String getSearchYear() {
        return searchYear;
    }

    public int getSearchInt() {
        return searchInt;
    }

    public Component getRootPane() {
        return rootPane;
    }     
    
    public void setSearchMovie(Movie searchMovie) {
        this.searchMovie = searchMovie;
    }

    public void setSearchGenreID(String searchGenreID) {
        this.searchGenreID = searchGenreID;
    }

    public void setSearchYear(String searchYear) {
        this.searchYear = searchYear;
    }

    public void setSearchInt(int searchInt) {
        this.searchInt = searchInt;
    }

    public void setRootPane(Component rootPane) {
        this.rootPane = rootPane;
    }     
    
    /*
        Μέθοδος Ανάκτησης από την Βάσει Δεδομένων των ταινιών που τηρούν
        τα κρητίρια αναζήτησης
    */
    public static List <Movie> retrieveFromDBMovieTable (String genreID, String year, Component rootPane ){
        //Ανάκτηση των κλειδιών του είδους της ταινίας
        int genre_id = 0;
        switch(genreID){
            case "Action" :  genre_id = 28;
                break;
            case "Romance" : genre_id = 10749;
                break;
            case "Science Fiction" : genre_id = 878;
                break;        
        } 
        // Λίστα αποθήκευσης αποτελεσμάτων αναζήτησης
        List <Movie> movieSearchList = new ArrayList<>();
        // Ερώτημα στην Βάση Δεδομένων και τοποθέτηση της απάντησης στην λίστα
        try {    
            movieSearchList = MainMenu.em.createNamedQuery(
                "Movie.findByGenreAndYear",Movie.class).setParameter("genre_id",genre_id)
                .setParameter("year",year).getResultList();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Παρακαλώ επιλέξτε Τύπο ταινίας"
                    + "\nκαι έτος κυκλοφορίας της","Μήνυμα",JOptionPane.ERROR_MESSAGE);
        } 
        
        return movieSearchList;        
    } 
    
    //Μέθοδος Ανάκτησης των Αγαπημένων Λιστών από την Βάση Δεδομένων 
    public static FavoriteList retrieveFavoriteListFromDB(int index, Component rootPane)
            throws ArrayIndexOutOfBoundsException{
         
        List <FavoriteList> favoriteList = new ArrayList<>();       
        favoriteList = MainMenu.em.createNamedQuery(
           "FavoriteList.findAll",FavoriteList.class).getResultList();        
        
        FavoriteList movieFavoriteList = favoriteList.get(index);
            return movieFavoriteList;       
    }
    
    //Μέθοδος ανανέωσης ταινιων στη Βάση Δεδομένων
    public static void updateMovieTabLe (){
        
        MainMenu.em.getTransaction().begin();
               
        MainMenu.em.getTransaction().commit();          
        
    }  
    
}
