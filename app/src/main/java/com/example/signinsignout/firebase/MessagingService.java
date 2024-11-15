package com.example.signinsignout.firebase;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Service for handling Firebase Cloud Messaging (FCM) events such as token refresh
 * and incoming messages. Extends {@link FirebaseMessagingService} to handle these events.
 */
public class MessagingService extends FirebaseMessagingService {

    /**
     * Called when a new FCM registration token is generated. This may occur when the app
     * is first installed or when the existing token is refreshed.
     *
     * @param token The new FCM registration token.
     */
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM", "Token" + token);
    }

    /**
     * Called when a new message is received from FCM. Handles the received message
     * and logs its content.
     *
     * @param message The remote message containing data or notification payload.
     */
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        Log.d("FCM", "460 Message" + message.getNotification().getBody());
    }
}