package com.kevintimus.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val carta = ArrayList<Item>()

        carta.add(Item("Lomo con queso", R.drawable.lomo_queso, "4.10€"))
        carta.add(Item("\"Jacinto\": Lomo, bacon y queso", R.drawable.jacinto, "4.40€"))
        carta.add(Item("Lomo, pimiento y queso", R.drawable.lomo_pimiento, "4.40€"))
        carta.add(Item("Lomo, jamón serrano, queso camembert y pimiento", R.drawable.lomo_jamon, "4.40€"))
        carta.add(Item("Redondo de ternera, queso brie, cebolla caramelizada y nueces", R.drawable.redondo_ternera, "4.80€"))
        carta.add(Item("Pollo, lechuga, tomate y mayonesa", R.drawable.pollo_lechuga, "4.50€"))
        carta.add(Item("Pollo \"teriyaki\", sésamo, espárragos verdes y mayonesa de wasabi", R.drawable.pollo_teriyaki, "4.95€"))
        carta.add(Item("Pollo rebozado, crujiente de jamón, queso gouda y mayonesa", R.drawable.pollo_rebozado, "4.95€"))
        carta.add(Item("\"Pepito\" de ternera (pan con tomate)", R.drawable.pepito, "5.55€"))
        carta.add(Item("Butifarra del país (pan con tomate)", R.drawable.butifarra, "3.80€"))

        // This will pass the ArrayList to our Adapter
        val adapter = Adapter(carta)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}