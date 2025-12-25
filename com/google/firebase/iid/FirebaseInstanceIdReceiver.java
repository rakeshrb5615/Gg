package com.google.firebase.iid;
public final class FirebaseInstanceIdReceiver extends com.google.android.gms.cloudmessaging.CloudMessagingReceiver {

    public FirebaseInstanceIdReceiver()
    {
        return;
    }

    public final int onMessageReceive(android.content.Context p2, com.google.android.gms.cloudmessaging.CloudMessage p3)
    {
        try {
            return ((Integer) com.google.android.gms.tasks.Tasks.await(new j6.j(p2).b(p3.getIntent()))).intValue();
        } catch (int v2_2) {
            android.util.Log.e("FirebaseMessaging", "Failed to send message to service.", v2_2);
            return 500;
        } catch (int v2_2) {
            android.util.Log.e("FirebaseMessaging", "Failed to send message to service.", v2_2);
            return 500;
        }
    }

    public final void onNotificationDismissed(android.content.Context p2, android.os.Bundle p3)
    {
        android.os.Bundle v2_3 = new android.content.Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(p3);
        if (a.a.T(v2_3)) {
            a.a.K(v2_3.getExtras(), "_nd");
        }
        return;
    }
}
