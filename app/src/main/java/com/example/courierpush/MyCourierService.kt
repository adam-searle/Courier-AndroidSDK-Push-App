package com.example.courierpush

import android.annotation.SuppressLint
import com.courier.android.service.CourierService
import com.courier.android.notifications.presentNotification
import com.google.firebase.messaging.RemoteMessage

@SuppressLint("MissingFirebaseInstanceTokenRefresh")
class MyCourierService : CourierService() {

    override fun showNotification(message: RemoteMessage) {
        super.showNotification(message)
        // This is where you will customize the notification that is shown to your users
        // The function below is used to get started quickly.
        // `message.presentNotification(...)` is used to get started quickly and not for production use.
        message.presentNotification(
            context = this,
            handlingClass = MainActivity::class.java,
            icon = android.R.drawable.ic_dialog_info
        )
    }
}
