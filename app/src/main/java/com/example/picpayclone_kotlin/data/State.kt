package com.example.picpayclone_kotlin.data

sealed class State<T>{
    class Loading<T>: State<T>()
    class Success<T>: State<T>()
    class Error<T>: State<T>()
}
