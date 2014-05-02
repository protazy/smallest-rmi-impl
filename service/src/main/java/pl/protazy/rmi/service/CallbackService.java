package pl.protazy.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CallbackService extends Remote {
    public String callback() throws RemoteException;
}
