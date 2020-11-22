package com.houx.IoC.pojo;


/**
 * @Author: HouX
 * @Date: 2020/11/14
 * @Description:
 */

public class Role{

    private long id;
    private String roleName;
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // public Role(String roleName, String note) {
    //     this.roleName = roleName;
    //     this.note = note;
    // }


    public Role() {
    }

    public Role(long id, String roleName, String note) {
        this.id = id;
        this.roleName = roleName;
        this.note = note;
    }
}

