package com.czy.Bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author 蔡梓阳
 * @Date 2022/1/14 11:21
 */

@Data
public class Account {

    private String account;
    private String name;
    private String password;
    private String accountType;
    private String tel;


    public Account(String account, String name, String password, String accountType, String tel) {
        this.account = account;
        this.name = name;
        this.password = password;
        this.accountType = accountType;
        this.tel = tel;
    }

    public Account() {
    }
}
