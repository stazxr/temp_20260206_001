package com.demo.dbtool.sharding;

import com.demo.dbtool.config.Scene;

public class ShardingExpander {

    public static void expand(Scene scene) {

        System.out.println("Create sharding tables for logic table: "
                + scene.getLogicTable());

        for (int i = 0; i < 4; i++) {
            System.out.println("Create table: "
                    + scene.getLogicTable() + "_" + i);
        }
    }
}
