package com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass;

import com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass.security.LoginHandler;
import com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass.security.UserDetailsService;

/**
 * packageName : com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after
 * fileName : App
 * author : psjw
 * date : 2021-12-12
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-12        psjw         최초 생성
 */
public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("psjw", "psjw");
        System.out.println(login);
    }
}
