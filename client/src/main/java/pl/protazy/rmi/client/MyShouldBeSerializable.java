package pl.protazy.rmi.client;

import pl.protazy.rmi.service.ShouldBeSerializable;

import java.io.Serializable;

class MyShouldBeSerializable implements ShouldBeSerializable, Serializable {
    @Override
    public String getName() {
        return "my local name";
    }
}
