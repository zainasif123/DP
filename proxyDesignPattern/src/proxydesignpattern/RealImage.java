/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxydesignpattern;

/**
 *
 * @author T
 */
public class RealImage implements Image{
private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        LoadingFile();
    }
    
    @Override
    public void display() {
        System.out.println("Display:" +filename);
    }
    public void LoadingFile()
    {
        System.out.println("Loading ---" +filename);
    }
}
