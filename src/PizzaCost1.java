
import java.util.Scanner;


public class PizzaCost1 {

    public static void main(String[] args) {
        int toppings; 
        double size,cost;
        final double fixedcost= 2.25 ; //Pizza making cost+ gas cost
        Scanner s= new Scanner(System.in);
        System.out.println("Enter pizza size in inches ");
        size=s.nextDouble();
        System.out.println("Enter number of toppings >> ");
        toppings=s.nextInt();
        
        cost=0.50*size+0.75*toppings+fixedcost;
        System.out.println(String.format("The cost of your pizza is $ %.2f",cost));
    }
    
}
