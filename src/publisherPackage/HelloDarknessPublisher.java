/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publisherPackage;

import javax.xml.ws.Endpoint;
import mainpackage.*;

/**
 *
 * @author Slightom
 */
public class HelloDarknessPublisher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws3/hellodarkness", new HelloDarknessMyOldFriend());
        System.out.println("Web servis is waiting for a client...");
    }
    
}
