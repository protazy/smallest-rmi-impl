package pl.protazy.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TimeService extends Remote {
    public String getTime() throws RemoteException;

    public String echo(StringContainer sc) throws RemoteException;

    public String callback(CallbackService cs) throws RemoteException;

    public String getSerializable(ShouldBeSerializable s) throws RemoteException;

    public ShouldBeSerializable getFromCodebase() throws RemoteException;
}
