package kr.ac.cu.user.ctrl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.cu.user.model.vo.UserVO;
import kr.ac.cu.user.service.UserService;

@Controller
public class UserCtrl {
	
	@Resource(name="userS")
	private UserService service ; 
	
	@RequestMapping("/index.dcu")
	public String main() {
		return "index" ; 	
	}
	
	@RequestMapping("/login.dcu")
	public String login(UserVO user, HttpSession session) {
		System.out.println("ctrl login user : "+user);
		UserVO result = service.login(user) ; 
		String path = "ok";
		if(result == null) {
			session.setAttribute("loginSession", result);
			path = "error";
		}
		return path; 	
	}
	
}







