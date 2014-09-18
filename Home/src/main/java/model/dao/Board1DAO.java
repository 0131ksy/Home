package model.dao;

import java.util.ArrayList;

import model.domain.Board1;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.web.bind.annotation.ResponseBody;

public class Board1DAO extends SqlSessionDaoSupport{

	public void setBoard1DAO() {}

	public ArrayList<Board1> getBoard1List() {
		return (ArrayList)getSqlSession().selectList("board1.getBoard1List");
	}
	
	public int insertBoard1(Board1 board1){
		return getSqlSession().insert("board1.insertBoard1", board1);
	}
	
	public Board1 viewBoard1(int no){
		return getSqlSession().selectOne("board1.viewBoard1", no);
	}
	
	public int deleteBoard1(int no){
		return getSqlSession().delete("board1.deleteBoard1", no);
	}
}
