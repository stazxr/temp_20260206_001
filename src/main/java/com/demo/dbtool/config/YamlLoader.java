package com.demo.dbtool.config;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;

public class YamlLoader {

    public static Config load(String path) throws Exception {
        Yaml yaml = new Yaml();
        try (FileInputStream fis = new FileInputStream(path)) {
            return yaml.loadAs(fis, Config.class);
        }
    }
}
