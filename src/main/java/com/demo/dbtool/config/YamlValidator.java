package com.demo.dbtool.config;

/**
 * YAML 校验器
 *
 * 防止错误配置导致执行失败。
 */
public class YamlValidator {

    public static void validate(Config cfg) {

        if (cfg.getScenes() == null || cfg.getScenes().isEmpty()) {
            throw new RuntimeException("scenes empty");
        }

        cfg.getScenes().forEach(scene -> {

            if (scene.getType() == null) {
                throw new RuntimeException(
                        "scene type missing: " + scene.getName());
            }

            if (scene.getDatasource() == null) {
                throw new RuntimeException(
                        "datasource missing: " + scene.getName());
            }
        });
    }
}
