import java.awt.*;

public class Bunny {
    
    private Integer anchorX, anchorY;
    private Color   bunnyColor;
    
    
    // constructor
    public Bunny( Color bc ) {
        anchorX = 0;
        anchorY = 0;
        bunnyColor = bc;
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    
    public void draw( Graphics g ) {
        
        
        
        
        
        // draw body then outline in black
        g.setColor(bunnyColor);
        g.fillOval(anchorX-5, anchorY+32, 50, 45);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX-5, anchorY+32, 50, 45);

        // draw ears then outline in black        
        g.setColor(bunnyColor);
        g.fillOval(anchorX+5, anchorY-10, 10, 32);
        g.fillOval(anchorX+25, anchorY-10, 10, 32);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX+5, anchorY-10, 10, 32);
        g.drawOval(anchorX+25, anchorY-10, 10, 32);
        
        // draw head then outline in black
        g.setColor(bunnyColor);
        g.fillOval(anchorX, anchorY+17, 40, 20);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX, anchorY+17, 40, 20);
        
        // facial features
        g.fillOval(anchorX+8, anchorY+22, 7, 7);
        g.fillOval(anchorX+25, anchorY+22, 7, 7);
        g.fillOval(anchorX+16, anchorY+26, 8, 8);
        g.drawLine(anchorX+10, anchorY+32, anchorX+30, anchorY+32);
        
        // legs and feet
        g.drawLine(anchorX+10, anchorY+74, anchorX+10, anchorY+82);
        g.drawLine(anchorX-10, anchorY+82, anchorX+10, anchorY+82);
        g.drawLine(anchorX+30, anchorY+74, anchorX+30, anchorY+81);
        g.drawLine(anchorX+30, anchorY+82, anchorX+50, anchorY+81);
        
    } // end of draw
    
    
    
    
} // end of class Bunny
