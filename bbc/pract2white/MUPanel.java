/* CSC 120
 * Practicum # 2
 *
 * Samantha Student
 *
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    
	

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Practicum # 2, by Samantha Student");
        setUp();
        setBackground(Color.WHITE);

    
	
	
	
	
	
	
    } // end of constructor
    
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!






	
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
