/*
 * Copyright 2018 Mondia Media Group GmbH. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Mondia Media Group GmbH ("Confidential Information").
 * You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement
 * you entered into with Mondia Media Group GmbH.
 */
package com.ecomerce.userservice.userservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Youans Ezzat
 */
@Getter
@Setter
@Entity
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    public User(long id,String name){
            this.id=id;
            this.name=name;
            this.email=name+"@exmple.com";

    }
    public User(){}
}
