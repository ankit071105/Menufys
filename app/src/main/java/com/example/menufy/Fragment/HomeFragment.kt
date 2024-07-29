package com.example.menufy.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.menufy.R
import com.example.menufy.adapter.PopularAdapter
import com.example.menufy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupImageSlider()
        setupRecyclerView()
    }

    private fun setupImageSlider() {
        val imageList = ArrayList<SlideModel>().apply {
            add(SlideModel(R.drawable.header, ScaleTypes.FIT))
            add(SlideModel(R.drawable.header2, ScaleTypes.FIT))
            add(SlideModel(R.drawable.header1, ScaleTypes.FIT))
            add(SlideModel(R.drawable.header3, ScaleTypes.FIT))
            add(SlideModel(R.drawable.header, ScaleTypes.FIT))
            add(SlideModel(R.drawable.header2, ScaleTypes.FIT))
            add(SlideModel(R.drawable.header1, ScaleTypes.FIT))
            add(SlideModel(R.drawable.header3, ScaleTypes.FIT))
        }

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun doubleClick(position: Int) {
                // Handle double click event if needed
            }

            override fun onItemSelected(position: Int) {
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setupRecyclerView() {
        val foodNames = listOf(
            "Momos", "Dosa", "Biryani", "Chicken Butter Masala", "Burger",
            "Sandwich", "Roti", "Masala Dal", "Tadka Dal", "Rolls"
        )
        val prices = listOf(
            "₹ 80", "₹ 70", "₹ 120", "₹ 180", "₹ 60",
            "₹ 100", "₹ 20", "₹ 110", "₹ 90", "₹ 80"
        )
        val popularFoodImages = listOf(
            R.drawable.momos, R.drawable.dosa, R.drawable.briyani,
            R.drawable.chickenbutter, R.drawable.burger, R.drawable.sandwich,
            R.drawable.roti, R.drawable.tadkadl, R.drawable.dal, R.drawable.chiceknroll
        )

        val adapter = PopularAdapter(foodNames, prices, popularFoodImages)
        binding.popularRecylerView.layoutManager = LinearLayoutManager(requireContext())
        binding.popularRecylerView.adapter = adapter
    }
}
