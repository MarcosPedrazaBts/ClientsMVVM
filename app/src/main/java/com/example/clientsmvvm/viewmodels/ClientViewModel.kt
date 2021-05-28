package com.example.clientsmvvm.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.viewModelScope
import com.example.clientsmvvm.data.Client
import com.example.clientsmvvm.repository.ClientRepository
import kotlinx.coroutines.launch

class ClientViewModel(private val clientRepository: ClientRepository) : ViewModel() {

    val clientLivedata = MutableLiveData<List<Client>>()


    init {
        getClientList()
    }

    private fun getClientList() {
        viewModelScope.launch {
            val clientList = clientRepository.getClientList()
            clientLivedata.value = clientList
        }
    }


}