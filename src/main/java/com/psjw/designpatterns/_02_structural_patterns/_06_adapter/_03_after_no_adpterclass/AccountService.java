package com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass;

import com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass.security.UserDetails;
import com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass.security.UserDetailsService;

/**
 * packageName : com.psjw.designpatterns._02_structural_patterns._06_adapter._01_before
 * fileName : AccountService
 * author : psjw
 * date : 2021-12-12
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-12        psjw         최초 생성
 */

//Adaptee에 해당
public class AccountService implements UserDetailsService {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = findAccountByUsername(username);
        return account;
    }
}
