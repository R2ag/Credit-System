package com.r2ag.creditsystem.service

import com.r2ag.creditsystem.entity.Customer

interface ICustomerService {

    fun save(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long)
}