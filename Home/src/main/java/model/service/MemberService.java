package model.service;

import java.util.HashMap;

import model.dao.MemberDAO;
import model.domain.Member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO){
		this.memberDAO = memberDAO;
	}

	public void setMemberDAO() {
		memberDAO.setMemberDAO();
	}

	public Member getMember(HashMap<String, String> member) {
		return memberDAO.getMember(member);
	}

}
