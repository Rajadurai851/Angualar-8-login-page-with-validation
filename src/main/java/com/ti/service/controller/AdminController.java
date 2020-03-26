package com.ti.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ti.service.entity.AdminDetailEntity;
import com.ti.service.service.AdminService;

@RestController  
@RequestMapping("/api")  
@CrossOrigin(origins = "http://localhost:4200")  
public class AdminController {

	@Autowired  
    private AdminService adminService;  
	
	@PostMapping("/saveAdmin")  
    public int saveAdminDetail(@RequestBody AdminDetailEntity adminDetail) {  
		System.out.println("  Payload  --------->   " +adminDetail);
		
        return adminService.saveAdminDetail(adminDetail);  
    }  
	
	 @PostMapping("/login")  
	    public ResponseEntity<Integer> login(@RequestBody AdminDetailEntity adminDetail)  
	    { 
		 int status =  adminService.validateUser(adminDetail);
		 if(status ==1) {
		 return new ResponseEntity<Integer>(status, HttpStatus.OK);  
		 }
		 else {
			 return new ResponseEntity<Integer>(status, HttpStatus.BAD_REQUEST);  
		 }
	    }
}
