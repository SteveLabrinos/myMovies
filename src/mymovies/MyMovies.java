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
        final String INITMESSAGE="Hello World - ";
        
        //Steve's contribution to the file1115
        TestClass steve=new TestClass("Steve");
        JOptionPane.showMessageDialog(null,INITMESSAGE.concat(steve.getName())); 
        //create your object then put your welcome message to the team here
    } 
}
