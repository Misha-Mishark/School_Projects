import TurtleGraphics.*;
import java.util.Scanner;
public class BarChart {

    public static void main(String[] args) {
        double momentum;
        double mass,velocity;
        Scanner s= new Scanner(System.in);
        //asks for mass and velocity and stores them as inpputs
        System.out.println("Enter objects mass >> ");
        mass=s.nextDouble();
        System.out.println("Enter objects velocity >> ");
        velocity=s.nextDouble();
        
        //Calculates the momentum
        momentum = mass*velocity;
        System.out.println(String.format("The object's momentum is %.2f kg⋅m/s", momentum));
    }
    
}
