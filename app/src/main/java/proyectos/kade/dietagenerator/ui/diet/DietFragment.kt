package proyectos.kade.dietagenerator.ui.diet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import proyectos.kade.dietagenerator.R
import proyectos.kade.dietagenerator.adapter.ItemAdapter
import proyectos.kade.dietagenerator.data.DataSource
import proyectos.kade.dietagenerator.model.Day

class DietFragment : Fragment() {

    companion object {
        fun newInstance() = DietFragment()
    }
    lateinit var myDataset: List<Day>
    /*private lateinit var binding: DietFragmentBinding*/
    private lateinit var viewModel: DietViewModel

    /*override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        myDataset = DataSource().loadDiet(false)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
        val fab = findViewById<FloatingActionButton>(R.id.fab_generate)
        fab.setOnClickListener {
            myDataset = DataSource().loadDiet(true)
            recyclerView.adapter = ItemAdapter(this, myDataset)
        }
        return inflater.inflate(R.layout.diet_fragment, container, false)
    }*/

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DietViewModel::class.java)
        // TODO: Use the ViewModel
    }

}