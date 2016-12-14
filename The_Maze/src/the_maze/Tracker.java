/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package the_maze;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Eslam
 */
public class Tracker extends Thread {

    int Current_Location;
    ImageIcon tracker;
    ImageIcon Checked;

    public Tracker(int Current_Location) {
        this.Current_Location = Current_Location;
    }

    @Override
    public void run() {
        //set The Icons
        The_Maze.tracker_number++;
        System.out.println(The_Maze.tracker_number);
        URL tracker_boy = getClass().getResource("res/tracker_boy.png");
        URL checked = getClass().getResource("res/checked.png");

        tracker = new ImageIcon(tracker_boy);
        Checked = new ImageIcon(checked);
        The_Maze.maze_icons[Current_Location].setIcon(tracker);
        try {
            sleep(1000 - The_Maze.speed);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tracker.class.getName()).log(Level.SEVERE, null, ex);
        }
        //0=closed ,1=opend ,2=start_point ,3=finsh_point ,checked=4
        int opend = 1;
        if (The_Maze.maze_values[Current_Location] != 3 && The_Maze.maze_values[Current_Location] != 4) {

            //there is 3 setuations
            //if current location < 21 
            if (Current_Location < 20) {

                //look left
                if (The_Maze.maze_values[Current_Location - 1] == opend) {

                    Maze_Frame.e_group.execute(new Tracker(Current_Location - 1));
                    //  The_Maze.maze_values[Current_Location]=4;

                }
                //look right
                if (The_Maze.maze_values[Current_Location + 1] == opend) {

                    Maze_Frame.e_group.execute(new Tracker(Current_Location + 1));


                }
                //look down
                if (The_Maze.maze_values[Current_Location + 20] == opend) {

                    Maze_Frame.e_group.execute(new Tracker(Current_Location + 20));


                }

            }
            //if current location >20 and <381
            if (Current_Location > 20 && Current_Location < 381) {
                //look up
                if (The_Maze.maze_values[Current_Location - 20] == opend) {

                    Maze_Frame.e_group.execute(new Tracker(Current_Location - 20));

                }
                //look left
                if (The_Maze.maze_values[Current_Location - 1] == opend) {

                    Maze_Frame.e_group.execute(new Tracker(Current_Location - 1));

                }
                //look right
                if (The_Maze.maze_values[Current_Location + 1] == opend) {

                    Maze_Frame.e_group.execute(new Tracker(Current_Location + 1));
                }
                //look down
                if (The_Maze.maze_values[Current_Location + 20] == opend) {
                    Maze_Frame.e_group.execute(new Tracker(Current_Location + 20));

                }
            }
            //if current location >380
            if (Current_Location > 380) {
                //look up
                if (The_Maze.maze_values[Current_Location - 20] == opend) {
                    Maze_Frame.e_group.execute(new Tracker(Current_Location - 20));

                }
                //look left
                if (The_Maze.maze_values[Current_Location - 1] == opend) {
                    Maze_Frame.e_group.execute(new Tracker(Current_Location - 1));

                }
                //look right
                if (The_Maze.maze_values[Current_Location + 1] == opend) {
                    Maze_Frame.e_group.execute(new Tracker(Current_Location + 1));

                }

            }

        }
        if (The_Maze.maze_values[Current_Location] == 3) {
            JOptionPane.showMessageDialog(null, "Maze Solved Successfuly");
            try {
                Maze_Frame.e_group.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Tracker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        The_Maze.maze_values[Current_Location] = 4;
        The_Maze.maze_icons[Current_Location].setIcon(Checked);

        try {
            Maze_Frame.Refresh();
            sleep(1000 - The_Maze.speed);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tracker.class.getName()).log(Level.SEVERE, null, ex);
        }
        





        }

    }
}
