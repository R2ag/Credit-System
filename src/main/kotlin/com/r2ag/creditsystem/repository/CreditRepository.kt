package com.r2ag.creditsystem.repository

import com.r2ag.creditsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository

interface CreditRepository: JpaRepository<Credit, Long> {
}