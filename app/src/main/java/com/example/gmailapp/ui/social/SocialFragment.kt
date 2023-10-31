package com.example.gmailapp.ui.social

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.gmailapp.databinding.FragmentPrimaryBinding

class SocialFragment : Fragment() {
    private var _binding: FragmentPrimaryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    private lateinit var primaryViewModel: SocialViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        primaryViewModel = ViewModelProvider(this).get(SocialViewModel::class.java)

        _binding = FragmentPrimaryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setupViews()

        return root
    }

    private fun setupViews() {
        val textView: TextView = binding.textPrimary


        primaryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}