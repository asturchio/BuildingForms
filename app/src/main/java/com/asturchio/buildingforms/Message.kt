package com.asturchio.buildingforms

import java.io.Serializable

data class Message (
    val title: String?,
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val email: String,
    val password: String,
    val confirmPassword: String
    ): Serializable



