package com.psjw.designpatterns._02_structural_patterns._06_adapter._01_before;

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
public class Account {
    private String name;

    private String password;

    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
