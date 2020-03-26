package com.ti.service.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ti.service.entity.AdminDetailEntity;

@Service
public interface AdminService {

	
		public int saveAdminDetail(AdminDetailEntity adminDetail); 
		
		public int validateUser(AdminDetailEntity adminDetail); 
		
		
}
