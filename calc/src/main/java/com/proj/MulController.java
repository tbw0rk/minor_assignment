package com.proj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.proj.services.MulService;

@Controller
public class MulController 
{
	
	
	@RequestMapping("/mul/{t1}/{t2}")
	public ModelAndView mulURL(@PathVariable int t1,@PathVariable int t2,HttpServletRequest request,HttpServletResponse response)
	{
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		if(t1<-1000 || t2<-10000 || t1>10000 || t2>10000)
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("display");
			mv.addObject("result","Out of Bounds,input range [-10^4,+10^4]");
			return mv;
		}
		
		MulService mulIt = new MulService();
		int k = mulIt.mul(t1, t2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
	}
	
	
	
	@RequestMapping("/mul")
	public ModelAndView mul(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		if(i<-10000 || j<-10000 || i>10000 || j>10000)
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("display");
			mv.addObject("result","Out of Bounds,input range [-10^4,+10^4]");
			return mv;
		}
		
		MulService mulIt = new MulService();
		int k = mulIt.mul(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
	}
}
