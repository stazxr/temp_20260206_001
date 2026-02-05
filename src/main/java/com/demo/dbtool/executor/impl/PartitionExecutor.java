package com.demo.dbtool.executor.impl;

import com.demo.dbtool.config.GlobalConfig;
import com.demo.dbtool.config.Scene;
import com.demo.dbtool.executor.SceneExecutor;
import com.demo.dbtool.partition.RangePartitionManager;

public class PartitionExecutor implements SceneExecutor {

    @Override
    public void execute(Scene scene, GlobalConfig global) {
        RangePartitionManager.maintain(scene);
    }
}
