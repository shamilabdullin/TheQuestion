package com.shamil.the_question.configs;

import com.shamil.the_question.security.AuthProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration //Аннотирование класса с помощью @Configuration указывает, что класс может использоваться контейнером IoC Spring в качестве источника определений бина.
@EnableWebSecurity //чтобы конфигурация Spring Security была определена любым WebSecurityConfigurerили более вероятным путем расширения WebSecurityConfigurerAdapterбазового класса и переопределения отдельных методов
@ComponentScan("com.shamil.the_question.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired //Бины – это объекты, которые являются основой приложения и управляются Spring IoC контейнером.
    private AuthProviderImpl authProvider;
//Inversion of Control (IoC), также известное как Dependency Injection (DI), является процессом, согласно которому объекты определяют свои зависимости, т.е. объекты, с которыми они работают, через аргументы конструктора/фабричного метода или свойства, которые были установлены или возвращены фабричным методом.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/signUp", "/signIn").anonymous()
                .antMatchers( "/questions", "/questions/*").authenticated()
                .and().csrf().disable()

                .formLogin()
                .loginPage("/signIn")
                .loginProcessingUrl("/auth/process")
                .usernameParameter("email")
                .failureUrl("/signIn?error=true")
                .and()
                .exceptionHandling()
                .accessDeniedPage("/profile")
                .and().logout();
    }

    @Bean //@Bean аннотации сообщают Spring , что метод с аннотацией @Bean будет возвращать объект , который должен быть зарегистрирован в качестве бина в контексте приложения Spring.
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authProvider);
    }

}