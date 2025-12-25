package com.google.android.gms.internal.base;
public final class zao extends e0.c {

    public static android.content.Intent zaa(android.content.Context p2, android.content.BroadcastReceiver p3, android.content.IntentFilter p4)
    {
        if (!com.google.android.gms.internal.base.zan.zaa()) {
            return p2.registerReceiver(p3, p4);
        } else {
            int v0_1;
            if (1 == com.google.android.gms.internal.base.zan.zaa()) {
                v0_1 = 2;
            } else {
                v0_1 = 0;
            }
            return p2.registerReceiver(p3, p4, v0_1);
        }
    }
}
