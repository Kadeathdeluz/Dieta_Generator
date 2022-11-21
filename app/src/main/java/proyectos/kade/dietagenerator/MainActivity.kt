package proyectos.kade.dietagenerator

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import proyectos.kade.dietagenerator.adapter.ItemAdapter
import proyectos.kade.dietagenerator.data.DataSource
import proyectos.kade.dietagenerator.model.Day

class MainActivity : AppCompatActivity() {
    private lateinit var myDataset: List<Day>

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myDataset = DataSource().loadDiet(false)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
        val fab = findViewById<FloatingActionButton>(R.id.fab_generate)
        fab.setOnClickListener {
            myDataset = DataSource().loadDiet(true)
            recyclerView.adapter = ItemAdapter(this, myDataset)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.custom_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.share -> {
                share()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun share() {
        val text = myDataset.textToSend()
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }

    private fun List<Day>.textToSend(): String {
        var res = ""
        val length = this.size
        for(i in 0 until length) {
            val actual = this[i]
            res +=
                "Día: ${resources.getString(actual.dayID)}\n" +
                "Primero: ${resources.getString(actual.meal.firstID)}\n"+
                "Segundo: ${resources.getString(actual.meal.secondID)}\n"+
                "Cena: ${resources.getString(actual.dinnerID)}\n\n"
        }
        return res
    }
}