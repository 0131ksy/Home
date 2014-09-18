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
	
	@RequestMapping(value="getBoard1ReplyList.do", method=RequestMethod.POST)	
	public ModelAndView getBoard1ReplyList(HttpServletRequest request){
		ArrayList<Board1Reply> board1ReplyList = board1ReplyService.getBoard1ReplyList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("board1ReplyList", board1ReplyList);
		mv.setViewName("board");
		return mv;
	}

	@RequestMapping(value="insertBoard1Reply.do", method=RequestMethod.POST)
	public ModelAndView insertBoard1Reply(@ModelAttribute("board1") Board1Reply board1Reply, HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.addObject("board1Reply", board1ReplyService.insertBoard1Reply(board1Reply));
		ArrayList<Board1Reply> board1ReplyList = board1ReplyService.getBoard1ReplyList();
		request.setAttribute("board1ReplyList", board1ReplyList);
		//response.sendRedirect("board/board.jsp");
		mv.setViewName("boardSuccess");
		return mv;
	}
	
	@RequestMapping(value="deleteBoard1Reply.do", method=RequestMethod.POST)
	public ModelAndView deleteBoard1Reply(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView();
		int no = Integer.parseInt(request.getParameter("no"));
		if(board1ReplyService.deleteBoard1Reply(no) != 0){
			ArrayList<Board1Reply> board1ReplyList = board1ReplyService.getBoard1ReplyList();
			mv.addObject("board1ReplyList", board1ReplyList);
			//response.sendRedirect("board/board.jsp");
			mv.setViewName("boardSuccess");
		}else{
			mv.setViewName("fail");
		}
		return mv;
	}
}
