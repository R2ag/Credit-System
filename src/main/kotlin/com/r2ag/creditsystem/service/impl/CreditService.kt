package com.r2ag.creditsystem.service.impl

import com.r2ag.creditsystem.entity.Credit
import com.r2ag.creditsystem.repository.CreditRepository
import com.r2ag.creditsystem.repository.CustomerRepository
import com.r2ag.creditsystem.service.ICreditService
import java.util.*

class CreditService(
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService
) : ICreditService{
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
       return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> {
        TODO("Not yet implemented")
    }

    override fun findByCreditCode(creditCode: UUID): Credit {
        TODO("Not yet implemented")
    }
}