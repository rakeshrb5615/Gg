package com.google.android.gms.internal.firebase-auth-api;
abstract class zzaff implements com.google.android.gms.internal.firebase-auth-api.zzafq {
    protected final int zza;
    protected final com.google.android.gms.internal.firebase-auth-api.zzafh zzb;
    protected q4.f zzc;
    protected y4.l zzd;
    protected Object zze;
    protected z4.j zzf;
    protected com.google.android.gms.internal.firebase-auth-api.zzafg zzg;
    protected final java.util.List zzh;
    protected java.util.concurrent.Executor zzi;
    protected com.google.android.gms.internal.firebase-auth-api.zzahv zzj;
    protected com.google.android.gms.internal.firebase-auth-api.zzahk zzk;
    protected com.google.android.gms.internal.firebase-auth-api.zzagv zzl;
    protected com.google.android.gms.internal.firebase-auth-api.zzaif zzm;
    protected y4.c zzn;
    protected String zzo;
    protected String zzp;
    protected com.google.android.gms.internal.firebase-auth-api.zzaas zzq;
    protected com.google.android.gms.internal.firebase-auth-api.zzahs zzr;
    protected com.google.android.gms.internal.firebase-auth-api.zzahr zzs;
    protected com.google.android.gms.internal.firebase-auth-api.zzair zzt;
    boolean zzu;

    public zzaff(int p2)
    {
        this.zzb = new com.google.android.gms.internal.firebase-auth-api.zzafh(this);
        this.zzh = new java.util.ArrayList();
        this.zza = p2;
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzaff p1)
    {
        p1.zzb();
        com.google.android.gms.common.internal.Preconditions.checkState(p1.zzu, "no success or failure set on method implementation");
        return;
    }

    public static synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzaff p0, com.google.android.gms.common.api.Status p1)
    {
        z4.j v0_1 = p0.zzf;
        if (v0_1 != null) {
            v0_1.zza(p1);
        }
        return;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaff zza(Object p2)
    {
        this.zze = com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "external callback cannot be null");
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaff zza(q4.f p2)
    {
        this.zzc = ((q4.f) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "firebaseApp cannot be null"));
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaff zza(y4.l p2)
    {
        this.zzd = ((y4.l) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "firebaseUser cannot be null"));
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaff zza(y4.u p2, android.app.Activity p3, java.util.concurrent.Executor p4, String p5)
    {
        this.zzh.add(((y4.u) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.internal.firebase-auth-api.zzagb.zza(p5, p2, this))));
        if (p3 != null) {
            com.google.android.gms.internal.firebase-auth-api.zzaff$zza.zza(p3, this.zzh);
        }
        this.zzi = ((java.util.concurrent.Executor) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaff zza(z4.j p2)
    {
        this.zzf = ((z4.j) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "external failure callback cannot be null"));
        return this;
    }

    public final void zza(com.google.android.gms.common.api.Status p3)
    {
        this.zzu = 1;
        this.zzg.zza(0, p3);
        return;
    }

    public abstract void zzb();

    public final void zzb(Object p3)
    {
        this.zzu = 1;
        this.zzg.zza(p3, 0);
        return;
    }
}
