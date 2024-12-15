// package security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// import services.UserService;

// @Configuration
// public class SecurityConfig {

//     private final UserService userService;

//     public SecurityConfig(UserService userService) {
//         this.userService = userService;
//     }

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http.csrf().disable()
//             .authorizeRequests()
//                 .antMatchers("/users/register").permitAll()
//                 .anyRequest().authenticated()
//             .and()
//             .httpBasic();
//         return http.build();
//     }

//     @Bean
//     public AuthenticationManager authManager(HttpSecurity http, PasswordEncoder passwordEncoder) throws Exception {
//         return http.getSharedObject(AuthenticationManagerBuilder.class)
//             .userDetailsService(userService)
//             .passwordEncoder(passwordEncoder)
//             .and()
//             .build();
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
// }