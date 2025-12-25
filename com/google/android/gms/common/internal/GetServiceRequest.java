package com.google.android.gms.common.internal;
public class GetServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    static final com.google.android.gms.common.api.Scope[] zza;
    static final com.google.android.gms.common.Feature[] zzb;
    final int zzc;
    final int zzd;
    final int zze;
    String zzf;
    android.os.IBinder zzg;
    com.google.android.gms.common.api.Scope[] zzh;
    android.os.Bundle zzi;
    android.accounts.Account zzj;
    com.google.android.gms.common.Feature[] zzk;
    com.google.android.gms.common.Feature[] zzl;
    final boolean zzm;
    final int zzn;
    boolean zzo;
    private final String zzp;

    static GetServiceRequest()
    {
        com.google.android.gms.common.internal.GetServiceRequest.CREATOR = new com.google.android.gms.common.internal.zzm();
        com.google.android.gms.common.api.Scope[] v1 = new com.google.android.gms.common.api.Scope[0];
        com.google.android.gms.common.internal.GetServiceRequest.zza = v1;
        com.google.android.gms.common.Feature[] v0_3 = new com.google.android.gms.common.Feature[0];
        com.google.android.gms.common.internal.GetServiceRequest.zzb = v0_3;
        return;
    }

    public GetServiceRequest(int p1, int p2, int p3, String p4, android.os.IBinder p5, com.google.android.gms.common.api.Scope[] p6, android.os.Bundle p7, android.accounts.Account p8, com.google.android.gms.common.Feature[] p9, com.google.android.gms.common.Feature[] p10, boolean p11, int p12, boolean p13, String p14)
    {
        if (p6 == null) {
            p6 = com.google.android.gms.common.internal.GetServiceRequest.zza;
        }
        if (p7 == null) {
            p7 = new android.os.Bundle();
        }
        if (p9 == null) {
            p9 = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        }
        if (p10 == null) {
            p10 = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        }
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p3;
        if (!"com.google.android.gms".equals(p4)) {
            this.zzf = p4;
        } else {
            this.zzf = "com.google.android.gms";
        }
        if (p1 >= 2) {
            this.zzg = p5;
            this.zzj = p8;
        } else {
            int v1_1;
            if (p5 == null) {
                v1_1 = 0;
            } else {
                v1_1 = com.google.android.gms.common.internal.AccountAccessor.getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor$Stub.asInterface(p5));
            }
            this.zzj = v1_1;
        }
        this.zzh = p6;
        this.zzi = p7;
        this.zzk = p9;
        this.zzl = p10;
        this.zzm = p11;
        this.zzn = p12;
        this.zzo = p13;
        this.zzp = p14;
        return;
    }

    public String getAttributionTag()
    {
        return this.zzp;
    }

    public String getCallingPackage()
    {
        return this.zzf;
    }

    public com.google.android.gms.common.Feature[] getClientApiFeatures()
    {
        return this.zzl;
    }

    public int getClientLibraryVersion()
    {
        return this.zze;
    }

    public android.os.Bundle getExtraArgs()
    {
        return this.zzi;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.common.internal.zzm.zza(this, p1, p2);
        return;
    }
}
