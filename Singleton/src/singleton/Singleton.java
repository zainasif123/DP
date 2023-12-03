/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author T
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      SingleObject obj =  SingleObject.SingleObject();
        obj.someMethod();
        
        SingleObject obj2 = SingleObject.SingleObject();
        obj2.someMethod();
    }
    
}
