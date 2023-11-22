/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Decorator;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class DecoratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Shape circle = new Circle();
        double circlePrice = circle.getPrice();
        
        Shape rectangle = new Rectangle();
        double rectanglePrice = rectangle.getPrice();

        Shape redCircle = new RedShapeDecorator(new Circle());
        double redCirclePrice = redCircle.getPrice();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        double redRectanglePrice = redRectangle.getPrice();
        
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Select the Following Options:-");
        System.out.println("1.Circle With Normal Border");
        System.out.println("2.Rectangle With Normal Border");
        System.out.println("3.Cicle with Red Border");
        System.out.println("4.Rectangle With Red Border");
        
        while(true)
        {
            int option = scn.nextInt();
            switch(option)
            {
                case (1) :
                     System.out.println("Circle with normal border");
                     circle.draw();
                     System.out.println("Cost: $" + circlePrice);
                    break;
                case (2):
                     System.out.println("\nRectangle with normal border");
                     rectangle.draw();
                     System.out.println("Cost: $" + rectanglePrice);
                    break;
                case (3):              
                     System.out.println("\nCircle of red border");
                     redCircle.draw();
                     System.out.println("Cost: $" + redCirclePrice);
                    break;
                case (4):
                     System.out.println("\nRectangle of red border");
                     redRectangle.draw();
                     System.out.println("Cost: $" + redRectanglePrice);
                    break;
                default:
                    System.out.println("Not Correct Input Try Again");
                    
                    break;
                    
            }
        }
        
        
        
        
        


    
    }
    
}
