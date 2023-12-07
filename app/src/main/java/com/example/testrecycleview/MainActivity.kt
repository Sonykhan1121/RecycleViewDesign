package com.example.testrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
        lateinit var sonyList_recycle:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sonyList_recycle = findViewById(R.id.sonyList_recycle_id)
        val songobject : MutableList<Songs> = mutableListOf<Songs>()
        songobject.add(Songs("Teri Meri","Song by Rahat Fateh Ali Khan and Shreya Ghoshal",R.drawable.song1))
        songobject.add(Songs("Sanam Teri kasam","Song by Ankit Tiwari and Palak Muchhal",R.drawable.song2))
        songobject.add(Songs("Badtameez Dil","Songs Of Ranbir Kapoor  by Benny Dayal, Shefali Alvares",R.drawable.song3))
        songobject.add(Songs("Saiyyan","Song by Kailash Kher, Naresh Kamath, and Paresh Kamath",R.drawable.song4))
        songobject.add(Songs("Tu Hai Ki Nahi","Song by Ankit Tiwari",R.drawable.song5))
        songobject.add(Songs("Baarish","Song by Ash King and Shashaa Tirupati",R.drawable.song6))
        songobject.add(Songs("Tumsey Pyaar Karke","Song by Jubin Nautiyal, Payal Dev, and Tulsi Kumar",R.drawable.song7))
        songobject.add(Songs("Aashiqui Aa Gayi","Song by Arijit Singh",R.drawable.song8))
        songobject.add(Songs(" Do Dil Mil Rahe Hain","Written By: Anand Bakshi",R.drawable.song9))
        songobject.add(Songs("Bahon Ke Darmiyan","The Musical is one of best Bollywood romantic songs.",R.drawable.song10))
        songobject.add(Songs("Zara Zara","Zara Zara song from Rehnaa Hai Terre Dil Mein is one of the most romantic Bollywood songs.",R.drawable.song11))


        sonyList_recycle.adapter = MyAdapter(songobject)
        sonyList_recycle.layoutManager  = LinearLayoutManager(this)
    }
}