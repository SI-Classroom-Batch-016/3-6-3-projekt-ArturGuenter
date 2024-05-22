package com.example.songsbibo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.songsbibo.Adapter.HomeAdapter
import com.example.songsbibo.R
import com.example.songsbibo.data.Repository
import com.example.songsbibo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val songs = Repository().loadAllSongs()
        val recyclerView = binding.recyclerViewAll
        recyclerView.adapter = HomeAdapter(songs)

    }


}