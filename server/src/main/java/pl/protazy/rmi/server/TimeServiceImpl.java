package pl.protazy.rmi.server;

import pl.protazy.rmi.service.CallbackService;
import pl.protazy.rmi.service.ShouldBeSerializable;
import pl.protazy.rmi.service.StringContainer;
import pl.protazy.rmi.service.TimeService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;

public class TimeServiceImpl extends UnicastRemoteObject implements TimeService {

    public TimeServiceImpl() throws RemoteException {
//        super();
        System.out.println("created time service impl");
    }

    @Override
    public String getTime() throws RemoteException {
        return "Current time: " + Calendar.getInstance().getTime();
    }

    @Override
    public String echo(StringContainer sc) throws RemoteException {
        return sc.getString();
    }

    @Override
    public String callback(CallbackService cs) throws RemoteException {
        System.out.println("executing callback from client...");
        String responseFromClient = cs.callback();
        System.out.println("executed, result: " + responseFromClient);
        return "call executed and client responded with: " + responseFromClient;
    }

    @Override
    public String getSerializable(ShouldBeSerializable s) throws RemoteException {
        String name = s.getName();
        System.out.println("serializable name on server side: " + name);
        return "we got: " + name;
    }

    @Override
    public ShouldBeSerializable getFromCodebase() throws RemoteException {
        return new ServerShouldBeSerializable();
    }

}
