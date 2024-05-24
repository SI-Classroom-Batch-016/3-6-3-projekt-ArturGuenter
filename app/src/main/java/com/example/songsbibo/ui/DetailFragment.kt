package com.example.songsbibo.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.songsbibo.R
import com.example.songsbibo.SharedViewModel
import com.example.songsbibo.data.model.Song
import com.example.songsbibo.databinding.FragmentDetailBinding
import com.example.songsbibo.databinding.FragmentHomeBinding


class DetailFragment : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        viewModel.selectedSongItem.observe(viewLifecycleOwner){
            Log.d("SelectedSongItem", "$it")

            binding.textView2Interpret.text = it.interpret
            binding.textViewSong.text = it.name
            binding.imageViewCover.setImageResource(it.cover)

        }

        binding.imageViewArrowBack.setOnClickListener {

            findNavController().navigateUp()
        }


        binding.imageViewHinzufGenEntfernenButton.setOnClickListener {
            viewModel.addToBibo(Song(
                viewModel.selectedSongItem.value!!.name,
                viewModel.selectedSongItem.value!!.interpret,
                viewModel.selectedSongItem.value!!.dauer,
                viewModel.selectedSongItem.value!!.liked,
                viewModel.selectedSongItem.value!!.cover)
            )

        }


    }

}