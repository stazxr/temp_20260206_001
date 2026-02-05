package com.demo.dbtool.config;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;

/**
 * YAML 加载工具
 *
 * 负责：
 *   - 读取 YAML 文件
 *   - 转换为 Config 对象
 */
public class YamlLoader {

    public static Config load(String path) throws Exception {
        Yaml yaml = new Yaml();

        try (FileInputStream fis = new FileInputStream(path)) {
            return yaml.loadAs(fis, Config.class);
        }
    }
}
