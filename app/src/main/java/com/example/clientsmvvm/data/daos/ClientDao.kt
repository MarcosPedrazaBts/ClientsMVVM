package com.example.clientsmvvm.data.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.clientsmvvm.data.Client

@Dao
interface ClientDao {
    @Query("SELECT * FROM client")
    fun getAll(): List<Client>

    @Query("SELECT * FROM client WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Client>

    @Query("SELECT * FROM client WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Client

    @Insert
    fun insertAll(vararg users: Client)

    @Delete
    fun delete(user: Client)

}