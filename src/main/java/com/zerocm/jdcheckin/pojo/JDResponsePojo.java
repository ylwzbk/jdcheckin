package com.zerocm.jdcheckin.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @功能:京东接口返回数据实体类
 * @项目名:jdcheckin
 * @作者:0cm
 * @日期:2020/3/3111:23 上午
 */
@Data
public class JDResponsePojo<T> implements Serializable {
    private Integer resultCode;
    private JDBasePojo base ;
    private Integer code;
    private String errorMessage;
    private ResponseData data;
    private ResultData resultData;
    private AwardListVo[] awardList;
    private Result result;
    private Integer busiCode;
    private Double gbBalance;
    private Double totalBalance;
    private Boolean success;
}
