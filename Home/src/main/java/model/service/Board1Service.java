package model.service;

import java.util.ArrayList;

import model.dao.Board1DAO;
import model.domain.Board1;

import org.springframework.stereotype.Service;

@Service
public class Board1Service {
	
	private Board1DAO board1DAO;

	public void setBoard1DAO(Board1DAO board1DAO){
		this.board1DAO = board1DAO;
	}

	public void setBoard1DAO() {
		board1DAO.setBoard1DAO();
	}

	public ArrayList<Board1> getBoard1List() {
		return board1DAO.getBoard1List();
	}
	
	public int insertBoard1(Board1 board1){
		return board1DAO.insertBoard1(board1);
	}
	
	public Board1 viewBoard1(int no){
		return board1DAO.viewBoard1(no);
	}
	
	public int deleteBoard1(int no){
		return board1DAO.deleteBoard1(no);
	}

}
