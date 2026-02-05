package com.demo.dbtool.config;

import java.util.List;

/**
 * 表索引配置
 *
 * YAML 示例：
 *
 * indexes:
 *   - name: idx_user
 *     columns: [username]
 *     unique: true
 */
public class IndexConfig {

    /** 索引名称 */
    private String name;

    /** 索引字段列表 */
    private List<String> columns;

    /** 是否唯一索引 */
    private boolean unique;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getColumns() { return columns; }
    public void setColumns(List<String> columns) { this.columns = columns; }

    public boolean isUnique() { return unique; }
    public void setUnique(boolean unique) { this.unique = unique; }
}
