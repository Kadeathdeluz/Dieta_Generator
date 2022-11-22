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
import proyectos.kade.dietagenerator.ui.diet.DietFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        val text = DietFragment().myDataset.textToSend()
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