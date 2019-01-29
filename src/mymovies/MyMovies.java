package mymovies;
/**
 *
 * @author Labrinos
 */
import javax.swing.JOptionPane;
public class MyMovies {

    public static void main(String[] args) {
        // first line of code to test work enviroment
        //1rst change made
        final String INITMESSAGE="Hello Universe - ";
        
        //Steve's contribution to the file111
        TestClass steve=new TestClass("Periklis");
        JOptionPane.showMessageDialog(null,INITMESSAGE.concat(steve.getName())); 
        //create your object then put your welcome message to the team here
    } 
}
