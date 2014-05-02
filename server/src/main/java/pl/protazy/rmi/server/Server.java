package pl.protazy.rmi.server;

import pl.protazy.rmi.service.TimeService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        System.setSecurityManager(new SecurityManager());

        LocateRegistry.createRegistry(1099);

        TimeService ts = new TimeServiceImpl();
        Naming.rebind("timeservice", ts);
        System.out.println("TimeService bound under name: timeservice");
    }
}
