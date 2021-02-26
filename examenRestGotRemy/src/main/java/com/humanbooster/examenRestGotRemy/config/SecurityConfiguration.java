package com.humanbooster.examenRestGotRemy.config;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure (HttpSecurity http) throws Exception{
		http.cors().and().csrf().disable().authorizeRequests()
			.antMatchers(HttpMethod.POST, "/api/cars/**").permitAll()
			.antMatchers(HttpMethod.GET, "/api/cars/**").permitAll()
			.antMatchers(HttpMethod.POST, "/api/colors/**").permitAll()
			.antMatchers(HttpMethod.GET, "/api/colors/**").permitAll()
			.antMatchers(HttpMethod.PUT, "/api/colors/**").permitAll()
			.antMatchers(HttpMethod.DELETE, "/api/colors/**").permitAll()
			.anyRequest().authenticated();
	}
	
	@Bean
	protected CorsConfigurationSource corsConfigurationSource() {
	    UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
	    
	    CorsConfiguration corsConfiguration = new CorsConfiguration().applyPermitDefaultValues();
	    urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);

	    return urlBasedCorsConfigurationSource;
	}
}
