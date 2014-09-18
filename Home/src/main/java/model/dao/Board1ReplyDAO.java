package model.dao;

import java.util.ArrayList;

import model.domain.Board1Reply;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Board1ReplyDAO extends SqlSessionDaoSupport{

	public void setBoard1ReplyDAO() {}

	public ArrayList<Board1Reply> getBoard1ReplyList(int no) {
		return (ArrayList)getSqlSession().selectList("board1Reply.getBoard1ReplyList", no);
	}
	
	public int insertBoard1Reply(Board1Reply board1Reply){
		return getSqlSession().insert("board1Reply.insertBoard1Reply", board1Reply);
	}
	
	public int deleteBoard1Reply(int replyNo){
		return getSqlSession().delete("board1Reply.deleteBoard1Reply", replyNo);
	}
	
	public int deleteBoard1ReplyAll(int no){
		return getSqlSession().delete("board1Reply.deleteBoard1ReplyAll", no);
	}
}