package com.demo.dbtool.config;

/**
 * 表字段定义
 *
 * YAML 示例：
 *
 * - name: id
 *   type: bigint
 *   nullable: false
 */
public class Column {

    /** 字段名 */
    private String name;

    /** 逻辑字段类型 */
    private String type;

    /** varchar 长度 */
    private Integer length;

    /** decimal 精度 */
    private Integer precision;

    /** decimal 小数位 */
    private Integer scale;

    /** 是否允许 NULL */
    private Boolean nullable = true;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getLength() { return length; }
    public void setLength(Integer length) { this.length = length; }

    public Integer getPrecision() { return precision; }
    public void setPrecision(Integer precision) { this.precision = precision; }

    public Integer getScale() { return scale; }
    public void setScale(Integer scale) { this.scale = scale; }

    public Boolean getNullable() { return nullable; }
    public void setNullable(Boolean nullable) { this.nullable = nullable; }
}
