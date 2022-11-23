package proyectos.kade.dietagenerator.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import proyectos.kade.dietagenerator.databinding.ListItemBinding
import proyectos.kade.dietagenerator.model.Day

class ItemAdapter(private val context: Context, private val dataset: List<Day>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemBinding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(context, itemBinding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val day: Day = dataset[position]
        holder.bind(day)
    }

    override fun getItemCount(): Int = dataset.size

    class ItemViewHolder(private val context: Context, private val listItemBinding: ListItemBinding) : RecyclerView.ViewHolder(listItemBinding.root) {
        fun bind(day: Day) {
            listItemBinding.apply{
                weekDay.text = context.resources.getString(day.dayID)
                first.text = context.resources.getString(day.meal.firstID)
                second.text = context.resources.getString(day.meal.secondID)
                dinner.text = context.resources.getString(day.dinnerID)
            }
        }
    }
}