/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subexpert;

/**
 *
 * @author T
 */
public class FacadePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

      ShapeMaker shapeMaker = new ShapeMaker();

       shapeMaker.drawCircle("red", "white", "black");
        System.out.println("");
      shapeMaker.drawRectangle("1", "2", "3");
      System.out.println("");
      shapeMaker.drawSquare("pink", "maroon", "orange");
      System.out.println("");
      shapeMaker.drawTriangle("green", "white", "black");
    }
    
}
