package com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass;

import com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass.security.UserDetails;

/**
 * packageName : com.psjw.designpatterns._02_structural_patterns._06_adapter._01_before
 * fileName : Account
 * author : psjw
 * date : 2021-12-12
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-12        psjw         최초 생성
 */
//Adaptee에 해당
    //AccountService와 Account 수정 가능할 경우
public class Account implements UserDetails {
    private String name;

    private String password;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
