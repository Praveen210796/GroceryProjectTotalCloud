package com.totalcloud.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.totalcloud.entity.Contact;

public interface ContactAdmRepository extends JpaRepository<Contact, Long> 
{
	
}
