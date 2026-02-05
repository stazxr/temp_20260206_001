package com.demo.dbtool.config;

/**
 * 全局执行控制参数
 *
 * 控制 SQL 是否执行、是否打印日志等行为。
 *
 * YAML:
 *
 * global:
 *   dryRun: true
 *   printSql: true
 */
public class GlobalConfig {

    /**
     * dryRun = true 时：
     *   - SQL 只打印
     *   - 不执行数据库操作
     *
     * 常用于：
     *   - 预览执行计划
     *   - CI 校验
     */
    private boolean dryRun;

    /**
     * 是否打印 SQL 日志
     */
    private boolean printSql = true;

    public boolean isDryRun() { return dryRun; }
    public void setDryRun(boolean dryRun) { this.dryRun = dryRun; }

    public boolean isPrintSql() { return printSql; }
    public void setPrintSql(boolean printSql) { this.printSql = printSql; }
}
