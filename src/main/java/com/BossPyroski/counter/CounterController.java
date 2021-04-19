package com.BossPyroski.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class CounterController {
@RequestMapping("/")
	public String Main(HttpSession session) {
	session.setAttribute("count", 0);
	
		return "Index.jsp";
}
@RequestMapping("/session")
public String mysession(HttpSession session, Model model) {
	Integer count = (Integer) session.getAttribute("count");
	count++;
	session.setAttribute("count", count);
	return "Session.jsp";
}
}
