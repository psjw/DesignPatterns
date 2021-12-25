package com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass;

import com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass.security.UserDetails;
import com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass.security.UserDetailsService;

/**
 * packageName : com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after
 * fileName : AccountUserDetailsService
 * author : psjw
 * date : 2021-12-12
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-12        psjw         최초 생성
 */

//Target 인터페이스
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
