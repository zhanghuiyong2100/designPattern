package com.prototypepattern.concreteprototype;

/**
 * @author zhanghuiyong
 * @创建时间 2019年01月05日
 * @描述: 简历类
 **/

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.clone();
    }


    /**
     * 设置个人信息
     */
    public void setPersonalInfo(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     */
    public void setWorkExperience(String workDate, String workCompany) {
        work.setWorkDate(workDate);
        work.setWorkCompany(workCompany);
    }

    /**
     * 显示
     */
    public void Display() {
        System.out.println(name + "," + sex + "," + age);
        System.out.println("工作经历:" + work);
    }

    @Override
    public Object clone() {
        Resume resume = null;
        try {
            resume = new Resume(this.work);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        resume.setName(this.name);
        resume.setAge(this.age);
        resume.setSex(this.sex);
        return resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", work=" + work +
                '}';
    }

    public Resume() {
        work = new WorkExperience();
    }
}
