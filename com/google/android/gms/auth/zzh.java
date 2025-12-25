package com.google.android.gms.auth;
final class zzh implements com.google.android.gms.auth.zzk {
    final synthetic String zza;
    final synthetic android.os.Bundle zzb;

    public zzh(String p1, android.os.Bundle p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final bridge synthetic Object zza(android.os.IBinder p3)
    {
        com.google.android.gms.auth.GoogleAuthException v3_6 = com.google.android.gms.internal.auth.zze.zzb(p3).zzd(this.zza, this.zzb);
        com.google.android.gms.auth.zzl.zzd(v3_6);
        String v0_2 = v3_6.getString("Error");
        if (!v3_6.getBoolean("booleanResult")) {
            throw new com.google.android.gms.auth.GoogleAuthException(v0_2);
        } else {
            return 0;
        }
    }
}
