package rob.in.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebSecurity
public class LoginSecurity /* extends WebSecurityConfigurerAdapter */ {

	/*
	 * @Override protected void configure(final AuthenticationManagerBuilder auth)
	 * throws Exception {
	 * auth.inMemoryAuthentication().withUser("user1").password("user1").authorities
	 * ("USER").and().withUser("user2")
	 * .password(("user2Pass")).roles("USER").and().withUser("admin").password((
	 * "adminPass")).roles("ADMIN"); }
	 * 
	 * @Override protected void configure(final HttpSecurity http) throws Exception
	 * { http.authorizeRequests().antMatchers("/res/**").permitAll().antMatchers(
	 * "/registration").permitAll()
	 * .anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll
	 * () .successForwardUrl("/home"); }
	 * 
	 * @SuppressWarnings("deprecation")
	 * 
	 * @Bean public NoOpPasswordEncoder passwordEncoder() { return
	 * (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance(); }
	 */
}
