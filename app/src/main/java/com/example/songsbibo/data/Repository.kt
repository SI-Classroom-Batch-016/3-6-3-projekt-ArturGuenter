package com.example.songsbibo.data

import com.example.songsbibo.data.model.Song

class Repository {

    fun loadAllSongs():List<Song>{
        return listOf(
            Song("Wunder", "Ayliva & Apache 207", "3:15", false,1),
            Song("I Like The Way You Kiss Me","Artemas", "3:20",false,2),
            Song("Pedro","Jaxomy, Agatino Romero & Raffaella Carrà", "2:50",false,3),
            Song("Stumblin' In","Cyril", "3:30",false,4),
            Song("Vempa","FOURTY & Bausa", "4:05",false,5),
            Song("Beautiful Things","Benson Boone", "2:56",false,6),
            Song("Belong Together","Mark Ambor", "3:30",false,7),
            Song("Zeit, dass sich was dreht","$"+"OHO BANI, Herbert Grönemeyer & Ericson", "2:35",false,8),
            Song("Mama hat gesagt","SDP, Sido & Esther Graf", "3:32",false,9),
            Song("Ur In My Head","Ufo361, Monty Datta & Hinshi", "3:38",false,10),
            Song("Million Dollar Baby","Tommy Richman", "3:25",false,11),
        )

    }

    fun loadBibliothek():List<Song>{
        return listOf(
            Song("Ur In My Head","Ufo361, Monty Datta & Hinshi", "3:38",false,10),

            )
    }

}