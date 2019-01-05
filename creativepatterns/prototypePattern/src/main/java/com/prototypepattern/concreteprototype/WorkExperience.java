package com.prototypepattern.concreteprototype;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 工作经历类
 **/

public class WorkExperience implements Cloneable {
    private String workDate;
    private String workCompany;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }


    @Override
    public String toString() {
        return "时间:" + workDate + ", 公司:" + workCompany;
    }
}
