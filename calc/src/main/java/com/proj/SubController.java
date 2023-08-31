package com.proj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proj.services.SubService;

@Controller
public class SubController {
	
	
	
	@RequestMapping("/sub/{t1}/{t2}")
	public ModelAndView subURL(@PathVariable int t1,@PathVariable int t2,HttpServletRequest request,HttpServletResponse response)
	{
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		if(t1<-1000000000 || t2<-1000000000 || t1>1000000000 || t2>1000000000)
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("display");
			mv.addObject("result","Out of Bounds,input range [-10^9,+10^9]");
			return mv;
		}
		
		SubService subIt = new SubService();
		int k = subIt.sub(t1, t2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		if(i<-1000000000 || j<-1000000000 || i>1000000000 || j>1000000000)
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("display");
			mv.addObject("result","Out of Bounds,input range [-10^9,+10^9]");
			return mv;
		}
		
		SubService subIt = new SubService();
		int k = subIt.sub(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
	}

}
