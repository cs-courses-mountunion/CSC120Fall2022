import java.awt.*;
import java.util.Random;

public class Mouse {
    
    public Integer over, down;
    public Boolean facingLeft;
    public Color mouseColor;
    
    public Mouse( Integer x, Integer y, Color c ) {
        over = x;
        down = y;
        facingLeft = false;
        mouseColor = c;
    } // end of constructor
    
    public Mouse( Integer x, Integer y ) {
        over = x;
        down = y;
        facingLeft = false;
        mouseColor = Color.LIGHT_GRAY;
    } // end of constructor

    public Mouse() {
        Random generator = new Random();
        over = generator.nextInt(601) + 100;
        down = generator.nextInt(501) + 50;
        facingLeft = generator.nextBoolean();
        Integer red, green, blue;
        red = generator.nextInt(150);
        green = generator.nextInt(150);
        blue = generator.nextInt(150);
        mouseColor = new Color(red, green, blue);
//        Double pct;
//        pct = generator.nextDouble();
//        if (pct < 0.25) {
//            mouseColor = Color.CYAN;
//        }
//        else if (pct < 0.5) {
//            mouseColor = Color.GREEN;
//        }
//        else if (pct < 0.75) {
//            mouseColor = Color.YELLOW;
//        }
//        else {
//            mouseColor = Color.MAGENTA;
//        }
    } // end of constructor
    
    public void moveForward( Integer steps ) {
        Integer direction = 1;
        if (facingLeft) {
            direction = -1;
        }
        over += direction*10*steps;
    } // end of moveForward
    
    public void turnAround() {
        facingLeft = !facingLeft;        
    } // end of turnAround
    
    public void draw(Graphics g){
        //g.setColor(Color.LIGHT_GRAY);
        g.setColor(mouseColor);
        g.fillOval(over, down, 50, 20);
        Polygon nose;
        nose = new Polygon();
        if (facingLeft) {
            nose.addPoint(over+18, down);
            nose.addPoint(over+18, down+20);
            nose.addPoint(over-10, down+10);
            g.fillPolygon(nose);
            g.setColor(Color.BLACK);
            g.setColor(Color.BLACK);
            g.fillOval(over+12, down+4, 5, 5);
            g.fillOval(over+12, down+11, 5, 5);
            g.drawLine(over-5, down+8, over, down-5);
            g.drawLine(over-5, down+8, over-3, down-5);
            g.drawLine(over-5, down+8, over-6, down-5);
            g.drawLine(over-5, down+12, over, down+25);
            g.drawLine(over-5, down+12, over-3, down+25);
            g.drawLine(over-5, down+12, over-6, down+25);
            g.drawArc(over+20, down-10, 60, 20, 270, 90  );
        } // end if
        else {
            nose.addPoint(over+32, down);
            nose.addPoint(over+32, down+20);
            nose.addPoint(over+60, down+10);
            g.fillPolygon(nose);
            g.setColor(Color.BLACK);
            g.fillOval(over+38, down+4, 5, 5);
            g.fillOval(over+38, down+11, 5, 5);
            g.drawLine(over+55, down+8, over+50, down-5);
            g.drawLine(over+55, down+8, over+53, down-5);
            g.drawLine(over+55, down+8, over+56, down-5);
            g.drawLine(over+55, down+12, over+50, down+25);
            g.drawLine(over+55, down+12, over+53, down+25);
            g.drawLine(over+55, down+12, over+56, down+25);
            g.drawArc(over-30, down-10, 60, 20, 180, 90  );
        } // end else
        
    } // end of draw
    
} // end of class Mouse
















//    public Mouse() {
//        Random generator = new Random();
//        over = generator.nextInt(651) + 50;
//        down = generator.nextInt(501) + 50;
//        facingLeft = generator.nextBoolean();
//    } // end of constructor
//    

