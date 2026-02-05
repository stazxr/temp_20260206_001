package com.demo.dbtool.config;

public class YamlValidator {

    public static void validate(Config cfg) {

        if (cfg.getScenes() == null || cfg.getScenes().isEmpty()) {
            throw new RuntimeException("scenes empty");
        }

        cfg.getScenes().forEach(scene -> {
            if (scene.getType() == null) {
                throw new RuntimeException("scene type missing");
            }
        });
    }
}
