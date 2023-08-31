package com.proj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proj.services.DivService;


@Controller
public class DivController {
	
	@RequestMapping("/div/{t1}/{t2}")
	public ModelAndView divURL(@PathVariable int t1,@PathVariable int t2,HttpServletRequest request,HttpServletResponse response)
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
		
		DivService divIt = new DivService();
		int k = divIt.div(t1, t2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		if(k==Integer.MAX_VALUE)
		{
			mv.addObject("result","Invalid, 0 division");
			return mv;
		}
		mv.addObject("result",k);
		
		return mv;
	}
	
	@RequestMapping("/div")
	public ModelAndView div(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
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
		
		DivService divIt = new DivService();
		int k = divIt.div(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		if(k==Integer.MAX_VALUE)
		{
			mv.addObject("result","Invalid, 0 division");
			return mv;
		}
		mv.addObject("result",k);
		
		return mv;
	}

}
