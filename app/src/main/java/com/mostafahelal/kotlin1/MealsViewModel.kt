package com.mostafahelal.kotlin1

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mostafahelal.domain.entity.CategoryResponse
import com.mostafahelal.domain.usecase.GettingMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val gettingMeals: GettingMeals
) :ViewModel() {
    private val _categories:MutableStateFlow<CategoryResponse?> =MutableStateFlow(null)
    val categories:StateFlow<CategoryResponse?> =_categories

    fun getMeals(){
        viewModelScope.launch {
            try {
             _categories.value=  gettingMeals()
            }
            catch (e:Exception){
                Log.e("MealsViewModel", e.message.toString() )
            }
        }
    }


}