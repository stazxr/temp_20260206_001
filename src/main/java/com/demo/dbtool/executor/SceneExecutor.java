package com.demo.dbtool.executor;

import com.demo.dbtool.config.GlobalConfig;
import com.demo.dbtool.config.Scene;

public interface SceneExecutor {
    void execute(Scene scene, GlobalConfig global) throws Exception;
}
