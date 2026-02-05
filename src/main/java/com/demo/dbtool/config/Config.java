package com.demo.dbtool.config;

import java.util.List;

/**
 * YAML 配置根对象
 *
 * 对应 YAML 顶层结构：
 *
 * global:
 * scenes:
 *
 * 程序启动时：
 * 1. 加载 YAML
 * 2. 解析为 Config 对象
 * 3. 顺序执行 scenes
 *
 * 结构：
 *   Config
 *      ├─ global
 *      └─ scenes[]
 */
public class Config {

    /**
     * 全局执行参数
     * 控制 dry-run、SQL 日志等行为
     */
    private GlobalConfig global;

    /**
     * 场景列表（按顺序执行）
     * 每个 scene 表示一个建表或维护任务
     */
    private List<Scene> scenes;

    public GlobalConfig getGlobal() { return global; }
    public void setGlobal(GlobalConfig global) { this.global = global; }

    public List<Scene> getScenes() { return scenes; }
    public void setScenes(List<Scene> scenes) { this.scenes = scenes; }
}
