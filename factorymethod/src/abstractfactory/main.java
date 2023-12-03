/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import java.util.Scanner;

/**
 *
 * @author T
 */

public class main {
private static Application configureApplication(String name) {
        Application app;
        GUIFactory factory;
 
        if (name.equalsIgnoreCase("mac")) {
            factory = new MACOSFacotry();
            app = new Application(factory);
        } else if (name.equalsIgnoreCase("window")){
            factory = new WindowFacotry();
            app = new Application(factory);
        }
        else{
            return null;
        }
        return app;
    }

    public static void main(String[] args) {
        System.out.println("ENter platform");
        while(true){
             Scanner scn = new Scanner (System.in);
        String plf = scn.nextLine();
        Application app = configureApplication(plf);
        app.paint();
        }
       
    }
}
