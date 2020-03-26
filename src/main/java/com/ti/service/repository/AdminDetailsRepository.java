package com.ti.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ti.service.entity.AdminDetailEntity;

@Repository
public interface AdminDetailsRepository extends JpaRepository<AdminDetailEntity, Integer> {
	
	public  AdminDetailEntity findByEmailidAndPassword(String email,String password);

}
