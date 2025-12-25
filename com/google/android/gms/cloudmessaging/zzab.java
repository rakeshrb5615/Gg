package com.google.android.gms.cloudmessaging;
public final synthetic class zzab implements com.google.android.gms.tasks.Continuation {
    public static final synthetic com.google.android.gms.cloudmessaging.zzab zza;

    static synthetic zzab()
    {
        com.google.android.gms.cloudmessaging.zzab.zza = new com.google.android.gms.cloudmessaging.zzab();
        return;
    }

    private synthetic zzab()
    {
        return;
    }

    public final Object then(com.google.android.gms.tasks.Task p2)
    {
        int v2_4 = ((android.content.Intent) ((android.os.Bundle) p2.getResult()).getParcelable("notification_data"));
        if (v2_4 == 0) {
            return 0;
        } else {
            return new com.google.android.gms.cloudmessaging.CloudMessage(v2_4);
        }
    }
}
