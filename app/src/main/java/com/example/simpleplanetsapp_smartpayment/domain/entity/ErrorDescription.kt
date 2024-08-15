package com.example.simpleplanetsapp_smartpayment.domain.entity

sealed class ErrorDescription {

    object Unknown: ErrorDescription()
    object MissingResponse: ErrorDescription()

}