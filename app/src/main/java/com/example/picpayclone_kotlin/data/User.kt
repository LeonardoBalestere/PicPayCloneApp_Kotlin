package com.example.picpayclone_kotlin.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val login: String = "",
    val password: String = "",
    val email: String = "",
    val fullName: String = "",
    val cpf: String = "",
    val birthDate: String = "",
    val cellphoneNumber: String = "",
    val balance: Double = 0.0
): Parcelable
