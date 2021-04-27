package com.totalcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.totalcloud.entity.Customer;

public interface UserAdmRepository extends JpaRepository<Customer,Long>
{

}
