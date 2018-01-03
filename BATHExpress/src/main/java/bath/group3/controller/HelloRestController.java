package bath.group3.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@RequestMapping(value ="/getStringHello/",method = RequestMethod.GET)
	public ResponseEntity<User>  helloAngular(){
		User user = new User(76);
		System.out.println(user.getName());
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}

class User{
	private int name;

	public User() {
		super();
	}

	public User(int name) {
		super();
		this.name = name;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
}