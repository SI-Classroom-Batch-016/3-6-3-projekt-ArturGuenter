package com.example.songsbibo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.songsbibo.data.model.Song

class SharedViewModel : ViewModel() {

    val selectedSongItem = MutableLiveData<Song>()

    fun selectedSong(it: Song){
        selectedSongItem.value = it
    }


}