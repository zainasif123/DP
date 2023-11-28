/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subexpert;

/**
 *
 * @author T
 */
public class Circle implements Shape {

   @Override
   public void draw(String... colors) {
     // System.out.println("Circle::draw()");
       StringBuilder sb = new StringBuilder("Circle = draw(");
        for (String col : colors) {
            sb.append(col).append(", ");
        }
        if (colors.length > 0) {
            sb.setLength(sb.length() - 2); 
        }
        sb.append(")");
        System.out.println(sb.toString());
   }
}