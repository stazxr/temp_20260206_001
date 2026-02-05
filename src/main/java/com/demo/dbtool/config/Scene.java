package com.demo.dbtool.config;

import java.util.List;
import java.util.Map;

public class Scene {

    private String name;
    private String type;
    private String databaseType;

    private DataSourceConfig datasource;

    private String table;
    private String logicTable;

    private List<Column> columns;
    private String primaryKey;

    private List<IndexConfig> indexes;

    private Map<String, Object> sharding;
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
