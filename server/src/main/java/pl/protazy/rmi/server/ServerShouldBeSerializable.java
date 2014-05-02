package pl.protazy.rmi.server;

import pl.protazy.rmi.service.ShouldBeSerializable;

import java.io.Serializable;

class ServerShouldBeSerializable implements ShouldBeSerializable, Serializable {
    @Override
    public String getName() {
        return "name from server";
    }
}
