package com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass;

import com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass.security.UserDetails;

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
//단점 : 코드 수정 -> 단일책임원칙에 위배될 수도 있음
//장점 : 복잡도를 조금 더 줄 일 수 있음
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
