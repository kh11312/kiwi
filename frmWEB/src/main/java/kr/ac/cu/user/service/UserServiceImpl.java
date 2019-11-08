package kr.ac.cu.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.cu.user.model.sql.UserDao;
import kr.ac.cu.user.model.vo.UserVO;

@Service("userS") 
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao ; 
	
	public UserVO login(UserVO user) {
		System.out.println("service login : "+user);
		return dao.loginRow(user) ; 
	}
}











