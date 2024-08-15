package com.example.simpleplanetsapp_smartpayment.domain.usecase

import com.example.simpleplanetsapp_smartpayment.domain.repository.ConfigurationRepository
import javax.inject.Inject

class GetSessionStarted @Inject constructor(private val repository: ConfigurationRepository) {

    suspend operator fun invoke() = repository.getSessionStarted()

}