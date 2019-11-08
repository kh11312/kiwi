package kr.ac.cu.user.model.sql;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.cu.user.model.vo.UserVO;

@Repository("userD")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SqlSession session;
	
	public UserVO loginRow(UserVO user) {
		UserVO result = session.selectOne("test.user.login",user);
		System.out.println("DAO Result : " + result);
		return result ;
	}
	
}
