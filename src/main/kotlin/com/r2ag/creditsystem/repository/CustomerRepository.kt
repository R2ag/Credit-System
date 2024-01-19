package com.r2ag.creditsystem.repository

import com.r2ag.creditsystem.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository:JpaRepository<Customer, Long> {
}