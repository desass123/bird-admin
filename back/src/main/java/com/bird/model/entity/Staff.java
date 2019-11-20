package com.bird.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.id
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.name
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.account
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.password
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.status
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Short status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.create_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.update_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.last_login
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Date lastLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.address
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.phone
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.phone2
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String phone2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.email
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.birth_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String birthDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.sex
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_STAFF.icon
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Integer icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_STAFF
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.id
     *
     * @return the value of T_STAFF.id
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.id
     *
     * @param id the value for T_STAFF.id
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.name
     *
     * @return the value of T_STAFF.name
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.name
     *
     * @param name the value for T_STAFF.name
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.account
     *
     * @return the value of T_STAFF.account
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.account
     *
     * @param account the value for T_STAFF.account
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.password
     *
     * @return the value of T_STAFF.password
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.password
     *
     * @param password the value for T_STAFF.password
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.status
     *
     * @return the value of T_STAFF.status
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.status
     *
     * @param status the value for T_STAFF.status
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.create_date
     *
     * @return the value of T_STAFF.create_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.create_date
     *
     * @param createDate the value for T_STAFF.create_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.update_date
     *
     * @return the value of T_STAFF.update_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.update_date
     *
     * @param updateDate the value for T_STAFF.update_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.last_login
     *
     * @return the value of T_STAFF.last_login
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.last_login
     *
     * @param lastLogin the value for T_STAFF.last_login
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.address
     *
     * @return the value of T_STAFF.address
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.address
     *
     * @param address the value for T_STAFF.address
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.phone
     *
     * @return the value of T_STAFF.phone
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.phone
     *
     * @param phone the value for T_STAFF.phone
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.phone2
     *
     * @return the value of T_STAFF.phone2
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.phone2
     *
     * @param phone2 the value for T_STAFF.phone2
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.email
     *
     * @return the value of T_STAFF.email
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.email
     *
     * @param email the value for T_STAFF.email
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.birth_date
     *
     * @return the value of T_STAFF.birth_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.birth_date
     *
     * @param birthDate the value for T_STAFF.birth_date
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.sex
     *
     * @return the value of T_STAFF.sex
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.sex
     *
     * @param sex the value for T_STAFF.sex
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_STAFF.icon
     *
     * @return the value of T_STAFF.icon
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Integer getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_STAFF.icon
     *
     * @param icon the value for T_STAFF.icon
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setIcon(Integer icon) {
        this.icon = icon;
    }
}