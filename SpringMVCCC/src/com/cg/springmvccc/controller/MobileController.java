package com.cg.springmvccc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvccc.dto.Mobile;
import com.cg.springmvccc.service.IMobileService;


public class MobileController {

	@Autowired
	IMobileService mobileservice;
	@RequestMapping(value="/home")
	public String getAllMobiles(@ModelAttribute("my")Mobile mob,Map<String,Object> m){
		List<String> mylist= new ArrayList<>();
		mylist.add("Android");
		mylist.add("Iphone");
		mylist.add("Windows");
		mylist.add("Jio");
	
		m.put("cato",mylist);
		return "AddMobile";
	
	}
	@RequestMapping(value="/addData",method=RequestMethod.POST)
	public String addMobileData(@Valid@ModelAttribute("my")Mobile mobile,BindingResult result,Map<String,Object> m)
	{
		mobileservice.addMobile(mobile);
		return "success";
		
	
	}
	
	
	
	
	
	
	
}
