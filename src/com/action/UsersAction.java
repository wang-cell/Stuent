package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bean.Users;
import com.biz.IUsersBiz;

public class UsersAction implements Controller {
	private IUsersBiz ibiz;
	
  public IUsersBiz getIbiz() {
		return ibiz;
	}

	public void setIbiz(IUsersBiz ibiz) {
		this.ibiz = ibiz;
	}


@Override
public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	System.out.println("111111111111111");
	String uname=request.getParameter("uname");
	String passwd=request.getParameter("passwd");
	Users us=new Users(uname,passwd);
	boolean flag=ibiz.chaeck(us);
	ModelAndView mv  = new ModelAndView();
	  if(flag){
		  mv.addObject("us",us);
		  mv.setViewName("loginok.jsp");
		 
	  }else{
		  mv.setViewName("error.jsp");
	  }
	return mv;
}
}
