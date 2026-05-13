package tek.project.SpringSecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tek.project.SpringSecurity.entity.AppUser;
import tek.project.SpringSecurity.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<AppUser> opUser = userRepository.findByUsername(username);
		
		AppUser appUser=null;
		if(opUser.isPresent()) {
			appUser=opUser.get();
		}
		else {
			throw new UsernameNotFoundException("User Not Found");
		}
		
		UserDetails userDetails = User
		.builder()
		.username(appUser.getUsername())
		.password(appUser.getPassword()) // ROLE_ADMIN
		.roles(appUser.getRole().replace("ROLE_", ""))
		.build();
		
		return userDetails;
	}

}
