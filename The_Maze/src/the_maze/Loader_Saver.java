/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the_maze;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Eslam
 */
public class Loader_Saver {
    int[] maze;
    File maze_file;
    
    public int[] get_maze() throws FileNotFoundException, IOException{
      maze_file =new File("a.txt");
        FileInputStream m = null;
      byte[] data=maze_file.toString().getBytes();
      
        for (int i = 0; i < data.length; i++) {
            
            if((char)data[i]==' ' || (char)data[i]=='\n')
            System.out.println((char)data[i]);  
        }
        File ss=new File("xxx.txt");
        ss=maze_file;
        FileOutputStream file=new FileOutputStream(ss);
      
      file.close();
    
    
    
    return null;}
   
}
