import java.awt.*;

public class Pyramid {
    
    private Integer anchorX, anchorY;
    private Color   pyramidColor;
    
    
    // constructor
    public Pyramid( Color pc ) {
        anchorX = 0;
        anchorY = 0;
        pyramidColor = pc;
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    
    public void draw( Graphics g ) {



        
        // head        
        Polygon leftFace = new Polygon();
        leftFace.addPoint(anchorX, anchorY);
        leftFace.addPoint(anchorX-35, anchorY+60);
        leftFace.addPoint(anchorX+10, anchorY+80);

        Polygon rightFace = new Polygon();
        rightFace.addPoint(anchorX, anchorY);
        rightFace.addPoint(anchorX+45, anchorY+40);
        rightFace.addPoint(anchorX+10, anchorY+80);
        
        g.setColor(pyramidColor);
        g.fillPolygon(leftFace);
        g.setColor(pyramidColor.darker());
        g.fillPolygon(rightFace);
        
        g.setColor(Color.BLACK);
        g.drawPolygon(leftFace);
        g.drawPolygon(rightFace);

        
    } // end of draw
    
    
    
    
} // end of class Pyramid
