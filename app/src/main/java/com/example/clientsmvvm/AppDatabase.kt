package com.example.clientsmvvm

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.clientsmvvm.data.Client
import com.example.clientsmvvm.data.daos.ClientDao


@Database(entities = arrayOf(Client::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): ClientDao
}