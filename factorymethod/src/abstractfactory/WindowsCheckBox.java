/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import java.awt.Checkbox;

/**
 *
 * @author T
 */
public class WindowsCheckBox implements CheckBox{

        @Override
    public void paint() {
        System.out.println("You have created WindowCheckBox.");
    }
}

