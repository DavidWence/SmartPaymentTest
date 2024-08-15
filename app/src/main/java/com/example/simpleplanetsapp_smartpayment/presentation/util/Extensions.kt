package com.example.simpleplanetsapp_smartpayment.presentation.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

inline fun <reified T : Activity> Context.openActivity(
    bundle: Bundle? = null,
    noinline init: Intent.() -> Unit = {}
) {
    val intent = newIntent<T>(this)
    intent.init()
    if (bundle == null)
        startActivity(intent)
    else
        startActivity(intent, bundle)
}

inline fun <reified T : Activity> newIntent(context: Context): Intent =
    Intent(context, T::class.java)