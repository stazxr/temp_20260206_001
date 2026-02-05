package com.demo.dbtool.config;

import java.util.List;

public class IndexConfig {

    private String name;
    private List<String> columns;
    private boolean unique;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getColumns() { return columns; }
    public void setColumns(List<String> columns) { this.columns = columns; }

    public boolean isUnique() { return unique; }
    public void setUnique(boolean unique) { this.unique = unique; }
}
