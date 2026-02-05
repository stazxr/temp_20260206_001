package com.demo.dbtool.executor.impl;

import com.demo.dbtool.executor.SceneExecutor;

public class ExecutorFactory {

    public static SceneExecutor get(String type) {

        switch (type) {
            case "physical":
                return new PhysicalExecutor();
            case "sharding":
                return new ShardingExecutor();
            case "partition":
                return new PartitionExecutor();
            default:
                throw new RuntimeException("unknown type: " + type);
        }
    }
}
