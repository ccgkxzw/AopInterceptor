package com.xzw.interceter.commom;

//import jdk.nashorn.internal.objects.annotations.Getter;

//@Getter
public enum  DynamicDataSourceEnum {
    MASTER("master"),
    SLAVE("slave");
    private String dataSourceName;
    DynamicDataSourceEnum(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }
}
