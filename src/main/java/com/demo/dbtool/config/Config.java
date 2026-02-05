package com.demo.dbtool.config;

import java.util.List;

public class Config {

    private GlobalConfig global;
    private List<Scene> scenes;

    public GlobalConfig getGlobal() { return global; }
    public void setGlobal(GlobalConfig global) { this.global = global; }

    public List<Scene> getScenes() { return scenes; }
    public void setScenes(List<Scene> scenes) { this.scenes = scenes; }
}
