package com.demo.dbtool.partition;

import com.demo.dbtool.config.Scene;

public class RangePartitionManager {

    public static void maintain(Scene scene) {

        System.out.println("Maintain range partition for table: "
                + scene.getTable());

        System.out.println("Pre-create future partitions...");
        System.out.println("Drop expired partitions...");
    }
}
