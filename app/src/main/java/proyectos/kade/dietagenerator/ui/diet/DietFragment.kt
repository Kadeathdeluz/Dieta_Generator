package proyectos.kade.dietagenerator.ui.diet

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import proyectos.kade.dietagenerator.adapter.ItemAdapter
import proyectos.kade.dietagenerator.data.DataSource
import proyectos.kade.dietagenerator.databinding.DietFragmentBinding
import proyectos.kade.dietagenerator.model.Day

class DietFragment : Fragment() {

    var myDataset: List<Day>

    private var _binding: DietFragmentBinding? = null
    private val binding get() = _binding!!

    init {
        myDataset = DataSource().loadDiet(false)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DietFragmentBinding.inflate(inflater,container, false)
        binding.recyclerView.apply {
            adapter = ItemAdapter(requireContext(), myDataset)
            setHasFixedSize(true)
        }
        binding.fabGenerate.setOnClickListener {
            myDataset = DataSource().loadDiet(true)
            binding.recyclerView.adapter = ItemAdapter(requireContext(), myDataset)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}