package com.example.simpleplanetsapp_smartpayment.domain.repository

import com.example.simpleplanetsapp_smartpayment.domain.entity.Outcome
import com.example.simpleplanetsapp_smartpayment.domain.entity.Planet

interface PlanetRepository {

    suspend fun getAll(): Outcome<List<Planet>>

    suspend fun getPlanetDetails(id: String): Outcome<Planet.Information>

}