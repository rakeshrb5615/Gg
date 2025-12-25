package com.google.android.gms.cloudmessaging;
abstract class zzs {
    final int zza;
    final com.google.android.gms.tasks.TaskCompletionSource zzb;
    final int zzc;
    final android.os.Bundle zzd;

    public zzs(int p2, int p3, android.os.Bundle p4)
    {
        this.zzb = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("Request { what=");
        v0_2.append(this.zzc);
        v0_2.append(" id=");
        v0_2.append(this.zza);
        v0_2.append(" oneWay=");
        v0_2.append(this.zzb());
        v0_2.append("}");
        return v0_2.toString();
    }

    public abstract void zza();

    public abstract boolean zzb();

    public final void zzc(com.google.android.gms.cloudmessaging.zzt p6)
    {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            com.google.android.gms.tasks.TaskCompletionSource v0_5 = this.toString();
            String v2 = p6.toString();
            StringBuilder v3_0 = new StringBuilder("Failing ");
            v3_0.append(v0_5);
            v3_0.append(" with ");
            v3_0.append(v2);
            android.util.Log.d("MessengerIpcClient", v3_0.toString());
        }
        this.zzb.setException(p6);
        return;
    }

    public final void zzd(Object p6)
    {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            com.google.android.gms.tasks.TaskCompletionSource v0_5 = this.toString();
            String v2 = String.valueOf(p6);
            StringBuilder v3_0 = new StringBuilder("Finishing ");
            v3_0.append(v0_5);
            v3_0.append(" with ");
            v3_0.append(v2);
            android.util.Log.d("MessengerIpcClient", v3_0.toString());
        }
        this.zzb.setResult(p6);
        return;
    }
}
