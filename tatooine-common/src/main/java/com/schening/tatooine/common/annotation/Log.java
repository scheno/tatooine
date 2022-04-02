package com.schening.tatooine.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/1 8:11 下午
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
public @interface Log {

    /**
     * 模块
     */
    String title() default "";

    /**
     * 功能
     */
    String businessType() default "";

    /**
     * 操作人类型
     */
    String operatorType() default "";

    /**
     * 是否保存请求的参数
     */
    boolean isSaveRequestData() default true;

}
