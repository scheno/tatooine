package com.schening.tatooine.common.model;

import lombok.Data;

import java.util.Date;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/1 8:35 下午
 */
@Data
public class OperationLog {

    private String status;

    private String operatorName;

    private String operationIP;

    private String operationUrl;

    private Date operationTime;

    private String result;

    private String requestMethod;

    private String errorMessage;

}
