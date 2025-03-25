package com.f4.recotrip.ui.plan.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.f4.recotrip.R
import com.f4.recotrip.ui.plan.PlanViewModel
import com.f4.recotrip.ui.plan.fragment.CityFragment

class KeywordFragment : Fragment(R.layout.plan_fragment_keyword) {

    private val viewModel: PlanViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val editKeyword = view.findViewById<EditText>(R.id.edit_keyword)
        val btnNext = view.findViewById<Button>(R.id.btn_next)

        btnNext.setOnClickListener {
            val keyword = editKeyword.text.toString()
            viewModel.keyword.value = keyword

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, CityFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}