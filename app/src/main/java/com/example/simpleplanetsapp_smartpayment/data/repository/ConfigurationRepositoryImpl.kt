package com.example.simpleplanetsapp_smartpayment.data.repository

import com.example.simpleplanetsapp_smartpayment.data.database.UsersDao
import com.example.simpleplanetsapp_smartpayment.domain.entity.ErrorDescription
import com.example.simpleplanetsapp_smartpayment.domain.entity.asOutcome
import com.example.simpleplanetsapp_smartpayment.domain.repository.ConfigurationRepository
import javax.inject.Inject

class ConfigurationRepositoryImpl @Inject constructor(
    private val dao: UsersDao):
    ConfigurationRepository {

    override suspend fun getSessionStarted() =
        (dao.getFirst() != null).asOutcome(ErrorDescription.MissingResponse)

}