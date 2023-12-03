/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author T
 */
public class WindowFacotry implements GUIFactory{

@Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}

