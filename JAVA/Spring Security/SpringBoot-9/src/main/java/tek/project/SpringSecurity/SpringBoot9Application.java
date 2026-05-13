package tek.project.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import tek.project.SpringSecurity.entity.AppUser;
import tek.project.SpringSecurity.repositories.UserRepository;

@SpringBootApplication
public class SpringBoot9Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBoot9Application.class, args);
		UserRepository userRepo = ctx.getBean(UserRepository.class);
		PasswordEncoder encoder  = ctx.getBean(PasswordEncoder.class);
		
		//admin member
		if( userRepo.findByUsername("admin").isEmpty()) {
			
			AppUser appUser = new AppUser();
			appUser.setUsername("admin");
			appUser.setPassword(encoder.encode("admin123"));
			appUser.setRole("ROLE_ADMIN");
			userRepo.save(appUser);
			System.out.println("Admin Inserted");
			//admin
			//admin123
			//insert
		} else {
			System.out.println("ADMIN ALREADY EXISTS");
		}
		
		//admin member
				if( userRepo.findByUsername("member").isEmpty()) {
					
					AppUser appUser = new AppUser();
					appUser.setUsername("member");
					appUser.setPassword(encoder.encode("member123"));
					appUser.setRole("ROLE_MEMBER");
					userRepo.save(appUser);
					System.out.println("MEMBER Inserted");
					
					//member
					//member123
					//insert
				} else {
					System.out.println("member ALREADY EXISTS");
				}
	}

}
