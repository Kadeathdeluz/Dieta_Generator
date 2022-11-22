package proyectos.kade.dietagenerator.ui.diet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import proyectos.kade.dietagenerator.R

class DietFragment : Fragment() {

    companion object {
        fun newInstance() = DietFragment()
    }

    private lateinit var viewModel: DietViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.diet_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DietViewModel::class.java)
        // TODO: Use the ViewModel
    }

}