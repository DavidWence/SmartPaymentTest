package com.example.simpleplanetsapp_smartpayment.presentation.ui

import android.annotation.SuppressLint
import androidx.activity.viewModels
import com.example.simpleplanetsapp_smartpayment.R
import com.example.simpleplanetsapp_smartpayment.databinding.ActivitySplashBinding
import com.example.simpleplanetsapp_smartpayment.presentation.ui.base.BaseActivity
import com.example.simpleplanetsapp_smartpayment.presentation.util.openActivity
import com.example.simpleplanetsapp_smartpayment.presentation.viewmodel.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity: BaseActivity<ActivitySplashBinding>(R.layout.activity_splash){

    private val viewModel: SplashViewModel by viewModels()

    override fun onBinding() {
        viewModel.withSession.observe(this){ withSession ->
            if(!withSession)
                openActivity<RegistryActivity>()
            finish()
        }
    }

}