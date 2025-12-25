package com.google.android.gms.common.stats;
public final class WakeLockEvent extends com.google.android.gms.common.stats.StatsEvent {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final java.util.List zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    static WakeLockEvent()
    {
        com.google.android.gms.common.stats.WakeLockEvent.CREATOR = new com.google.android.gms.common.stats.zza();
        return;
    }

    public WakeLockEvent(int p1, long p2, int p4, String p5, int p6, java.util.List p7, String p8, long p9, int p11, String p12, String p13, float p14, long p15, String p17, boolean p18)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p12;
        this.zzf = p17;
        this.zzg = p6;
        this.zzh = p7;
        this.zzi = p8;
        this.zzj = p9;
        this.zzk = p11;
        this.zzl = p13;
        this.zzm = p14;
        this.zzn = p15;
        this.zzo = p18;
        return;
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        p7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 4, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 5, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p6, 6, this.zzh, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 8, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 10, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 11, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 12, this.zzi, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 13, this.zzl, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 14, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(p6, 15, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 16, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 17, this.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p6, 18, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, p7);
        return;
    }

    public final long zza()
    {
        return this.zzb;
    }

    public final int zzb()
    {
        return this.zzc;
    }

    public final String zzc()
    {
        String v0_1;
        String v0_0 = this.zzh;
        String v1 = "";
        if (v0_0 != null) {
            v0_1 = android.text.TextUtils.join(",", v0_0);
        } else {
            v0_1 = "";
        }
        int v2_1 = this.zzk;
        String v3 = this.zze;
        String v4 = this.zzl;
        float v5 = this.zzm;
        String v6_0 = this.zzf;
        int v7 = this.zzg;
        String v8 = this.zzd;
        boolean v9 = this.zzo;
        StringBuilder v11_5 = ((((String.valueOf(v7).length() + (String.valueOf(v8).length() + 2)) + 1) + String.valueOf(v0_1).length()) + 1);
        int v10_5 = String.valueOf(v2_1).length();
        if (v3 == null) {
            v3 = "";
        }
        StringBuilder v11_8 = ((v3.length() + ((v10_5 + v11_5) + 1)) + 1);
        if (v4 == null) {
            v4 = "";
        }
        int v10_10 = ((v4.length() + v11_8) + 1);
        StringBuilder v11_10 = String.valueOf(v5).length();
        if (v6_0 != null) {
            v1 = v6_0;
        }
        StringBuilder v11_14 = new StringBuilder((((v1.length() + ((v11_10 + v10_10) + 1)) + 1) + String.valueOf(v9).length()));
        v11_14.append("\t");
        v11_14.append(v8);
        v11_14.append("\t");
        v11_14.append(v7);
        v11_14.append("\t");
        v11_14.append(v0_1);
        v11_14.append("\t");
        v11_14.append(v2_1);
        v11_14.append("\t");
        v11_14.append(v3);
        v11_14.append("\t");
        v11_14.append(v4);
        v11_14.append("\t");
        v11_14.append(v5);
        v11_14.append("\t");
        v11_14.append(v1);
        v11_14.append("\t");
        v11_14.append(v9);
        return v11_14.toString();
    }
}
