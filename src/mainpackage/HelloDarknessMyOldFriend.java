/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import javax.jws.HandlerChain;
import javax.jws.WebService;

/**
 *
 * @author Slightom
 */

@WebService(endpointInterface = "mainpackage.IHelloDarknessMyOldFriend")
@HandlerChain(file="handler-chain.xml")
public class HelloDarknessMyOldFriend implements IHelloDarknessMyOldFriend{

    @Override
    public String getString(String name) {
         return "Hello Darkness sweet called  " + name;
    }
    
}
