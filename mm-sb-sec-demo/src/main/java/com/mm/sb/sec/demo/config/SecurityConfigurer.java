/**
 * 
 */
package com.mm.sb.sec.demo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * @author USER
 *
 */
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("sekhar").password("abc123").roles("admin", "customer", "seller")
			.and().withUser("kiran").password("1234").roles("customer")
			.and().withUser("rachana").password("abcd").roles("seller", "customer")
			.and().withUser("thara").password("abcd").roles("seller", "customer")
			.and().withUser("srividhya").password("abcd").roles("customer")
			.and().passwordEncoder(NoOpPasswordEncoder.getInstance());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/users/customer").hasAnyRole("customer", "seller")
			.antMatchers("/users/seller").hasRole("seller")
			.antMatchers("/users/admin").hasRole("admin")
			.antMatchers("/users").permitAll()
			.and().formLogin();
	}
	
}
