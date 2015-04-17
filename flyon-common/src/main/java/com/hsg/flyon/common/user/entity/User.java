package com.hsg.flyon.common.user.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.hsg.flyon.base.entity.BaseEntity;

@Entity
@Table(name = "auth_user")
public class User extends BaseEntity {

    /** */
    private static final long serialVersionUID = 9093555266860389874L;

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
