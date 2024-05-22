package com.example.songsbibo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.songsbibo.R
import com.example.songsbibo.databinding.FragmentBibliothekBinding
import com.example.songsbibo.databinding.FragmentHomeBinding


class BibliothekFragment : Fragment() {

    private lateinit var binding: FragmentBibliothekBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBibliothekBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}