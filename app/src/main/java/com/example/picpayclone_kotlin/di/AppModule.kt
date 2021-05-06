package com.example.picpayclone_kotlin.di

import com.example.picpayclone_kotlin.ui.dashboard.DashboardViewModel
import com.example.picpayclone_kotlin.ui.home.HomeViewModel
import com.example.picpayclone_kotlin.ui.notifications.NotificationsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel {DashboardViewModel() }
    viewModel {NotificationsViewModel() }
}