package com.google.android.gms.internal.fido;
public abstract class zzf extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zzg {

    public zzf()
    {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
        return;
    }

    public final boolean zza(int p2, android.os.Parcel p3, android.os.Parcel p4, int p5)
    {
        if (p2 == 1) {
            com.google.android.gms.common.api.Status v2_4 = com.google.android.gms.internal.fido.zzc.zzb(p3);
            com.google.android.gms.internal.fido.zzc.zzc(p3);
            this.zzb(v2_4);
        } else {
            if (p2 == 2) {
                com.google.android.gms.common.api.Status v2_2 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.fido.zzc.zza(p3, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.fido.zzc.zzc(p3);
                this.zzc(v2_2);
            } else {
                return 0;
            }
        }
        p4.writeNoException();
        return 1;
    }
}
