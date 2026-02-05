package com.demo.dbtool.util;

public class SqlLogger {

    public static void print(String sql, boolean enable) {
        if (enable) {
            System.out.println("[SQL] " + sql);
        }
    }
}
