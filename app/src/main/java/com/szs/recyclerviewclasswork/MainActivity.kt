package com.szs.recyclerviewclasswork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewclasswork.Adapter.NikeAdapter
import com.szs.recyclerviewclasswork.model.Nike

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.nike_recycler)

        val nikeArray = ArrayList<Nike>()

        nikeArray.add(Nike("001", "Nike Superfly 6 \nElite FG", "$799", R.drawable.one))
        nikeArray.add(Nike("002", "Air Vapormax \nFlyknit", "$1280", R.drawable.two))
        nikeArray.add(Nike("003", "Air Jordan 14 \nRetro Se", "$2400", R.drawable.three))
        nikeArray.add(Nike("004", "LeFron XVI \nLow EP", "$1099", R.drawable.four))
        nikeArray.add(Nike("005", "Jordan Why Not \n Zer0.2 PF", "$2699", R.drawable.five))
        nikeArray.add(Nike("006", "LeBron XVI \nSB EP", "$1280", R.drawable.six))

        val nikeAdapter = NikeAdapter(nikeArray)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = nikeAdapter

    }
}
