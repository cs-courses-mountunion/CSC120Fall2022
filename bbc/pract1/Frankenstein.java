import java.awt.*;

public class Frankenstein {
    
    private Integer anchorX, anchorY;
    private Color   monsterColor;
    
    
    // constructor
    public Frankenstein( Color mc ) {
        anchorX = 0;
        anchorY = 0;
        monsterColor = mc;
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    
    public void draw( Graphics g ) {



        
        g.setColor(monsterColor);
        g.fillRect(anchorX, anchorY, 60, 90);
        g.setColor(Color.BLACK);
        g.drawRect(anchorX, anchorY, 60, 90);
        
        // eyes
        g.fillOval(anchorX+8, anchorY+40, 12, 7);
        g.fillOval(anchorX+38, anchorY+40, 12, 7);
        
        // nose
        g.fillRect(anchorX+27, anchorY+50, 6, 12);
        
        // mouth
        g.fillRect(anchorX+10, anchorY+70, 40, 5);
        
        // hair
        Polygon hair = new Polygon();
        hair.addPoint(anchorX, anchorY);
        hair.addPoint(anchorX+60, anchorY);
        hair.addPoint(anchorX+60, anchorY+35);
        hair.addPoint(anchorX+50, anchorY+20);
        hair.addPoint(anchorX+40, anchorY+35);
        hair.addPoint(anchorX+30, anchorY+20);
        hair.addPoint(anchorX+20, anchorY+35);
        hair.addPoint(anchorX+10, anchorY+20);
        hair.addPoint(anchorX, anchorY+35);
        g.fillPolygon(hair);
        
        // bolts
        g.setColor(monsterColor.darker());
        g.fillRect(anchorX-15, anchorY+70, 15, 10);
        g.fillRect(anchorX+60, anchorY+70, 15, 10);
        g.setColor(Color.BLACK);
        g.drawRect(anchorX-15, anchorY+70, 15, 10);
        g.drawRect(anchorX+60, anchorY+70, 15, 10);
        
    } // end of draw
    
    
    
    
} // end of class Frankenstein
