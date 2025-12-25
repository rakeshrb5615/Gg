package com.google.android.gms.internal.fido;
public abstract class zzd extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zze {

    public zzd()
    {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
        return;
    }

    public final boolean zza(int p3, android.os.Parcel p4, android.os.Parcel p5, int p6)
    {
        p6 = 0;
        if (p3 == 1) {
            com.google.android.gms.common.api.Status v3_4 = p4.readInt();
            com.google.android.gms.internal.fido.zzc.zzc(p4);
            if (v3_4 != null) {
                p6 = 1;
            }
            this.zzb(p6);
        } else {
            if (p3 == 2) {
                com.google.android.gms.common.api.Status v3_3 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.fido.zzc.zza(p4, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.fido.zzc.zzc(p4);
                this.zzc(v3_3);
            } else {
                return 0;
            }
        }
        p5.writeNoException();
        return 1;
    }
}
