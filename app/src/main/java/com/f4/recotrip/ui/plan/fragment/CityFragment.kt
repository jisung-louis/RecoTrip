package com.f4.recotrip.ui.plan.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.f4.recotrip.R
import com.f4.recotrip.ui.plan.PlanViewModel

class CityFragment : Fragment(R.layout.plan_fragment_city) {

    private val viewModel: PlanViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val resultText = view.findViewById<TextView>(R.id.text_city)

        viewModel.keyword.observe(viewLifecycleOwner) { keyword ->
            resultText.text = "선택한 키워드: $keyword"
        }
    }
}