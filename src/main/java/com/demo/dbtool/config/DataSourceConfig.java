package com.demo.dbtool.config;

/**
 * 数据库连接配置
 *
 * 每个 scene 可使用不同数据源。
 */
public class DataSourceConfig {

    /** JDBC 连接地址 */
    private String url;

    /** 数据库用户名 */
    private String username;

    /** 数据库密码 */
    private String password;

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
