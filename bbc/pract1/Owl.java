import java.awt.*;

public class Owl {
    
    private Integer anchorX, anchorY;
    private Color   owlColor;
    
    
    // constructor
    public Owl( Color oc ) {
        anchorX = 0;
        anchorY = 0;
        owlColor = oc;
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    
    public void draw( Graphics g ) {
        


        
        // draw ears
        g.setColor(owlColor.darker());
        Polygon leftEar = new Polygon();
        leftEar.addPoint(anchorX+30, anchorY+15);
        leftEar.addPoint(anchorX+38, anchorY-5);
        leftEar.addPoint(anchorX+18, anchorY+5);
        g.fillPolygon(leftEar);
        Polygon rightEar = new Polygon();
        rightEar.addPoint(anchorX+10, anchorY+15);
        rightEar.addPoint(anchorX+2, anchorY-5);
        rightEar.addPoint(anchorX+22, anchorY+5);
        g.fillPolygon(rightEar);

        // draw body then wings
        g.setColor(owlColor.darker());
        g.fillOval(anchorX, anchorY, 40, 80);
        g.setColor(owlColor);
        g.fillOval(anchorX+7, anchorY+15, 26, 65);
        g.setColor(owlColor.darker());
        g.fillOval(anchorX-7, anchorY+30, 14, 40);
        g.fillOval(anchorX+33, anchorY+30, 14, 40);

        // eyes
        g.setColor(Color.WHITE);
        g.fillOval(anchorX+3, anchorY+12, 17, 17);
        g.fillOval(anchorX+20, anchorY+12, 17, 17);
        g.setColor(Color.BLACK);
        g.fillOval(anchorX+6, anchorY+16, 11, 11);
        g.fillOval(anchorX+23, anchorY+16, 11, 11);
        
        // beak
        Polygon beak = new Polygon();
        beak.addPoint(anchorX+12, anchorY+30);
        beak.addPoint(anchorX+28, anchorY+30);
        beak.addPoint(anchorX+20, anchorY+42);
        g.fillPolygon(beak);
        
    } // end of draw
    
    
    
    
} // end of class Owl
