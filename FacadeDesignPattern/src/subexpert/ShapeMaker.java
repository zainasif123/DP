/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subexpert;

/**
 *
 * @author T
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape triangle;
   public ShapeMaker() {
      circle = new Circle();     
      rectangle = new Rectangle();
      square = new Square();
      triangle = new Triangle();
   }

   public void drawCircle(String... colors){
      circle.draw(colors);
   }
   public void drawRectangle(String... colors){
      rectangle.draw(colors);
   }
   public void drawSquare(String... colors){
      square.draw(colors);
   }
   public void drawTriangle(String... colors){
      triangle.draw(colors);
   }
}
