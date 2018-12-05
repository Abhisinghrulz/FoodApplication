package com.customers.Customers.repository;

import com.customers.Customers.model.CustomerCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerCartRepository extends JpaRepository<CustomerCart,Integer>{
}
