package com.example.gmailapp.ui.promotions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.gmailapp.databinding.FragmentPrimaryBinding
import com.example.gmailapp.databinding.FragmentPromotionBinding

class PromotionFragment : Fragment() {
    private var _binding: FragmentPromotionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    private lateinit var promotionViewModel: PromotionViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
      promotionViewModel = ViewModelProvider(this).get(PromotionViewModel::class.java)

        _binding = FragmentPromotionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setupViews()

        return root
    }

    private fun setupViews() {
        val textView: TextView = binding.textPromotion


        promotionViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}