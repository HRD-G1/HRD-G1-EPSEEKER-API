//package org.khmeracademy.epseeker.configuration.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
//@Configuration
//@EnableWebSecurity
//public class APISecurityConfiguration extends WebSecurityConfigurerAdapter{
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//			.withUser("admin@gmail.com")
//			.password("admin")
//			.roles("API");
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.csrf().disable();
//		
//		http.httpBasic();
//		http.authorizeRequests()
//			.antMatchers("/rest/**")
//			.hasAnyRole("API");
//		
//		http
//			.formLogin()
//			.permitAll();
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		
//	}
//	
//
//}
