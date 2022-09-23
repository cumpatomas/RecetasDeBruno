package com.cumpatomas.brunosrecipes.ui.homefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.lottie.LottieDrawable
import com.cumpatomas.brunosrecipes.R
import com.cumpatomas.brunosrecipes.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        setAnimation()

    }

    private fun setAnimation() {
        binding.workInProgress.setAnimation(R.raw.workprogress)
        binding.workInProgress.repeatMode = LottieDrawable.RESTART
        binding.workInProgress.bringToFront()
    }


}