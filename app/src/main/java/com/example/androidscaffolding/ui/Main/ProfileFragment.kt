package com.example.androidscaffolding.ui.Main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidscaffolding.R
import com.example.androidscaffolding.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var mBinding : FragmentProfileBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentProfileBinding.inflate(inflater, container, false)
        mBinding = binding
        return  mBinding?.root
    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }
}