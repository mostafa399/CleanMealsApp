package com.mostafahelal.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel:MealsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv:RecyclerView=findViewById(R.id.category_rv)


        viewModel.getMeals()
        val adapter:MealsAdapter= MealsAdapter()
        lifecycleScope.launch{
            viewModel.categories.collect{
                adapter.submitList(it?.categories)
                withContext(Dispatchers.Main){
                rv.adapter=adapter
                }
            }
        }





    }

}