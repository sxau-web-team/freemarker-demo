package entity;

import java.util.List;

/**
 * Created by qingfeng on 16/12/13.
 */
public class Entity {
    // 实体所在的包名
    private String javaPackage;
    // 实体类名
    private String className;
    // 父类名
    private String superclass;
    // 属性集合
    List<Property> properties;
    // 是否有构造函数
    private boolean constructors;

    public String getJavaPackage() {
        return javaPackage;
    }

    public void setJavaPackage(String javaPackage) {
        this.javaPackage = javaPackage;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSuperclass() {
        return superclass;
    }

    public void setSuperclass(String superclass) {
        this.superclass = superclass;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public boolean isConstructors() {
        return constructors;
    }

    public void setConstructors(boolean constructors) {
        this.constructors = constructors;
    }

}
