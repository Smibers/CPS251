package com.ebookfrenzy.savename.ui.main

//import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ebookfrenzy.savename.databinding.FragmentMainBinding

import com.ebookfrenzy.savename.BR.myViewModel
import androidx.databinding.DataBindingUtil
import com.ebookfrenzy.savename.R




class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    //    private var _binding: FragmentMainBinding? = null
//    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return inflater.inflate(R.layout.fragment_main, container, false)
//        _binding = FragmentMainBinding.inflate(inflater, container, false)
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false)
        binding.setLifecycleOwner(this)
        return binding.root
    }

    //    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.setVariable(myViewModel, viewModel)

//        binding.Result.text = viewModel.getResult().toString()
//
//        binding.AddButton.setOnClickListener {
//            if (binding.Name.text.isNotEmpty()) {
//                viewModel.setAmount(binding.Name.text.toString())
//                binding.Result.text = viewModel.getResult().toString()
//            } else {
//                binding.Result.text = "No Value"
//            }
//        }
    }


}