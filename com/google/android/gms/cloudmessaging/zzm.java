package com.google.android.gms.cloudmessaging;
public final synthetic class zzm implements android.os.Handler$Callback {
    public final synthetic com.google.android.gms.cloudmessaging.zzp zza;

    public synthetic zzm(com.google.android.gms.cloudmessaging.zzp p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean handleMessage(android.os.Message p5)
    {
        int v2_0 = p5.arg1;
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            int v1_7 = new StringBuilder("Received response to request: ");
            v1_7.append(v2_0);
            android.util.Log.d("MessengerIpcClient", v1_7.toString());
        }
        int v1_2 = this.zza;
        StringBuilder v3_3 = ((com.google.android.gms.cloudmessaging.zzs) v1_2.zze.get(v2_0));
        if (v3_3 != null) {
            v1_2.zze.remove(v2_0);
            v1_2.zzf();
            String v5_1 = p5.getData();
            if (!v5_1.getBoolean("unsupported", 0)) {
                v3_3.zza(v5_1);
            } else {
                v3_3.zzc(new com.google.android.gms.cloudmessaging.zzt(4, "Not supported by GmsCore", 0));
            }
        } else {
            StringBuilder v3_6 = new StringBuilder("Received response for unknown request: ");
            v3_6.append(v2_0);
            android.util.Log.w("MessengerIpcClient", v3_6.toString());
        }
        return 1;
    }
}
