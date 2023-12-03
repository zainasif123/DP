/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author T
 */
public class SingleObject {
    
    private static SingleObject instance;
    private SingleObject() {
        
    }
    public static SingleObject SingleObject()
    {
        if(instance == null)
        {
            instance = new SingleObject();
        }
        return instance;
    }
    public void someMethod() {
        System.out.println("Singleton method called.");
    }
}
