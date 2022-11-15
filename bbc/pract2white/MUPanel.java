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
        setPreferredSize(new Dimension(1000, 600));
        setName("Practicum # 2 authored by Samantha Student");
        setUp();
        setUpTextArea();
        setBackground(Color.YELLOW);

        
        
        

        //*** 
        //    You must instantiate the array with the proper number of elements before this point
        //
        //    Here is information for instantiating each element of the array:
        //
        //    Boutros Boutros-Ghali is not alive and was Sec.-General from 1992 to 1996
        //    Kofi Annan is not alive and was Sec.-General from 1997 to 2006, and is not alive
        //    U Thant is not alive and was Sec.-General from 1961 to 1971, and is not alive
        //    Ban Ki-Moon IS alive today; he was Sec.-General from 2007 to 2016
        //    Dag Hammarskjöld is not alive and was Sec.-General from 1953 to 1961, and is not alive
        //    Javier Pérez de Cuéllar is not alive and was Sec.-General from 1982 to 1991, and is not alive
        //    António Guterres IS alive today; he was Sec.-General from 2016 to 2022
        //    Trygve Lie is not alive and was Sec.-General from 1946 to 1952, and is not alive
        

        outputArea.append("===========================\n");
        outputArea.append("\nAll UN Secretaries-General in the array:\n\n");
        displayAllSecretariesGeneral();
        
        outputArea.append("\n===========================\n");
        outputArea.append("\nSecretaries-General since 2000 in the array:\n\n");
        displaySecretariesGeneralSince2000();
        
        outputArea.append("\n===========================\n");
        outputArea.append("\nLiving UN Secretaries-General in the array:\n\n");
        displayLivingSecretariesGeneral();
        
        
    } // end of constructor
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        
    } // end of paintComponent()
    
    
    public void displayAllSecretariesGeneral() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    public void displaySecretariesGeneralSince2000() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    
    public void displayLivingSecretariesGeneral() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    
    
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

    private TextArea outputArea;
    
    public void setUpTextArea() {
        outputArea = new TextArea();
        outputArea.setBounds(20, 20, 960, 560);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(outputArea);
    }
    
    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
