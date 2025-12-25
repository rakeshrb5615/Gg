package com.google.firebase.messaging;
public class FirebaseMessagingService extends j6.g {
    public static final java.util.ArrayDeque m;
    public com.google.android.gms.cloudmessaging.Rpc f;

    static FirebaseMessagingService()
    {
        com.google.firebase.messaging.FirebaseMessagingService.m = new java.util.ArrayDeque(10);
        return;
    }

    public FirebaseMessagingService()
    {
        return;
    }

    public final void b(android.content.Intent p8)
    {
        String v0_0 = p8.getAction();
        if ((!"com.google.android.c2dm.intent.RECEIVE".equals(v0_0)) && (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(v0_0))) {
            if (!"com.google.firebase.messaging.NEW_TOKEN".equals(v0_0)) {
                String v0_12 = new StringBuilder("Unknown intent action: ");
                v0_12.append(p8.getAction());
                android.util.Log.d("FirebaseMessaging", v0_12.toString());
                return;
            } else {
                this.d(p8.getStringExtra("token"));
                return;
            }
        } else {
            String v1_15 = p8.getStringExtra("google.message_id");
            int v4 = 3;
            if (!android.text.TextUtils.isEmpty(v1_15)) {
                b8.g v3_4 = com.google.firebase.messaging.FirebaseMessagingService.m;
                if (!v3_4.contains(v1_15)) {
                    if (v3_4.size() >= 10) {
                        v3_4.remove();
                    }
                    v3_4.add(v1_15);
                    String v1_18 = p8.getStringExtra("message_type");
                    if (v1_18 == null) {
                        v1_18 = "gcm";
                    }
                    switch (v1_18.hashCode()) {
                        case -2062414158:
                            if (v1_18.equals("deleted_messages")) {
                                v4 = 0;
                            } else {
                                v4 = -1;
                            }
                        case 102161:
                            if (v1_18.equals("gcm")) {
                                v4 = 1;
                            }
                            break;
                        case 814694033:
                            if (v1_18.equals("send_error")) {
                                v4 = 2;
                            }
                            break;
                        case 814800675:
                            if (v1_18.equals("send_event")) {
                            }
                            break;
                        default:
                    }
                    switch (v4) {
                        case 0:
                            break;
                        case 1:
                            a.a.J(p8);
                            String v0_2 = p8.getExtras();
                            if (v0_2 == null) {
                                v0_2 = new android.os.Bundle();
                            }
                            v0_2.remove("androidx.content.wakelockid");
                            if (j6.o.C(v0_2)) {
                                String v1_4 = new j6.o(v0_2);
                                android.os.Bundle v2_2 = java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Network-Io"));
                                try {
                                    if (!new b8.g(this, v1_4, v2_2).l()) {
                                        v2_2.shutdown();
                                        if (a.a.T(p8)) {
                                            a.a.K(p8.getExtras(), "_nf");
                                        }
                                    } else {
                                        v2_2.shutdown();
                                    }
                                } catch (Throwable v8_1) {
                                    v2_2.shutdown();
                                    throw v8_1;
                                }
                            }
                            this.c(new j6.q(v0_2));
                            break;
                        case 2:
                            if (p8.getStringExtra("google.message_id") == null) {
                                p8.getStringExtra("message_id");
                            }
                            String v1_22 = p8.getStringExtra("error");
                            new j6.r(v1_22);
                            if (v1_22 != null) {
                                v1_22.toLowerCase(java.util.Locale.US).getClass();
                            }
                            break;
                        case 3:
                            p8.getStringExtra("google.message_id");
                            break;
                        default:
                            android.util.Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(v1_18));
                    }
                } else {
                    if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        String v0_17 = new StringBuilder("Received duplicate message: ");
                        v0_17.append(v1_15);
                        android.util.Log.d("FirebaseMessaging", v0_17.toString());
                    }
                }
            }
            if (this.f == null) {
                this.f = new com.google.android.gms.cloudmessaging.Rpc(this.getApplicationContext());
            }
            this.f.messageHandled(new com.google.android.gms.cloudmessaging.CloudMessage(p8));
            return;
        }
    }

    public void c(j6.q p1)
    {
        return;
    }

    public void d(String p1)
    {
        return;
    }
}
