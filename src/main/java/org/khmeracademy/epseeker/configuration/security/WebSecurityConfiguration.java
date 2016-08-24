package org.khmeracademy.epseeker.configuration.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin@gmail.com").password("admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("dba@gmail.com").password("dba").roles("ADMIN","DBA");
		auth.inMemoryAuthentication().withUser("dev@gmail.com").password("dev").roles("DEVELOPER");

//		auth.userDetailsService(userDetailService);
//			.passwordEncoder(passwordEncoder());
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/swagger-ui.html/**").hasAnyRole("ADMIN","USER" , "DBA", "DEVELOPER");
		http
			.formLogin()
			.loginPage("/login")
			.usernameParameter("username")
			.passwordParameter("password")
			.permitAll();
		
		http.csrf().disable();
		http.exceptionHandling().accessDeniedPage("/access-denied");
	}
	
	
	/*public static void main(String[] args) {

		// Encrypt Password
		System.out.println(new BCryptPasswordEncoder().encode("12345"));
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}*/
	
}
