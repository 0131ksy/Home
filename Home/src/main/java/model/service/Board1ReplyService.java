package model.service;

import java.util.ArrayList;

import model.dao.Board1ReplyDAO;
import model.domain.Board1Reply;

import org.springframework.stereotype.Service;

@Service
public class Board1ReplyService {
	
	private Board1ReplyDAO board1ReplyDAO;

	public void setBoard1ReplyDAO(Board1ReplyDAO board1ReplyDAO){
		this.board1ReplyDAO = board1ReplyDAO;
	}

	public void setBoard1ReplyDAO() {
		board1ReplyDAO.setBoard1ReplyDAO();
	}

	public ArrayList<Board1Reply> getBoard1ReplyList(int no) {
		return board1ReplyDAO.getBoard1ReplyList(no);
	}
	
	public int insertBoard1Reply(Board1Reply board1Reply){
		return board1ReplyDAO.insertBoard1Reply(board1Reply);
	}
	
	public int deleteBoard1Reply(int replyNo){
		return board1ReplyDAO.deleteBoard1Reply(replyNo);
	}
	
	public int deleteBoard1ReplyAll(int no){
		return board1ReplyDAO.deleteBoard1ReplyAll(no);
	}

}
