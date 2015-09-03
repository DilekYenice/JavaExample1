package connection.impl;

import connection.Connection;

/**
 * Created by otaskin on 22/08/15.
 */
public class OracleConnection implements Connection, Saveable {

    @Override
    public void connect() {
        System.out.println("connected to oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected from oracle");
    }


    @Override
    public void save() {
        System.out.println("saved to oracle db");
    }
}
