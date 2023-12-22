package com.example.amikomchat

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RekCafe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rek_cafe)


        val recyclerView: RecyclerView = findViewById(R.id.ListCafe)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = generateItemList()
        val adapter = AdapterCafe(this, itemList)
        recyclerView.adapter = adapter

    }

    private fun generateItemList(): List<ListItem> {
        val itemList = mutableListOf<ListItem>()
        // Tambahkan item ke dalam list sesuai kebutuhan
        itemList.add(ListItem(R.drawable.reborn, "WARUNG REBORN", "start form 5000"))
        itemList.add(ListItem(R.drawable.awali, "AWALI COFFEE", "start form 5000"))
        itemList.add(ListItem(R.drawable.nuri, "NURI COFFEE", "start form 8000"))
        itemList.add(ListItem(R.drawable.lugaru, "LUGARU COFFEE", "start form 12000"))
        itemList.add(ListItem(R.drawable.lestari, "LESTARI COFFEE", "start form 12000"))
        itemList.add(ListItem(R.drawable.sb, "STARBUCKS", "start form 40000"))
        // ...

        return itemList
    }
}
