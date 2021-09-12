package com.hnc.hnc.holynamechurch;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Adriealle on 15-04-2018.
 */

public class FirebaseMessagingServices extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        shownotification(remoteMessage.getData().get("message"));
    }

    private void shownotification(String message) {
        Intent i=new Intent(this, Home.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        i,
                        PendingIntent.FLAG_ONE_SHOT
                );
        NotificationCompat.Builder m = new NotificationCompat.Builder(this);
        m.setContentTitle("You've been Alloted No.");
        m.setContentText(message);
        m.setAutoCancel(true);
        m.setContentIntent(resultPendingIntent);

        NotificationManager n = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        n.notify(0, m.build());

    }
}
