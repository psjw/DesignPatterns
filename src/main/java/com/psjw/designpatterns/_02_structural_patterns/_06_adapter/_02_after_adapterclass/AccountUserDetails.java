package com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass;

import com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass.security.UserDetails;

/**
 * packageName : com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after
 * fileName : AccountUserDetails
 * author : psjw
 * date : 2021-12-12
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-12        psjw         최초 생성
 */
public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
