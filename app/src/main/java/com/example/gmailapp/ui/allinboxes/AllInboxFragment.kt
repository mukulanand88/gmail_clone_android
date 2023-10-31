package com.example.gmailapp.ui.allinboxes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.gmailapp.databinding.FragmentAllinboxBinding
import com.example.gmailapp.databinding.FragmentPrimaryBinding

class AllInboxFragment : Fragment() {
    private var _binding: FragmentAllinboxBinding? = null


    private val binding get() = _binding!!


    private lateinit var allInboxViewModel: AllInboxViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        allInboxViewModel = ViewModelProvider(this).get(AllInboxViewModel::class.java)

        _binding = FragmentAllinboxBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setupViews()

        return root
    }

    private fun setupViews() {
        val textView: TextView = binding.textAllinbox


      allInboxViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}