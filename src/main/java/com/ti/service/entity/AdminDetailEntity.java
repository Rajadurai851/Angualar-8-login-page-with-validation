package com.ti.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity  
@Table(name="admin_detail") 
@Data
public class AdminDetailEntity {

	 @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  
	    @Column(name="admin_id")  
	    private int adminID;  
	      
	    @Column(name="email_id" , unique=true)  
	    public String emailid;  
	      
	    @Column(name="name")  
	    public String name;  
	      
	    @Column(name="password")  
	    public String password;  
	
}
