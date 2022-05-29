import java.awt.*;

public class Frankenstein {

    private Color color;
    private Integer over, down;
	
	
    public Frankenstein(Color c) {
        color = c;
    } // end of constructor

	
    public void setOver(Integer x) {
        over = x;
    } // end of setOver()
	
    public void setDown(Integer y) {
        down = y;
    } // end of setDown()
        

    public void draw(Graphics g) {

        Color frankColor;
  

        frankColor = color;
        
        
        
        
        // head of Frankenstein
        g.setColor(frankColor);
        g.fillRect(over, down, 60, 90);
        g.setColor(Color.BLACK);
        g.drawRect(over, down, 60, 90);
        
        // eyes
        g.fillOval(over+8, down+40, 12, 7);
        g.fillOval(over+38, down+40, 12, 7);
        
        // nose
        g.fillRect(over+27, down+50, 6, 12);
        
        // mouth
        g.fillRect(over+10, down+70, 40, 5);
        
        // hair
        Polygon hair = new Polygon();
        hair.addPoint(over, down);
        hair.addPoint(over+60, down);
        hair.addPoint(over+60, down+35);
        hair.addPoint(over+50, down+20);
        hair.addPoint(over+40, down+35);
        hair.addPoint(over+30, down+20);
        hair.addPoint(over+20, down+35);
        hair.addPoint(over+10, down+20);
        hair.addPoint(over, down+35);
        g.fillPolygon(hair);
        
        // bolts
        g.setColor(frankColor.darker());
        g.fillRect(over-15, down+70, 15, 10);
        g.fillRect(over+60, down+70, 15, 10);
        g.setColor(Color.BLACK);
        g.drawRect(over-15, down+70, 15, 10);
        g.drawRect(over+60, down+70, 15, 10);
        
        
    } // end of draw()
    

	
} // end of class Fish
