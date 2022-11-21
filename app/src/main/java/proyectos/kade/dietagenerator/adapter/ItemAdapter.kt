package proyectos.kade.dietagenerator.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import proyectos.kade.dietagenerator.R
import proyectos.kade.dietagenerator.model.Day

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Day>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val day: TextView = view.findViewById(R.id.week_day)
        val first: TextView = view.findViewById(R.id.first)
        val second: TextView = view.findViewById(R.id.second)
        val dinner: TextView = view.findViewById(R.id.dinner)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val day = dataset[position]
        holder.day.text = context.resources.getString(day.dayID)
        holder.first.text = context.resources.getString(day.meal.firstID)
        holder.second.text = context.resources.getString(day.meal.secondID)
        holder.dinner.text = context.resources.getString(day.dinnerID)

    }

    override fun getItemCount(): Int = dataset.size
}