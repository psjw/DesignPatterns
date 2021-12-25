package com.psjw.designpatterns._02_structural_patterns._06_adapter._02_after_adapterclass.security;

/**
 * packageName : com.psjw.designpatterns._02_structural_patterns._06_adapter._01_before.security
 * fileName : UserDetailsServicew
 * author : psjw
 * date : 2021-12-12
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-12        psjw         최초 생성
 */
//Target에 해당
public interface UserDetailsService {
    UserDetails loadUser(String username);
}
