package com.demo.dbtool.config;

import java.util.List;
import java.util.Map;

/**
 * Scene 表示一个执行场景。
 *
 * 每个 scene 描述一个任务，例如：
 *   - 创建物理表
 *   - 创建分库分表
 *   - 分区表维护
 *
 * YAML 中 scenes 数组每个元素映射为一个 Scene。
 */
public class Scene {

    /** 场景名称，仅用于日志 */
    private String name;

    /**
     * 场景类型：
     * physical  → 普通建表
     * sharding  → 分库分表
     * partition → 分区表
     */
    private String type;

    /**
     * 数据库类型
     * 当前支持：
     *   gauss
     *
     * 未来可扩展：
     *   mysql
     *   postgres
     *   oracle
     */
    private String databaseType;

    /** 数据源配置 */
    private DataSourceConfig datasource;

    /** 实际表名（物理表 / 分区表使用） */
    private String table;

    /** 逻辑表名（分库分表使用） */
    private String logicTable;

    /** 表字段定义 */
    private List<Column> columns;

    /** 主键字段名 */
    private String primaryKey;

    /** 索引配置 */
    private List<IndexConfig> indexes;

    /**
     * 分库分表策略配置
     *
     * 示例：
     * sharding:
     *   shardKey: user_id
     *   tableCount: 4
     */
    private Map<String, Object> sharding;

    /**
     * 分区表策略配置
     */
    private Map<String, Object> partition;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDatabaseType() { return databaseType; }
    public void setDatabaseType(String databaseType) { this.databaseType = databaseType; }

    public DataSourceConfig getDatasource() { return datasource; }
    public void setDatasource(DataSourceConfig datasource) { this.datasource = datasource; }

    public String getTable() { return table; }
    public void setTable(String table) { this.table = table; }

    public String getLogicTable() { return logicTable; }
    public void setLogicTable(String logicTable) { this.logicTable = logicTable; }

    public List<Column> getColumns() { return columns; }
    public void setColumns(List<Column> columns) { this.columns = columns; }

    public String getPrimaryKey() { return primaryKey; }
    public void setPrimaryKey(String primaryKey) { this.primaryKey = primaryKey; }

    public List<IndexConfig> getIndexes() { return indexes; }
    public void setIndexes(List<IndexConfig> indexes) { this.indexes = indexes; }

    public Map<String, Object> getSharding() { return sharding; }
    public void setSharding(Map<String, Object> sharding) { this.sharding = sharding; }

    public Map<String, Object> getPartition() { return partition; }
    public void setPartition(Map<String, Object> partition) { this.partition = partition; }
}
