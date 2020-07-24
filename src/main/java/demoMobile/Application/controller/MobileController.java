package demoMobile.Application.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import demoMobile.Application.Service.impl.MobileServiceImpl;
import demoMobile.Application.model.Mobile;

@RestController
@RequestMapping("/mobile")

public class MobileController {
	
	@Autowired
	private MobileServiceImpl mobileService;
	
	@RequestMapping(value="/getmobile")
	public ResponseEntity<Set<Mobile>> getAllMobile(){
		return new ResponseEntity<Set<Mobile>>(mobileService.getAllMobile(),HttpStatus.OK);
	}

}
