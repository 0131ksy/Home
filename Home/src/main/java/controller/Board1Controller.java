package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.Board1;
import model.domain.Board1Reply;
import model.service.Board1ReplyService;
import model.service.Board1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Board1Controller {
	
	private Board1Service board1Service;
	private Board1ReplyService board1ReplyService;
	
	@Autowired
	public void setBoard1Service(Board1Service board1Service){
		this.board1Service = board1Service;
	}
	
	@Autowired
	public void setBoard1ReplyService(Board1ReplyService board1ReplyService){
		this.board1ReplyService = board1ReplyService;
	}
	
	@RequestMapping(value="getBoard1List.do", method=RequestMethod.POST)	
	public ModelAndView getBoard1List(HttpServletRequest request){
		ArrayList<Board1> board1List = board1Service.getBoard1List();
		ModelAndView mv = new ModelAndView();
		mv.addObject("board1List", board1List);
		mv.setViewName("board");
		return mv;
	}

	@RequestMapping(value="insertBoard1.do", method=RequestMethod.POST)
	public ModelAndView insertBoard1(@ModelAttribute("board1") Board1 board1, HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.addObject("board1", board1Service.insertBoard1(board1));
		ArrayList<Board1> board1List = board1Service.getBoard1List();
		request.setAttribute("board1List", board1List);
		//response.sendRedirect("board/board.jsp");
		mv.setViewName("boardSuccess");
		return mv;
	}
	
	@RequestMapping(value="viewBoard1.do", method=RequestMethod.POST)
	public ModelAndView viewBoard1(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		ArrayList<Board1Reply> board1ReplyList = board1ReplyService.getBoard1ReplyList();
		int no = Integer.parseInt(request.getParameter("no"));
		mv.addObject("board1", board1Service.viewBoard1(no));
		mv.addObject("board1ReplyList", board1ReplyList);
		mv.setViewName("viewBoard");
		return mv;
	}
	
	@RequestMapping(value="deleteBoard1.do", method=RequestMethod.POST)
	public ModelAndView deleteBoard1(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mv = new ModelAndView();
		int no = Integer.parseInt(request.getParameter("no"));
		if(board1Service.deleteBoard1(no) != 0){
			ArrayList<Board1> board1List = board1Service.getBoard1List();
			mv.addObject("board1List", board1List);
			//response.sendRedirect("board/board.jsp");
			mv.setViewName("boardSuccess");
		}else{
			mv.setViewName("fail");
		}
		return mv;
	}
}
