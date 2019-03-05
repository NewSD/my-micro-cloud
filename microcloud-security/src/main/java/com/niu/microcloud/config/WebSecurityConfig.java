package com.niu.microcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import javax.annotation.Resource;

/**
 * Created by ami on 2019/3/5.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        所有访问必须通过认证才能正常进行
        httpSecurity.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
//      所有的rest服务必须设置为无状态
        httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }

    @Resource
    private void configGlobel(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("mldnjava").password("hello").roles("USER")
                .and().withUser("admin").password("admin").roles("USER","ADMIN");


    }
}
