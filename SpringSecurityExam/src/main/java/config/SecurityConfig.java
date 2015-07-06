package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import service.UserDetailsServiceImpl;

/**
 * Created by Dell on 6/17/2015.
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    // register our realization of UserDetailService
    // and also PasswordEncoder for reduction of password to SHA1 format

    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(getShaPasswordEncoder());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // switch on the defence from CSRF attacks
        http.csrf()
                .disable()
                        // index the rules of requests
                        // which will be determined the access to resources and other data by
                .authorizeRequests()
                .antMatchers("/resources/**", "/**").permitAll()
                .anyRequest().permitAll()
                .and();

        http.formLogin()
                // index the page with login's form
                .loginPage("/login")
                // index the action from login's form
                .loginProcessingUrl("/j_spring_security_check")
                // index the Url in case of error from login
                .failureUrl("/login?error")
                // index the parameters of login and password from login's form
                .usernameParameter("j_username")
                .usernameParameter("j_password")
                // give an access to form of login for all users
                .permitAll();
    }
    // index the Spring container, which need to initialize <b></b>ShadePasswordEncoder
    // This may be carry out in WebAppConfig
    @Bean
    public ShaPasswordEncoder getShaPasswordEncoder(){
        return new ShaPasswordEncoder();
    }
}
