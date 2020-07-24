package demoMobile.Application.Service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demoMobile.Application.model.Mobile;



@Service
public class MobileServiceImpl {
	
	@Autowired
	private demoMobile.Application.Service.MobileService MobileService;

	public MobileServiceImpl(demoMobile.Application.Service.MobileService MobileService) {
		super();
		this.MobileService = MobileService;
	}
	public MobileServiceImpl() {}
	public Set<Mobile> getAllMobile(){
		return MobileService.getAllMobile();
	}
//	public int addQueries(Mobile mobile){
//		return MobileService.addMobile(mobile.getRetriveId(), mobile.getBrand(),mobile.getPrice(), mobile.getContry(), mobile.getSpecification());
//	}

}
