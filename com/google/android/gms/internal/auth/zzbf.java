package com.google.android.gms.internal.auth;
public abstract class zzbf extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzbg {

    public zzbf()
    {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
        return;
    }

    public final boolean zza(int p2, android.os.Parcel p3, android.os.Parcel p4, int p5)
    {
        if (p2 == 1) {
            String v2_5 = ((com.google.android.gms.auth.api.proxy.ProxyResponse) com.google.android.gms.internal.auth.zzc.zza(p3, com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR));
            com.google.android.gms.internal.auth.zzc.zzb(p3);
            this.zzb(v2_5);
        } else {
            if (p2 == 2) {
                String v2_1 = p3.readString();
                com.google.android.gms.internal.auth.zzc.zzb(p3);
                this.zzc(v2_1);
            } else {
                return 0;
            }
        }
        p4.writeNoException();
        return 1;
    }
}
