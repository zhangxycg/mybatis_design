package com.zxy.mybatis.cfg;

/**
 * @Description: 用来封装执行的sql语句和结果类型的全限定类名
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public class Mapper {
    private String queryString; // sql语句
    private String resultType; // 实体类的全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
