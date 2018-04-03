/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author Slightom
 */
@WebService(endpointInterface = "mainpackage.IHelloDarknessMyOldFriend")
@HandlerChain(file = "handler-chain.xml")
public class HelloDarknessMyOldFriend implements IHelloDarknessMyOldFriend {

    @Resource
    WebServiceContext wsctx;
    
    @Override
    public String getString(String name) {

        MessageContext mctx = wsctx.getMessageContext();

        //get detail from request headers
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Password");

        String username = "";
        String password = "";

        if (userList != null) {
            //get username
            username = userList.get(0).toString();
        }

        if (passList != null) {
            //get password
            password = passList.get(0).toString();
        }

        //Should validate username and password with database
        if (username.equals("tomek") && password.equals("atomek")) {
            return "Hello Darkness sweet called  " + name + ". User valid!";
        } else {
            return "Unknown User!";
        }
    }

}
