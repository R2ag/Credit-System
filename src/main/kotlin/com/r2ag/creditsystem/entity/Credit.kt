package com.r2ag.creditsystem.entity

import com.r2ag.creditsystem.enummeration.Status
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "credit")
data class Credit (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(nullable = false, unique = true)
        val creditCode: UUID =  UUID.randomUUID(),

        @Column(nullable = false)
        val creditValue: BigDecimal = BigDecimal.ZERO,

        @Column(nullable = false)
        val dayFirstInstallment: LocalDate,

        @Column(nullable = false)
        val numberOfInstallment: Int = 0,

        @Enumerated
        val status: Status = Status.IN_PROGRESS,

        @ManyToOne
        val customer: Customer? = null


)
