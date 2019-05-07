package com.kce.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kce.dao.S_dao;
import com.kce.model.Product;
import com.kce.model.Signup;

@Controller
public class S_controller {
	    @Autowired
	    HttpServletRequest request;
	    @Autowired
	    S_dao d;
    	@RequestMapping("/")
    	public String start()
    	{
    		return "signup";
    	}
       @RequestMapping("/signup")
       @Transactional
       public String register(@ModelAttribute("signup") Signup s,Model model)
       {
    	   String name=request.getParameter("name");
    	   String pwd=request.getParameter("pwd");
    	   String cpwd=request.getParameter("cpwd");
    	   if(pwd.equals(cpwd))
    	   {
    		   d.adddata(name, pwd);
    	       return "signup";
    	   }
    	   else
    	   {
    		   return "signup";
    	   }
       }
       @RequestMapping("/login")
       public String login(Model m)
    		   {
    	   String n=request.getParameter("n");
    	   String p=request.getParameter("p");
    	   int chk=d.check(n, p);
    	   if(n.equals("admin")&&p.equals("admin"))
    	   {
    		   return "crud";
    	   }
    	   if(chk==1)
    	   {
    		   List<String> mo=d.everymobile();
    		   m.addAttribute("mo",m);
    		   
    		   
    		   return "view";
    	   }
    	   else
    	   {
    		   return "signup";
    	   }
    	   
    		   }
       @RequestMapping("/product")
       public void addpro(@ModelAttribute("product") Product s,Model model)
       {
    	   String m=request.getParameter("mobile");
    	   String l=request.getParameter("laptop");
    	   String b=request.getParameter("books");
    	   d.addproducts(m, l, b);
       }
       @RequestMapping("/delete")
       public void deletepro()
       {
    	   int number=Integer.parseInt(request.getParameter("num"));
    	   d.delete(number);
       }
    	   
}
