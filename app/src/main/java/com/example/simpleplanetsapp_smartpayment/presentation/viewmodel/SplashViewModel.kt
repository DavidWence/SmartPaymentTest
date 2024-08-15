package com.example.simpleplanetsapp_smartpayment.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.simpleplanetsapp_smartpayment.domain.usecase.GetSessionStarted
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(getSessionStarted: GetSessionStarted):
    SimpleProcessViewModel() {

    private val _withSession = MutableLiveData<Boolean>()
    val withSession: LiveData<Boolean> get() = _withSession

    init {
        viewModelScope.launch {
            delay(5000)
            _withSession.value = getSessionStarted().value
        }
    }

}