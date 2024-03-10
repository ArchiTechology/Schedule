package com.schedule.app.authuntication;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import com.schedule.app.service.CustomUserService;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	CustomUserService customUserService;
	
	 @Autowired
	 CustomSuccessHandler customSuccessHandler;
	
	@Bean
	 public PasswordEncoder passwordEncoder()
	 {
		return  new BCryptPasswordEncoder();
		
	 }
	
	@Bean
	 public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	 {
		http.csrf(c -> c.disable())
		.authorizeHttpRequests(
				request -> request.
				requestMatchers("/admin-page").hasAuthority("admin")
				.requestMatchers("/user-page").hasAuthority("user")
				.requestMatchers("/faculty-page").hasAuthority("faculty")
				.requestMatchers("/schedule").hasAuthority("schedule")
				.requestMatchers("/registration").permitAll()
				.anyRequest().authenticated())
		.formLogin(form -> form.loginPage("/login").loginProcessingUrl("/login").successHandler(customSuccessHandler)
				.permitAll())
		.logout(form -> form.invalidateHttpSession(true).clearAuthentication(true)
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout")
				.permitAll());
		return  http.build();
		
	 }
}


