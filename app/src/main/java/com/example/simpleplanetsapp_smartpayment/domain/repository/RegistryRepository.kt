package com.example.simpleplanetsapp_smartpayment.domain.repository

import com.example.simpleplanetsapp_smartpayment.domain.entity.Outcome
import com.example.simpleplanetsapp_smartpayment.domain.entity.User

interface RegistryRepository {

    suspend fun setUser(user: User): Outcome<Nothing>

}