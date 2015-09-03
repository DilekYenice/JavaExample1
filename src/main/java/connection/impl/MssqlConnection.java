package connection.impl;

import connection.Connection;

/**
 * Created by otaskin on 22/08/15.
 */
public class MssqlConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("connected to mssql");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected from mssql");
    }
}
