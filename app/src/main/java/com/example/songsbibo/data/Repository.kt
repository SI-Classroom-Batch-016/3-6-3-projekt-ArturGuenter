package com.example.songsbibo.data

import com.example.songsbibo.data.model.Song

class Repository {

    fun loadAllSongs():List<Song>{
        return listOf(
            Song("Wunder", "Ayliva & Apache 207", "3:15", false),
            Song("I Like The Way You Kiss Me","Artemas", "3:20",false),
            Song("Pedro","Jaxomy, Agatino Romero & Raffaella Carrà", "2:50",false),
            Song("Stumblin' In","Cyril", "3:30",false),
            Song("Vempa","FOURTY & Bausa", "4:05",false),
            Song("Beautiful Things","Benson Boone", "2:56",false),
            Song("Belong Together","Mark Ambor", "3:30",false),
            Song("Zeit, dass sich was dreht","$"+"OHO BANI, Herbert Grönemeyer & Ericson", "2:35",false),
            Song("Mama hat gesagt","SDP, Sido & Esther Graf", "3:32",false),
            Song("Ur In My Head","Ufo361, Monty Datta & Hinshi", "3:38",false),
            Song("Million Dollar Baby","Tommy Richman", "3:25",false),
        )

    }

    fun loadBibliothek():List<Song>{
        return listOf(

        )
    }

}