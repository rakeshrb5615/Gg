package com.google.android.gms.internal.firebase-auth-api;
public abstract class zzf {

    public zzf()
    {
        return;
    }

    public int zza(CharSequence p3, int p4)
    {
        int v0 = p3.length();
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p4, v0, "index");
        while (p4 < v0) {
            if (!this.zza(p3.charAt(p4))) {
                p4++;
            } else {
                return p4;
            }
        }
        return -1;
    }

    public abstract boolean zza();
}
