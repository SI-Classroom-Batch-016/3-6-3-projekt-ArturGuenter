package com.example.songsbibo.data

import com.example.songsbibo.R
import com.example.songsbibo.data.model.Song

class Repository {

    fun loadAllSongs():List<Song>{
        return listOf(
            Song("Wunder", "Ayliva & Apache 207", "3:15", false, R.drawable._1000),
            Song("I Like The Way You Kiss Me","Artemas", "3:20",false,R.drawable._20000),
            Song("Pedro","Jaxomy, Agatino Romero & Raffaella Carrà", "2:50",false,R.drawable._30000),
            Song("Stumblin' In","Cyril", "3:30",false,R.drawable._40000),
            Song("Vempa","FOURTY & Bausa", "4:05",false,R.drawable._50000),
            Song("Beautiful Things","Benson Boone", "2:56",false,R.drawable._60000),
            Song("Belong Together","Mark Ambor", "3:30",false,R.drawable._70000),
            Song("Zeit, dass sich was dreht","$"+"OHO BANI, Herbert Grönemeyer & Ericson", "2:35",false,R.drawable._80000),
            Song("Mama hat gesagt","SDP, Sido & Esther Graf", "3:32",false,R.drawable._90000),
            Song("Ur In My Head","Ufo361, Monty Datta & Hinshi", "3:38",false,R.drawable._10000000),
            Song("Million Dollar Baby","Tommy Richman", "3:25",false,R.drawable._110000000),
        )

    }

    fun loadBibliothek():List<Song>{
        return listOf(

            )
    }

}