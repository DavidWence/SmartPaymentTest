package com.example.simpleplanetsapp_smartpayment.domain.repository

import com.example.simpleplanetsapp_smartpayment.domain.entity.Outcome

interface UserInfoRepository {

    fun getName(): Outcome<String>

}