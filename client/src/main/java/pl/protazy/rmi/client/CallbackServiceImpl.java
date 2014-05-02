package pl.protazy.rmi.client;

import pl.protazy.rmi.service.CallbackService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CallbackServiceImpl extends UnicastRemoteObject implements CallbackService {
    protected CallbackServiceImpl() throws RemoteException {
        System.out.println("created callback service impl");
    }

    @Override
    public String callback() throws RemoteException {
        System.out.println("executing callback on client");
        return "executed!";
    }
}
