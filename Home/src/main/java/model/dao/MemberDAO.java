package model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.Board1;
import model.domain.Member;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MemberDAO extends SqlSessionDaoSupport{

	public void setMemberDAO() {
	}

	public Member getMember(HashMap<String, String> member){
		return getSqlSession().selectOne("member.getMember", member);
	}
	
	public Board1 getProject(String projectNo) {
		return getSqlSession().selectOne("info.getProject", projectNo);
	}

	public ArrayList<Board1> search(HashMap<String, String> map) {
		ArrayList<Board1> projects;
		return (ArrayList)getSqlSession().selectList("info.search", map);
	}
	
}
