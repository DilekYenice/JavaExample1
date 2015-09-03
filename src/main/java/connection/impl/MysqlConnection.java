package connection.impl;

import connection.Connection;

public class MysqlConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("connected to mysql");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected from mysql");
    }
}
