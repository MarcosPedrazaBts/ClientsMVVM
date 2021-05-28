package com.example.clientsmvvm.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.clientsmvvm.repository.ClientRepository

class ClientViewModelFactory(private val clientRepo: ClientRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ClientViewModel(clientRepo) as T
    }

}