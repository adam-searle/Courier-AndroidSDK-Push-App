package com.example.courierpush

import android.app.Application
import com.courier.android.Courier
import com.courier.android.modules.signIn
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // initialize Courier
        Courier.initialize(this)

        // Sign in to Courier.
        CoroutineScope(Dispatchers.Main).launch {
            Courier.shared.signIn(
                accessToken = "pk_prod_N671XW6PREMS0EMX67XMTPWAYTQW",
                clientKey = "nil",
                userId = "adam"
            )
        }
    }
}
