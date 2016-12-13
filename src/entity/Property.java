package entity;

/**
 * Created by qingfeng on 16/12/13.
 */
public class Property {
    // 属性数据类型
    private String javaType;
    // 属性名称
    private String propertyName;

    private PropertyType propertyType;

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

}

