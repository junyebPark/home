package com.mycompany.myapp09.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp09.member.service.MemberService;

@Controller
public class MemberController {
   @Autowired
   private MemberService memberService;
  
   @RequestMapping(value = "index", method = RequestMethod.GET)
   public ModelAndView memberInsert(ModelAndView mv) {
      mv.setViewName("index");
      return mv;
   }
   
   @PostMapping("idCheck")
	@ResponseBody
	public String idCheck(@RequestParam("id") String id) {
		System.out.println("id : " + id);
		
		String resultStr = "";
		int result = 0;
		try {
			result = memberService.idCheck(id);
		} catch (Exception e) {
			e.printStackTrace();
			resultStr = "ajax 통신 실패";
		}
		if (result == 1) {
			resultStr = "false";
		} else {
			resultStr = "true";
		}
		return resultStr;
	}

}