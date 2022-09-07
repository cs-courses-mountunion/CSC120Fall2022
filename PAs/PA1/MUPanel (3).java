/* CSC 120 Project/Lab PA #1
 * Joe Schmoe
 * 9/7/17
 *
 * Project Description:
    Stick Figures prepareing for war

    Enhancements Include
    New Color RGB Code
    Polygon drawings
 *
 * Acknowledgements:
 * 
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
        private StickFigure guy1, guy2, guy3;
        private Sword swd1, swd2, swd3;
        
    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(700, 700));
        setName("Time For War");
        setUp();
        setBackground(Color.WHITE);

        // 2. Instantiate objects here by calling "new":
        
        guy1 = new StickFigure(100, 300);
        guy2 = new StickFigure(300, 300);
        guy3 = new StickFigure(500, 300);
        swd1 = new Sword(200, 455, new Color(204, 51, 51)); // Red
        swd2 = new Sword(400, 455, new Color(51, 153, 255)); // Blue
        swd3 = new Sword(600, 455, new Color(255, 255, 51)); //Yellow
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call methods of objects here:
        g.setColor(new Color(51, 204, 255));
        g.fillRect(0, 0, 700, 200);
        g.setColor(Color.GREEN);
        g.fillRect(0, 200, 700, 500);
        guy1.draw(g);
        guy2.draw(g);
        guy3.draw(g);
        swd1.draw(g);
        swd2.draw(g);
        swd3.draw(g);
        g.setColor(Color.BLACK);
        g.setFont( new Font("ComicSans", Font.PLAIN, 20) );
        g.drawString("Army Preparing For War by Austin Mickey", 100, 100);
		
		
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
