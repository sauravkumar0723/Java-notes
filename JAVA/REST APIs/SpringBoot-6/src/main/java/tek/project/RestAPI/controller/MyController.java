package tek.project.RestAPI.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tek.project.RestAPI.pojo.User;
import tek.project.RestAPI.services.MyService;

@RestController
@RequestMapping("/test")
public class MyController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/sales")
//	@ResponseBody
	public String readSales1() {
		return "Hello";
	}
	
	@GetMapping("/sales2")
//	@ResponseBody
	public List<User> readSales2() {
		User user1 = new User(11, "raju", "add1");
		User user2 = new User(11, "raju", "add1");
		User user3 = new User(11, "raju", "add1");
		
		return Arrays.asList(user1,user2,user3);	 
	}
	
	@GetMapping("/sales3")
//	@ResponseBody
	public Map<Integer, Integer> readActualSales() {
		
		
		return myService.readSales();	 
	}
}
