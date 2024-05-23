package com.example.songsbibo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.songsbibo.Adapter.HomeAdapter
import com.example.songsbibo.R
import com.example.songsbibo.SharedViewModel
import com.example.songsbibo.data.Repository
import com.example.songsbibo.data.model.Song
import com.example.songsbibo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()

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
        //val recyclerView = binding.recyclerViewAll
        //recyclerView.adapter = HomeAdapter(songs)

        val itemClickedCallback : (Song) -> Unit = {

            viewModel.selectedSong(it)

            findNavController().navigate(R.id.detailFragment)
        }

        val adapter = HomeAdapter(songs,itemClickedCallback)
        binding.recyclerViewAll.adapter = adapter



    }


}