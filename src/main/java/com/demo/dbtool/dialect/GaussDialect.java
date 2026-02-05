package com.demo.dbtool.dialect;

import com.demo.dbtool.config.Column;

public class GaussDialect implements DatabaseDialect {

    @Override
    public String columnSql(Column c) {

        String type;

        switch (c.getType()) {
            case "bigint": type = "BIGINT"; break;
            case "int": type = "INTEGER"; break;
            case "string": type = "VARCHAR(" + c.getLength() + ")"; break;
            case "decimal":
                type = "DECIMAL(" + c.getPrecision() + "," + c.getScale() + ")";
                break;
            case "datetime": type = "TIMESTAMP"; break;
            case "text": type = "TEXT"; break;
            default: type = c.getType();
        }

        return c.getName() + " " + type +
                (Boolean.FALSE.equals(c.getNullable()) ? " NOT NULL" : "");
    }
}
