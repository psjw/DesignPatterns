package com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass;


import com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass.security.LoginHandler;
import com.psjw.designpatterns._02_structural_patterns._06_adapter._03_after_no_adpterclass.security.UserDetailsService;

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
        UserDetailsService userDetailsService = new AccountService();
        LoginHandler loginHandler = new LoginHandler( userDetailsService);
        String login = loginHandler.login("psjw", "psjw");
        System.out.println(login);
    }
}
