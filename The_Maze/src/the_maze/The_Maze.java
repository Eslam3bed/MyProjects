/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the_maze;

import java.awt.Color;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import sun.misc.Resource;

/**
 *
 * @author Eslam
 */
public class The_Maze {
  public static   int[] maze_values;
  static  JLabel[] maze_icons;
  public static int tracker_number;
   public static int speed;
 public void get_thePlain()throws NullPointerException{
     maze_values=new int[400];
     maze_icons=new JLabel[400];
     
   
    this.maze_values=Maze_Genarator();
      URL block=getClass().getResource("res/block.png");
     
     ImageIcon closed = new ImageIcon(block);
     URL opened = getClass().getResource("res/opened.png");
     ImageIcon openedi = new ImageIcon(opened);
     URL doors = getClass().getResource("res/doors.png");
     ImageIcon door = new ImageIcon(doors);

     for (int i = 0; i < maze_icons.length; i++) {
         if (maze_values[i] == 0) {
             maze_icons[i] = new JLabel(closed);
             maze_icons[i].setSize(30, 30);
             Maze_Frame.game_plain.add(maze_icons[i]);
             //   maze_icons[i][j].setBackground(Color.BLUE);
         }
         if (maze_values[i] == 1 || maze_values[i] == 2) {
             maze_icons[i] = new JLabel(openedi);
             maze_icons[i].setSize(30, 30);
             Maze_Frame.game_plain.add(maze_icons[i]);

         }
         if (maze_values[i] == 3) {
             maze_icons[i] = new JLabel(door);
             maze_icons[i].setSize(30, 30);
             Maze_Frame.game_plain.add(maze_icons[i]);

         }

     }

}
public int[] Maze_Genarator(){
   Random R=new Random(5);
   int r=R.nextInt();
   int[] maze;
   switch (8){
       case 1:
             int maze_values1[] = {
        
      0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0
     ,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0
     ,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0
     ,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,0,0,1,0,0,0,1,1,1,0,1,1,1,1,1,0,0
     ,0,1,1,1,1,1,0,0,0,1,0,1,0,1,0,0,0,0,0,0
     ,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0
     ,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,0,0,0
     ,0,0,1,0,0,1,0,1,0,1,1,1,0,0,0,0,0,0,0,0
     ,0,0,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,0,0
     ,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0
     ,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0
     ,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,3,0,0
 };
maze=maze_values1;         
             
           break;
       case 2:
            int maze_values2[] = {
        
      0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0
     ,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,0
     ,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0
     ,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,1,0
     ,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,1,0
     ,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0
     ,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,0,0,1,0,0,0,1,1,1,0,0,1,1,1,1,0,0
     ,0,1,1,1,1,1,0,0,0,1,0,1,0,1,1,0,0,0,0,0
     ,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0
     ,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,1,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,0
     ,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0
     ,0,0,1,1,1,1,0,1,0,0,0,1,1,1,1,1,1,1,0,0
     ,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0
     ,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0
     ,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,1,3,0
 };
maze=maze_values2;     
           break;
       case 3:
            int maze_values3[] = {
        
      0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0
     ,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0
     ,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0
     ,0,1,1,1,0,0,1,1,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,1,1,1,0,1,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,0,0,1,0,1,0,1,1,1,0,0,1,1,1,1,0,0
     ,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,0,0,0
     ,0,1,0,1,0,0,0,1,1,1,0,1,0,1,0,1,1,0,0,0
     ,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,0
     ,0,0,1,0,0,1,0,1,0,1,1,1,0,0,0,0,0,0,0,0
     ,0,0,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,0,0
     ,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0
     ,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0
     ,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,1,3,0
 };
maze=maze_values3;     
           break;
       case  4:
            int maze_values4[] = {
        
      0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0
     ,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0
     ,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0
     ,0,1,1,1,0,2,1,1,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,0,0,1,0,1,0,1,1,1,0,0,1,1,1,1,0,0
     ,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,0,0,0
     ,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0
     ,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,0
     ,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0
     ,0,0,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,0,0
     ,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0
     ,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0
     ,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,1,3,0
 };
maze=maze_values4;     
           break;
       case 5:
            int maze_values5[] = {
        
      0,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0
     ,0,0,1,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,0,0
     ,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,0
     ,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0
     ,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0
     ,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0
     ,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,0,0,1,0,0,0,1,1,1,0,0,1,1,1,1,0,0
     ,0,1,1,1,1,1,0,0,0,1,0,1,0,1,1,0,0,0,0,0
     ,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0
     ,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,0
     ,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0
     ,0,0,1,0,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,0
     ,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0
     ,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0
     ,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,1,3,0
 };
maze=maze_values5;     
           break;
           default:
                int maze_values6[] = {
        
      0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0
     ,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0
     ,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0
     ,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0
     ,0,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0
     ,0,1,0,0,0,1,0,0,0,1,1,1,0,0,1,1,1,1,0,0
     ,0,1,1,1,1,1,0,0,0,1,0,1,0,1,1,0,0,0,0,0
     ,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0
     ,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0
     ,0,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,0
     ,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0
     ,0,0,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,0,0
     ,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0
     ,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0
     ,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,1,3,0,0
 };
maze=maze_values6;     
               break;
               
                 
   
   
   }
    
    
    
    
    
    return maze;
}    
    
    
}