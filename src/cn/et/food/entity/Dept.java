package cn.et.food.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.deptid
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    private Integer deptid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dname
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.pid
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.deptid
     *
     * @return the value of dept.deptid
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.deptid
     *
     * @param deptid the value for dept.deptid
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dname
     *
     * @return the value of dept.dname
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dname
     *
     * @param dname the value for dept.dname
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.pid
     *
     * @return the value of dept.pid
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.pid
     *
     * @param pid the value for dept.pid
     *
     * @mbg.generated Thu Dec 14 10:13:38 CST 2017
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}