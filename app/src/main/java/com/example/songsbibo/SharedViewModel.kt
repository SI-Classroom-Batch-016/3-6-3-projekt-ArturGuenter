package com.example.songsbibo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.songsbibo.data.Repository
import com.example.songsbibo.data.model.Song

class SharedViewModel : ViewModel() {

    val repoAllSongs = Repository().loadAllSongs()

    val repoBibo = Repository().loadBibliothek().toMutableList()

    val selectedSongItem = MutableLiveData<Song>()



    fun selectedSong(it: Song){
        selectedSongItem.value = it
    }


    fun addToBibo(song: Song){
       repoBibo.add(song)
        Log.d("Liste von Songs", "$repoBibo")

    }

    fun removeFromBibo(song:Song){
        repoBibo.remove(song)
        Log.d("Liste von Songs", "$repoBibo")
    }


}