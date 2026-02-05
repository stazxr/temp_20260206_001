package com.demo.dbtool.executor.impl;

import com.demo.dbtool.config.*;
import com.demo.dbtool.ddl.DdlGenerator;
import com.demo.dbtool.dialect.GaussDialect;
import com.demo.dbtool.executor.SceneExecutor;
import com.demo.dbtool.util.SqlLogger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PhysicalExecutor implements SceneExecutor {

    @Override
    public void execute(Scene scene, GlobalConfig global) throws Exception {

        String sql = DdlGenerator.createTable(scene, new GaussDialect());
        SqlLogger.print(sql, global.isPrintSql());

        if (global.isDryRun()) return;

        try (Connection conn = DriverManager.getConnection(
                scene.getDatasource().getUrl(),
                scene.getDatasource().getUsername(),
                scene.getDatasource().getPassword())) {

            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            conn.commit();
        }
    }
}
