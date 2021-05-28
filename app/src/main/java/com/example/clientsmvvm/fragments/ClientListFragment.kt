package com.example.clientsmvvm.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.clientsmvvm.R
import com.example.clientsmvvm.repository.ClientRepository
import com.example.clientsmvvm.viewmodels.ClientViewModel
import com.example.clientsmvvm.viewmodels.ClientViewModelFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ClientListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ClientListFragment : Fragment(R.layout.fragment_client_list) {


    private lateinit var clientViewModelfactory:ClientViewModelFactory
    private lateinit var clientViewModel:ClientViewModel



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val repo = ClientRepository(requireContext().applicationContext)
        clientViewModelfactory = ClientViewModelFactory(repo)

        clientViewModel = ViewModelProvider(this, clientViewModelfactory).get(ClientViewModel::class.java)


        clientViewModel.clientLivedata.observe(viewLifecycleOwner, Observer {
            clientList ->

            //
        })


    }



}