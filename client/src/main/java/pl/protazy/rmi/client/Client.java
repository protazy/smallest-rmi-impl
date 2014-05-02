package pl.protazy.rmi.client;

import pl.protazy.rmi.service.ShouldBeSerializable;
import pl.protazy.rmi.service.StringContainer;
import pl.protazy.rmi.service.TimeService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        System.setSecurityManager(new SecurityManager());

        String hostname = "192.168.1.5";
        int port = 1099;
        TimeService ts = (TimeService) Naming.lookup("//" + hostname + ":" + port + "/" + "timeservice");

        System.out.println("Server reponse:\n" + ts.getTime());
        System.out.println("--");
        System.out.println("Echo response for string hello:");
        System.out.println(ts.echo(new StringContainer("hello")));

        System.out.println("executing call with callback");
        String callbackResult = ts.callback(new CallbackServiceImpl());
        System.out.println("callback result: " + callbackResult);

        String response = ts.getSerializable(new MyShouldBeSerializable());

        System.out.println("got from server:" + response);

        ShouldBeSerializable fromCodebase = ts.getFromCodebase();
        System.out.println("received from server's codebase: " + fromCodebase.getName());

    }

}
