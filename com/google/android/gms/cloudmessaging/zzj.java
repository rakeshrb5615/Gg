package com.google.android.gms.cloudmessaging;
public final synthetic class zzj implements java.lang.Runnable {
    public final synthetic com.google.android.gms.cloudmessaging.zzp zza;

    public synthetic zzj(com.google.android.gms.cloudmessaging.zzp p1)
    {
        this.zza = p1;
        return;
    }

    public final void run()
    {
        while(true) {
            com.google.android.gms.cloudmessaging.zzp v0 = this.zza;
            if (v0.zza == 2) {
                if (!v0.zzd.isEmpty()) {
                    String v1_2 = ((com.google.android.gms.cloudmessaging.zzs) v0.zzd.poll());
                    v0.zze.put(v1_2.zza, v1_2);
                    com.google.android.gms.cloudmessaging.zzv.zze(v0.zzf).schedule(new com.google.android.gms.cloudmessaging.zzn(v0, v1_2), 30, java.util.concurrent.TimeUnit.SECONDS);
                    if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                        android.util.Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(v1_2)));
                    }
                    android.os.Bundle v4_5 = v0.zzb;
                    String v5_2 = v1_2.zzc;
                    String v3_8 = com.google.android.gms.cloudmessaging.zzv.zza(v0.zzf);
                    android.os.Message v6_1 = android.os.Message.obtain();
                    v6_1.what = v5_2;
                    v6_1.arg1 = v1_2.zza;
                    v6_1.replyTo = v4_5;
                    android.os.Bundle v4_7 = new android.os.Bundle();
                    v4_7.putBoolean("oneWay", v1_2.zzb());
                    v4_7.putString("pkg", v3_8.getPackageName());
                    v4_7.putBundle("data", v1_2.zzd);
                    v6_1.setData(v4_7);
                    try {
                        v0.zzc.zza(v6_1);
                    } catch (String v1_7) {
                        v0.zza(2, v1_7.getMessage());
                    }
                } else {
                    v0.zzf();
                }
            } else {
            }
            return;
        }
    }
}
