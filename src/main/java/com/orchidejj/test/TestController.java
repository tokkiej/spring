package com.orchidejj.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orchidejj.test.dto.MemberDto;

@Controller
public class TestController {

	@RequestMapping(value ="/")
	public String index( ) {
		return "home";
	}
	
	@RequestMapping(value ="/test")
	public String test( ) {
		return "test";
	}
	
	@RequestMapping(value ="/login")
	public String login( ) {
		return "login";
	}		
		
	@RequestMapping(value ="/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("id");//tiger
		String mpw = request.getParameter("pw");//12345
		
		model.addAttribute("memberID", mid);
		model.addAttribute("memberPW", mpw);
		
		return "loginOk";
	}		
		
	@RequestMapping(value ="/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value ="/joinOk")
	public String joinOk(MemberDto memberDto, Model model) {
		
		model.addAttribute("mDto", memberDto)
		
		
		return "joinOk";
	}
	
	
	
}
