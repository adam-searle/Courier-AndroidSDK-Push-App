# Android Push Notification App

This is a simple Android application that demonstrates how to implement push notifications using the Courier API. The app allows you to send push notifications to devices using Firebase Cloud Messaging (FCM) as the push notification provider.

## Requirements

- Android Studio
- Firebase Cloud Messaging (FCM) setup (instructions provided below)

## Setup

To get started with the Android Push Notification App, follow these steps:

1. Clone this repository to your local machine.
2. Open the project in Android Studio.
3. Install the required packages by running the following command in the terminal: `./gradlew build`

This will download and install all the necessary dependencies for the project (including the Courier Android SDK 2.0.2).

## Firebase Cloud Messaging (FCM) Setup

Before you can send push notifications using this app, you need to set up Firebase Cloud Messaging (FCM) and link it with your Courier dashboard. Here's how you can do it:

1. Go to the [Firebase Console](https://console.firebase.google.com/).
2. Create a new project and follow the instructions to set up FCM for Android. Make sure to follow the steps to implement the SDK into the project.
3. Once you've set up FCM, go to the [Courier Dashboard](https://dashboard.courier.com/).
4. Create a new provider and select Firebase Cloud Messaging (FCM) as the provider type.
5. Copy the FCM server key from your Firebase project settings and paste it in the provider configuration in the Courier Dashboard.

## Sending Push Notifications

To send push notifications using this app, follow these steps:

1. Run the app on an Android device (a physical device is recommended as Courier does not support the emulator).
2. Make sure you have granted the necessary permissions for push notifications.
3. Click the "Send Notification" button to trigger a test push notification.
