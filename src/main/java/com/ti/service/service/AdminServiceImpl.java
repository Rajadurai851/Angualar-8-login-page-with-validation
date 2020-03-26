package com.ti.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ti.service.entity.AdminDetailEntity;
import com.ti.service.repository.AdminDetailsRepository;

@Component
public class AdminServiceImpl implements AdminService {
	@Autowired(required=true)
	private AdminDetailsRepository repository;


	@Override
	public int saveAdminDetail(AdminDetailEntity adminDetail) {
		AdminDetailEntity saveSuccess =  repository.save(adminDetail);
		if(saveSuccess != null) {
		return 1;
		}
		return 0;
	}

	@Override
	public int validateUser(AdminDetailEntity adminDetail) {
		
		AdminDetailEntity result = repository.findByEmailidAndPassword(adminDetail.getEmailid(), adminDetail.getPassword());
		if(result!=null) {
		return 1;
		}
		return 0;
		
	}

}
