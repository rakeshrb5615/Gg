package com.google.android.gms.internal.location;
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.internal.location.zzd zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final java.util.List zzf;
    private final com.google.android.gms.internal.location.zze zzg;

    static zze()
    {
        com.google.android.gms.internal.location.zze.zza = new com.google.android.gms.internal.location.zzd(0);
        com.google.android.gms.internal.location.zze.CREATOR = new com.google.android.gms.internal.location.zzf();
        android.os.Process.myUid();
        android.os.Process.myPid();
        return;
    }

    public zze(int p2, String p3, String p4, String p5, java.util.List p6, com.google.android.gms.internal.location.zze p7)
    {
        kotlin.jvm.internal.j.e(p3, "packageName");
        if ((p7 != null) && (p7.zza())) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            this.zzb = p2;
            this.zzc = p3;
            this.zzd = p4;
            String v2_1 = 0;
            if (p5 == null) {
                if (p7 == null) {
                    p5 = 0;
                } else {
                    p5 = p7.zze;
                }
            }
            this.zze = p5;
            if (p6 == null) {
                if (p7 != null) {
                    v2_1 = p7.zzf;
                }
                p6 = v2_1;
                if (p6 == null) {
                    p6 = com.google.android.gms.internal.location.zzex.zzi();
                    kotlin.jvm.internal.j.d(p6, "of(...)");
                }
            }
            String v2_3 = com.google.android.gms.internal.location.zzex.zzj(p6);
            kotlin.jvm.internal.j.d(v2_3, "copyOf(...)");
            this.zzf = v2_3;
            this.zzg = p7;
            return;
        }
    }

    public final boolean equals(Object p4)
    {
        if ((!(p4 instanceof com.google.android.gms.internal.location.zze)) || ((this.zzb != ((com.google.android.gms.internal.location.zze) p4).zzb) || ((!kotlin.jvm.internal.j.a(this.zzc, ((com.google.android.gms.internal.location.zze) p4).zzc)) || ((!kotlin.jvm.internal.j.a(this.zzd, ((com.google.android.gms.internal.location.zze) p4).zzd)) || ((!kotlin.jvm.internal.j.a(this.zze, ((com.google.android.gms.internal.location.zze) p4).zze)) || ((!kotlin.jvm.internal.j.a(this.zzg, ((com.google.android.gms.internal.location.zze) p4).zzg)) || (!kotlin.jvm.internal.j.a(this.zzf, ((com.google.android.gms.internal.location.zze) p4).zzf)))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg}));
    }

    public final String toString()
    {
        String v1_4;
        String v0_5 = (this.zzc.length() + 18);
        String v1_2 = this.zzd;
        int v2 = 0;
        if (v1_2 == null) {
            v1_4 = 0;
        } else {
            v1_4 = v1_2.length();
        }
        String v1_1 = new StringBuilder((v0_5 + v1_4));
        v1_1.append(this.zzb);
        v1_1.append("/");
        v1_1.append(this.zzc);
        String v3_1 = this.zzd;
        if (v3_1 != null) {
            v1_1.append("[");
            if (!b8.p.p0(v3_1, this.zzc)) {
                v1_1.append(v3_1);
            } else {
                v1_1.append(v3_1, this.zzc.length(), v3_1.length());
            }
            v1_1.append("]");
        }
        if (this.zze != null) {
            v1_1.append("/");
            String v0_6 = this.zze;
            if (v0_6 != null) {
                v2 = v0_6.hashCode();
            }
            v1_1.append(Integer.toHexString(v2));
        }
        String v0_8 = v1_1.toString();
        kotlin.jvm.internal.j.d(v0_8, "toString(...)");
        return v0_8;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        kotlin.jvm.internal.j.e(p5, "dest");
        java.util.List v0_4 = this.zzb;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.zzg, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 8, this.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }

    public final boolean zza()
    {
        if (this.zzg == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
