/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxydesignpattern;

/**
 *
 * @author T
 */
public class ProxyImage implements Image{
private String filename;
RealImage realimage;
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
    

    @Override
    public void display() {
       if(realimage == null)
       {
           realimage = new RealImage(filename);
           
       }
       realimage.display();
    }
    
    
}
