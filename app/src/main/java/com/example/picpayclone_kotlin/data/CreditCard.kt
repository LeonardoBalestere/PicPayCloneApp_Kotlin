package com.example.picpayclone_kotlin.data

data class CreditCard(
    val cardFlag: CardFlag = CardFlag.VISA,
    val CardNumber: String = "" ,
    val holderName: String = "",
    val expirationDate: String = "",
    val securityCode: String = "",
    val tokenNumber: String = "",
    val user: User = User(),
    val isSave: Boolean = false
)
