package com.example.dao;

import java.sql.Connection;

public class XDAO {
    protected Connection conn;

    public XDAO(Connection conn){
        this.conn = conn;
    }
}
