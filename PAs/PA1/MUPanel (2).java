/* CSC 120 Project/Lab #: Programming Assignment #1
 * Sam Scarton
 * September 9, 2017
 *
 * Project Description: This is my submission for PA #1.  This program displays a GUI window that displays 3 unique people, as well as 3 unique
 *                          ice cream cone combonations.  This is done through the ThingOne and ThingTwo classes, and the objects I created within them.
 *
 * Acknowledgements: N/A
 * 
 * Enhancements: My first enhancement was custom colors.  I reseached and used custom RGB color codes to create unique colors for my people objects, as
 *                          well as my ice cream cone objects.  Using custom RGB colors allows me to make my picture more accurate and interesting.
 *                          The second enhancement that I added was a custom font for my title/name.  I researched how to do this, and declared a new font
 *                          variable.  Then I instantiated it and declared the font size and style that I desired.
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
        private ThingOne th1;
        private ThingOne th2;
        private ThingOne th3;
        private ThingTwo ic1;
        private ThingTwo ic2;
        private ThingTwo ic3;
        private Font newFont;
    
    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Programming Assignment 1: Bailey Martin");
        setUp();
        setBackground(Color.WHITE);

        // 2. Instantiate objects here by calling "new":
        th1 = new ThingOne(50, 50, 50, 50, "Bob Franklin", Color.BLACK, new Color (51, 255, 255), Color.RED);
        th2 = new ThingOne(240, 150, 70, 70, "Joe Smith", Color.BLACK, new Color (153, 102, 51), Color.MAGENTA);
        th3 = new ThingOne(490, 100, 100, 100, "John White", Color.BLACK, new Color (0, 204, 0), Color.CYAN);
        ic1 = new ThingTwo (110, 130, "Oreo, Bananna, Chocolate", Color.BLACK, new Color (255, 255, 51), new Color (153, 76, 0));
        ic2 = new ThingTwo (320, 310, "Cherry, Vanilla, Blue Moon", new Color (255, 0, 0), Color.WHITE, new Color (102, 255, 255));
        ic3 = new ThingTwo (600, 280, "Blue Moon, Pumpkin, Rocky Road", new Color (102, 255, 255), Color.ORANGE, Color.BLACK);
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!
        // 3. Call methods of objects here:
          //displays the people
            th1.draw(g);
            th2.draw(g);
            th3.draw(g);
          //displays the ice cream cones
            ic1.draw(g);
            ic2.draw(g);
            ic3.draw(g);
          //prints my name and title of my artwork
            Font newFont = new Font("Serif", Font.BOLD, 24);
            g.setFont(newFont);
            g.drawString("A Summer Snapshot--By: Bailey Martin", 175, 550);
          //prints out the person (thingOne) toString()
            System.out.println (th1.toString());
            System.out.println (th2.toString());
            System.out.println (th3.toString());
          //prints out the ice cream (thingTwo) toString()
            System.out.println (ic1.toString());
            System.out.println (ic2.toString());
            System.out.println (ic3.toString());
		
    } // end of paintComponent()
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
