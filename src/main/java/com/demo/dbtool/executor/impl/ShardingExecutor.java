package com.demo.dbtool.executor.impl;

import com.demo.dbtool.config.GlobalConfig;
import com.demo.dbtool.config.Scene;
import com.demo.dbtool.executor.SceneExecutor;
import com.demo.dbtool.sharding.ShardingExpander;

public class ShardingExecutor implements SceneExecutor {

    @Override
    public void execute(Scene scene, GlobalConfig global) {
        ShardingExpander.expand(scene);
    }
}
