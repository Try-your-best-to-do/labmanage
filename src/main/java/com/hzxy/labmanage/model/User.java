package com.hzxy.labmanage.model;

public class User {
    private Integer id;

    private String uid;

    private String uname;

    private String upassword;

    private String uphone;

    private String uIdNumber;

    private String urole;

    private String umsg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getuIdNumber() {
        return uIdNumber;
    }

    public void setuIdNumber(String uIdNumber) {
        this.uIdNumber = uIdNumber == null ? null : uIdNumber.trim();
    }

    public String getUrole() {
        return urole;
    }

    public void setUrole(String urole) {
        this.urole = urole == null ? null : urole.trim();
    }

    public String getUmsg() {
        return umsg;
    }

    public void setUmsg(String umsg) {
        this.umsg = umsg == null ? null : umsg.trim();
    }
}