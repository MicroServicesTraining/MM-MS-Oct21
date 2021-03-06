/**
 * 
 */
package com.ofs.sb.oauth2.demo.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

import com.ofs.sb.oauth2.demo.services.UserDetailsServiceImpl;

/**
 * @author dorak
 *
 */

@Configuration
@Order(1)
@EnableWebSecurity
public class OFSSbOAuth2DemoSecurityConfigurer extends WebSecurityConfigurerAdapter {

		@Resource(name = "userService")
	    private UserDetailsService userDetailsService;

		@Bean
		public UserDetailsService userService() {
			return new UserDetailsServiceImpl();
		}
		
	    @Bean
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	        return super.authenticationManagerBean();
	    }

	    @Autowired
	    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userDetailsService)
	                .passwordEncoder(encoder());
	    }

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .csrf().disable()
	                .anonymous().disable()
	                .authorizeRequests()
	                .antMatchers("/").permitAll();
	    }

	    @Bean
	    public TokenStore tokenStore() {
	        return new InMemoryTokenStore();
	    }

	    @Bean
	    public NoOpPasswordEncoder encoder(){
	        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	    }

}
