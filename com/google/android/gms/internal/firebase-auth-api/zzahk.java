package com.google.android.gms.internal.firebase-auth-api;
public final class zzahk {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private com.google.android.gms.internal.firebase-auth-api.zzaia zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private y4.g0 zzk;
    private java.util.List zzl;
    private com.google.android.gms.internal.firebase-auth-api.zzah zzm;

    public zzahk()
    {
        this.zzf = new com.google.android.gms.internal.firebase-auth-api.zzaia();
        this.zzm = com.google.android.gms.internal.firebase-auth-api.zzah.zzg();
        return;
    }

    public zzahk(String p1, String p2, boolean p3, String p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzaia p6, String p7, String p8, long p9, long p11, boolean p13, y4.g0 p14, java.util.List p15, com.google.android.gms.internal.firebase-auth-api.zzah p16)
    {
        com.google.android.gms.internal.firebase-auth-api.zzah v1_1;
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        if (p6 != null) {
            com.google.android.gms.internal.firebase-auth-api.zzah v1_8 = p6.zza();
            com.google.android.gms.internal.firebase-auth-api.zzaia v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzaia();
            if (v1_8 != null) {
                v2_1.zza().addAll(v1_8);
            }
            v1_1 = v2_1;
        } else {
            v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzaia();
        }
        com.google.android.gms.internal.firebase-auth-api.zzah v1_5;
        this.zzf = v1_1;
        this.zzg = p8;
        this.zzh = p9;
        this.zzi = p11;
        this.zzj = 0;
        this.zzk = 0;
        if (p15 != null) {
            v1_5 = p15;
        } else {
            v1_5 = new java.util.ArrayList();
        }
        this.zzl = v1_5;
        this.zzm = p16;
        return;
    }

    public final long zza()
    {
        return this.zzh;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahk zza(com.google.android.gms.internal.firebase-auth-api.zzah p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zzm = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahk zza(String p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahk zza(java.util.List p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        java.util.List v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzaia();
        this.zzf = v0_1;
        v0_1.zza().addAll(p2);
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahk zza(y4.g0 p1)
    {
        this.zzk = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahk zza(boolean p1)
    {
        this.zzj = p1;
        return this;
    }

    public final long zzb()
    {
        return this.zzi;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahk zzb(String p1)
    {
        this.zzb = p1;
        return this;
    }

    public final android.net.Uri zzc()
    {
        if (android.text.TextUtils.isEmpty(this.zze)) {
            return 0;
        } else {
            return android.net.Uri.parse(this.zze);
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahk zzc(String p1)
    {
        this.zze = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzah zzd()
    {
        return this.zzm;
    }

    public final y4.g0 zze()
    {
        return this.zzk;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaia zzf()
    {
        return this.zzf;
    }

    public final String zzg()
    {
        return this.zzd;
    }

    public final String zzh()
    {
        return this.zzb;
    }

    public final String zzi()
    {
        return this.zza;
    }

    public final String zzj()
    {
        return this.zzg;
    }

    public final java.util.List zzk()
    {
        return this.zzl;
    }

    public final java.util.List zzl()
    {
        return this.zzf.zza();
    }

    public final boolean zzm()
    {
        return this.zzc;
    }

    public final boolean zzn()
    {
        return this.zzj;
    }
}
