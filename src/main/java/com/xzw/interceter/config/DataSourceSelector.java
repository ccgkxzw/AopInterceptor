package com.xzw.interceter.config;

import com.xzw.interceter.commom.DynamicDataSourceEnum;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataSourceSelector {
    DynamicDataSourceEnum value() default DynamicDataSourceEnum.MASTER;
    boolean clear() default true;
}
