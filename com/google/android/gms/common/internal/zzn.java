package com.google.android.gms.common.internal;
public final class zzn {
    private final String zza;
    private final String zzb;
    private final android.content.ComponentName zzc;
    private final int zzd;
    private final boolean zze;

    public zzn(android.content.ComponentName p1, int p2)
    {
        this.zza = 0;
        this.zzb = 0;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zzc = p1;
        this.zzd = 4225;
        this.zze = 0;
        return;
    }

    public zzn(String p2, int p3, boolean p4)
    {
        this(p2, "com.google.android.gms", 4225, 0);
        return;
    }

    public zzn(String p1, String p2, int p3, boolean p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zza = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p2;
        this.zzc = 0;
        this.zzd = 4225;
        this.zze = p4;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.common.internal.zzn)) {
                if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.common.internal.zzn) p5).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.common.internal.zzn) p5).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.common.internal.zzn) p5).zzc)) || (this.zze != ((com.google.android.gms.common.internal.zzn) p5).zze)))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb, this.zzc, Integer.valueOf(4225), Boolean.valueOf(this.zze)}));
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        if (v0_0 == null) {
            String v0_1 = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
            v0_0 = v0_1.flattenToString();
        }
        return v0_0;
    }

    public final String zza()
    {
        return this.zza;
    }

    public final String zzb()
    {
        return this.zzb;
    }

    public final android.content.ComponentName zzc()
    {
        return this.zzc;
    }

    public final boolean zzd()
    {
        return this.zze;
    }
}
