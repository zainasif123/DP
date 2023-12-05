/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxydesignpattern;

/**
 *
 * @author T
 */
public class ProxyDesignPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //without proxy
//        RealImage realimage = new RealImage("video.mp4");
//        realimage.display();
//         realimage = new RealImage("video.mp4");
//        realimage.display();
      //  with proxy
        System.out.println(" Simple Virtual Proxy Video");
      ProxyImage proxyimage = new ProxyImage("video_1.mp4");
      proxyimage.display();
                System.out.println("");
                proxyimage.display();
                
        System.out.println("\nFor Detection for Unsupported VIdoes Type ");
                 VirtualProxyImage proxyImage = new VirtualProxyImage("proxy pattern tutorial .mp4");
        proxyImage.display();
        System.out.println("");
        proxyImage.display();
    }
    
}
