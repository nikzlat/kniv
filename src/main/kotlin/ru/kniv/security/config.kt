package ru.kniv.security

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter


@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    /*@Bean("authenticationManager")
    @Throws(java.lang.Exception::class)
    override fun authenticationManagerBean(): AuthenticationManager? {
        return super.authenticationManagerBean()
    }*/

    @Autowired
    @Throws(Exception::class)
    fun configureGlobal(auth: AuthenticationManagerBuilder) {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER");
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("{noop}strongpwd").roles("ADMIN");
    }

    /*@Bean
    fun myAuthenticationSuccessHandler() = MySimpleUrlAuthenticationSuccessHandler()


    @Throws(java.lang.Exception::class)
    protected override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
                .antMatchers("/anonymous*").anonymous()
                .antMatchers("/login*").permitAll()
                .anyRequest().authenticated()

                .and()
                .formLogin()
//                .loginPage("/login.html")
                .loginProcessingUrl("/login")
                .successHandler(myAuthenticationSuccessHandler())
                .successForwardUrl("/index.html")
    }*/


}