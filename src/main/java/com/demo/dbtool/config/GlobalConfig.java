package com.demo.dbtool.config;

public class GlobalConfig {

    private boolean dryRun;
    private boolean printSql = true;

    public boolean isDryRun() { return dryRun; }
    public void setDryRun(boolean dryRun) { this.dryRun = dryRun; }

    public boolean isPrintSql() { return printSql; }
    public void setPrintSql(boolean printSql) { this.printSql = printSql; }
}
