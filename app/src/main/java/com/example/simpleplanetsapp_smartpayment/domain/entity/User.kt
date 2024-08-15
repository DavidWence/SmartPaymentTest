package com.example.simpleplanetsapp_smartpayment.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey val id: String,
    val name: String,
    val middleName: String,
    val lastName: String,
    val birthDate: String,
    val country: String)
