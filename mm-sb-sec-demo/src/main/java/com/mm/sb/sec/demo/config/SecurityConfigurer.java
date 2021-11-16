/**
 * 
 */
package com.mm.sb.sec.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author USER
 *
 */
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("sekhar").password("$2a$10$CezrIzyJVUs1B.CzBwSdtOkwbqnPfEBQdvybjKYPO4DYUvES8at8y").roles("admin", "customer", "seller")
			.and().withUser("kiran").password("$2a$10$GS0HGGyC9iA3rU475xb13OxsIbFC8JCvm0BSshtcsNFqBe7jaxScS").roles("customer")
			.and().withUser("rachana").password("$2a$10$Xx7J.ZviDov2ALpLoP3vB.038IA4FO3jyuoN1ZvyULTWLfq6Mb07O").roles("seller", "customer")
			.and().withUser("thara").password("$2a$10$Xx7J.ZviDov2ALpLoP3vB.038IA4FO3jyuoN1ZvyULTWLfq6Mb07O").roles("seller", "customer")
			.and().withUser("srividhya").password("$2a$10$Xx7J.ZviDov2ALpLoP3vB.038IA4FO3jyuoN1ZvyULTWLfq6Mb07O").roles("customer");
			//.and().passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/users/customer").hasAnyRole("customer", "seller")
			.antMatchers("/users/seller").hasRole("seller")
				/*
				 * .antMatchers("/users/admin").hasRole("admin")
				 * .antMatchers("/users/admin/finduser").hasRole("admin")
				 * .antMatchers("/users/admin/newuser").hasRole("admin")
				 * .antMatchers("/users/admin/modifyuser").hasRole("admin")
				 */
			.antMatchers("/users/admin/**").hasRole("admin")
			.antMatchers("/users/customer/placeorder").hasRole("customer")
			.antMatchers("/users").permitAll()
			.and().formLogin();
	}
	
}
