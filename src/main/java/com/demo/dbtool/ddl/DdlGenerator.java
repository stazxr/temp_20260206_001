package com.demo.dbtool.ddl;

import com.demo.dbtool.config.Column;
import com.demo.dbtool.config.Scene;
import com.demo.dbtool.dialect.DatabaseDialect;

public class DdlGenerator {

    public static String createTable(Scene s, DatabaseDialect dialect) {

        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ")
          .append(s.getTable()).append(" (");

        for (Column c : s.getColumns()) {
            sb.append(dialect.columnSql(c)).append(",");
        }

        sb.append("PRIMARY KEY(")
          .append(s.getPrimaryKey())
          .append("))");

        return sb.toString();
    }
}
