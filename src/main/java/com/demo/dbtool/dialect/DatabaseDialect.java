package com.demo.dbtool.dialect;

import com.demo.dbtool.config.Column;

public interface DatabaseDialect {
    String columnSql(Column column);
}
