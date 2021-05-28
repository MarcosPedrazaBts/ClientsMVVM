package com.example.clientsmvvm.repository

import android.content.Context
import androidx.room.Room
import com.example.clientsmvvm.AppDatabase
import com.example.clientsmvvm.data.Client

class ClientRepository(appContext:Context) {

    private var db:AppDatabase = Room.databaseBuilder(
        appContext,
        AppDatabase::class.java, "database-name"
    ).build()


    fun getClientList():List<Client>{
        return db.userDao().getAll()
    }

    fun getClientsById(clientsIds: IntArray): List<Client> {
        return db.userDao().loadAllByIds(clientsIds)
    }


    //...........................

}