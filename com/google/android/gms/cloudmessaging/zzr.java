package com.google.android.gms.cloudmessaging;
final class zzr extends com.google.android.gms.cloudmessaging.zzs {

    public zzr(int p1, int p2, android.os.Bundle p3)
    {
        super(p1, p2, p3);
        return;
    }

    public final void zza(android.os.Bundle p4)
    {
        if (!p4.getBoolean("ack", 0)) {
            this.zzc(new com.google.android.gms.cloudmessaging.zzt(4, "Invalid response to one way request", 0));
            return;
        } else {
            this.zzd(0);
            return;
        }
    }

    public final boolean zzb()
    {
        return 1;
    }
}
