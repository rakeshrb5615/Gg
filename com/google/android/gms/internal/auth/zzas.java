package com.google.android.gms.internal.auth;
public abstract class zzas extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzat {

    public zzas()
    {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        switch (p1) {
            case 1:
                int v1_15 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.auth.zzc.zzb(p2);
                this.zzh(v1_15);
                break;
            case 2:
                int v1_11 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.auth.api.accounttransfer.zzo v3_5 = ((com.google.android.gms.auth.api.accounttransfer.zzw) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR));
                com.google.android.gms.internal.auth.zzc.zzb(p2);
                this.zzf(v1_11, v3_5);
                break;
            case 3:
                int v1_7 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.auth.api.accounttransfer.zzo v3_2 = ((com.google.android.gms.auth.api.accounttransfer.zzo) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR));
                com.google.android.gms.internal.auth.zzc.zzb(p2);
                this.zzg(v1_7, v3_2);
                break;
            case 4:
                this.zze();
                break;
            case 5:
                int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
                com.google.android.gms.internal.auth.zzc.zzb(p2);
                this.zzd(v1_4);
                break;
            case 6:
                int v1_18 = p2.createByteArray();
                com.google.android.gms.internal.auth.zzc.zzb(p2);
                this.zzb(v1_18);
                break;
            case 7:
                int v1_13 = ((com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR));
                com.google.android.gms.internal.auth.zzc.zzb(p2);
                this.zzc(v1_13);
                break;
            default:
                return 0;
        }
        return 1;
    }
}
