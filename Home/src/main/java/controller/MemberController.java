package controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MemberController {
	
	private MemberService memberService;
	
	@Autowired
	public void setMemberService(MemberService memberService){
		this.memberService = memberService;
	}
	
	@RequestMapping(value="loginCheck.do", method=RequestMethod.POST)
	public ModelAndView getMember(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		HashMap<String, String> member = new HashMap<String, String>();
		member.put("id", id);
		member.put("pw", pw);
		
		ModelAndView mv = new ModelAndView();
		if(memberService.getMember(member) != null){
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			mv.addObject("member", member);
			mv.setViewName("success");
		}else{
			mv.setViewName("fail");
		}
		return mv;
	}
	
	
	/*@RequestMapping(value="search.do", method=RequestMethod.POST)	
	public ModelAndView Search(HttpServletRequest request){
		String type = request.getParameter("type");
		String content = request.getParameter("content");
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("type", type);
		map.put("content", content);
		
		ArrayList<Board1> projects = memberService.search(map);
		ModelAndView mv = new ModelAndView();
		mv.addObject("projects",projects);
		mv.setViewName("index");
		return mv;
	}*/
	

	/*@RequestMapping(value="ajaxEx1.do", method=RequestMethod.GET, produces={"application/json"})
	public @ResponseBody InfogenProject ajaxEx1(HttpServletRequest request){
		String projectNo =  request.getParameter("projectNo");
		
		InfogenProject projects =  testService.getMember(projectNo);
		
		return projects;
	}*/
}
