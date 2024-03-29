package com.project.CVTool;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.model.Cv;
import com.project.model.Experience;
import com.project.model.User;
import com.project.services.CvService;
import com.project.services.CvServiceImpl;
import com.project.services.ExperienceService;
import com.project.services.ExperienceServiceImpl;
import com.project.services.UserService;
import com.project.services.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CvToolApplicationTests {
	private ExperienceService expService = new ExperienceServiceImpl();
	private CvService cvService = new CvServiceImpl();
	private UserService userService = new UserServiceImpl();

	@Test
	public void addCV() {
		User user = new User();
		user.setName("Alex");
		user.setPhone("123");
		user.setEmail("email!email.ro");
		user.setUserName("alex");
		user.setPassword("123");
		user.setAddress("address");
		user.setProffesion("proffesion");
		// DateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// Date date= new Date();
		user.setBirthDate(new Date(10));
		user.setPremium(false);
		
		userService.save(user);

		Cv cv = new Cv();
		cv.setPath("C:");
		cv.setOtherQualifications("other");
		cv.setPersonalDescription("personal");
		cv.setUser(user);
		
		cvService.save(cv);

		Experience experience = new Experience();
		experience.setName("exp");
		experience.setStartDate(new Date(20));
		experience.setEndDate(new Date(30));
		experience.setCv(cv);

		expService.save(experience);

	}

}
