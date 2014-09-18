package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.Board1Reply;
import model.service.Board1ReplyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Board1ReplyController {
	
	private Board1ReplyService board1ReplyService;
	
	@Autowired
	public void setBoard1Service(Board1ReplyService board1ReplyService){
		this.board1ReplyService = board1ReplyService;
	}
	
	@RequestMapping(value="insertBoard1Reply.do", method=RequestMethod.POST)
	public ModelAndView insertBoard1Reply(@ModelAttribute("board1") Board1Reply board1Reply, HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.addObject("board1Reply", board1ReplyService.insertBoard1Reply(board1Reply));
		mv.setViewName("boardSuccess");
		return mv;
	}
	
	@RequestMapping(value="deleteBoard1Reply.do", method=RequestMethod.POST)
	public ModelAndView deleteBoard1Reply(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView();
		int replyNo = Integer.parseInt(request.getParameter("replyNo"));
		if(board1ReplyService.deleteBoard1Reply(replyNo) != 0){
			int no = Integer.parseInt(request.getParameter("no"));
			ArrayList<Board1Reply> board1ReplyList = board1ReplyService.getBoard1ReplyList(no);
			mv.addObject("board1ReplyList", board1ReplyList);
			mv.setViewName("boardSuccess");
		}else{
			mv.setViewName("fail");
		}
		return mv;
	}
}
