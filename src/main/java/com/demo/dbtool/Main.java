package com.demo.dbtool;

import com.demo.dbtool.config.*;
import com.demo.dbtool.executor.SceneExecutor;
import com.demo.dbtool.executor.impl.ExecutorFactory;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Usage: java -jar db-tool.jar config.yml");
            return;
        }

        Config config = YamlLoader.load(args[0]);
        YamlValidator.validate(config);

        for (Scene scene : config.getScenes()) {

            System.out.println("\n=== Execute Scene: " + scene.getName() + " ===");

            SceneExecutor executor =
                    ExecutorFactory.get(scene.getType());

            executor.execute(scene, config.getGlobal());
        }
    }
}
