package com.example.gmailapp.ui.primary

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmailapp.R
import com.example.gmailapp.databinding.FragmentPrimaryBinding
import com.example.gmailapp.ui.allinboxes.AllinboxAdapter

class PrimaryFragment : Fragment() {
    private var _binding: FragmentPrimaryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    private lateinit var primaryViewModel: PrimaryViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        primaryViewModel = ViewModelProvider(this).get(PrimaryViewModel::class.java)

        _binding = FragmentPrimaryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setupViews()

        return root
    }

    private fun setupViews() {
        primaryViewModel.getGmailList()

        primaryViewModel.gmailList.observe(viewLifecycleOwner){ listOfGmail->

            val allInboxAdapter = AllinboxAdapter(listOfGmail)
            binding.allinboxRV.layoutManager = LinearLayoutManager(activity)
            binding.allinboxRV.setHasFixedSize(true)
            binding.allinboxRV.adapter = allInboxAdapter

            Log.d("Mukul",""+listOfGmail.size)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}