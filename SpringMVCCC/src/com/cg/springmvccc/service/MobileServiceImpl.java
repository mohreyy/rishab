package com.cg.springmvccc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvccc.dao.IMobileDao;
import com.cg.springmvccc.dto.Mobile;
@Service("mobileservice")
@Transactional
public class MobileServiceImpl implements IMobileService {

	@Autowired
	IMobileDao mobiledao;
	
	@Override
	public void addMobile(Mobile mobile) {
		mobiledao.addMobile(mobile);
		
	}
	
	

}
