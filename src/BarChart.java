import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;
public class BarChart {
   static int v1,v2,v3,v4; //values
    
    
    static SketchPadWindow win = new SketchPadWindow(500,600);
    static Pen p= new StandardPen(win);
    
    public static void main(String[] args) {  
        Color ruby = new Color(162, 0, 33);
        Color crayola = new Color(245, 47, 87);
        Color sandy = new Color(247, 157, 92);
        Color pumpkin = new Color(243, 117, 43);
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter v1 value > ");
        v1=s.nextInt();
        System.out.println("Enter v2 value > ");
        v2=s.nextInt();
        System.out.println("Enter v3 value > ");
        v3=s.nextInt();
        System.out.println("Enter v4 value > ");
        v4=s.nextInt();  
        
        p.up();
        p.move(-250,-277);
        p.setColor(Color.black);
        p.down();
        p.move(250,-276);
        makeBar(p,-120,-275,v1,50,ruby);
        makeBar(p,-20,-275,v2,50,crayola);
        makeBar(p,80,-275,v3,50,sandy);
        makeBar(p,180,-277,v4,50,pumpkin);
    }
    
    public static void makeBar(Pen p, int xloc, int yloc, int length,int width, Color col){
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.setDirection(180);
        p.move(width);
        p.setDirection(-90);
        p.move(length);
        p.setDirection(0);
        p.move(width);
        p.up();
        p.setDirection(90);
        p.move(length+5);
        p.drawString(length+"");
    }
    
}
