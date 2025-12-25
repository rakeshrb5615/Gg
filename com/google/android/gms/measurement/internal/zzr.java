package com.google.android.gms.measurement.internal;
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final long zzA;
    public final String zzB;
    public final String zzC;
    public final long zzD;
    public final int zzE;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final long zze;
    public final long zzf;
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final Boolean zzp;
    public final long zzq;
    public final java.util.List zzr;
    public final String zzs;
    public final String zzt;
    public final String zzu;
    public final boolean zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    static zzr()
    {
        com.google.android.gms.measurement.internal.zzr.CREATOR = new com.google.android.gms.measurement.internal.zzs();
        return;
    }

    public zzr(String p2, String p3, String p4, long p5, String p7, long p8, long p10, String p12, boolean p13, boolean p14, String p15, long p16, int p18, boolean p19, boolean p20, Boolean p21, long p22, java.util.List p24, String p25, String p26, String p27, boolean p28, long p29, int p31, String p32, int p33, long p34, String p36, String p37, long p38, int p40)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zza = p2;
        if (1 == android.text.TextUtils.isEmpty(p3)) {
            p3 = 0;
        }
        this.zzb = p3;
        this.zzc = p4;
        this.zzj = p5;
        this.zzd = p7;
        this.zze = p8;
        this.zzf = p10;
        this.zzg = p12;
        this.zzh = p13;
        this.zzi = p14;
        this.zzk = p15;
        this.zzl = p16;
        this.zzm = p18;
        this.zzn = p19;
        this.zzo = p20;
        this.zzp = p21;
        this.zzq = p22;
        this.zzr = p24;
        this.zzs = p25;
        this.zzt = p26;
        this.zzu = p27;
        this.zzv = p28;
        this.zzw = p29;
        this.zzx = p31;
        this.zzy = p32;
        this.zzz = p33;
        this.zzA = p34;
        this.zzB = p36;
        this.zzC = p37;
        this.zzD = p38;
        this.zzE = p40;
        return;
    }

    public zzr(String p1, String p2, String p3, String p4, long p5, long p7, String p9, boolean p10, boolean p11, long p12, String p14, long p15, int p17, boolean p18, boolean p19, Boolean p20, long p21, java.util.List p23, String p24, String p25, String p26, boolean p27, long p28, int p30, String p31, int p32, long p33, String p35, String p36, long p37, int p39)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzj = p12;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p7;
        this.zzg = p9;
        this.zzh = p10;
        this.zzi = p11;
        this.zzk = p14;
        this.zzl = p15;
        this.zzm = p17;
        this.zzn = p18;
        this.zzo = p19;
        this.zzp = p20;
        this.zzq = p21;
        this.zzr = p23;
        this.zzs = p24;
        this.zzt = p25;
        this.zzu = p26;
        this.zzv = p27;
        this.zzw = p28;
        this.zzx = p30;
        this.zzy = p31;
        this.zzz = p32;
        this.zzA = p33;
        this.zzB = p35;
        this.zzC = p36;
        this.zzD = p37;
        this.zzE = p39;
        return;
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        int v7_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 2, v7_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 3, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 4, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 5, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 8, this.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p6, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p6, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 12, this.zzk, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 14, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 15, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p6, 16, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p6, 18, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(p6, 21, this.zzp, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 22, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p6, 23, this.zzr, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 25, this.zzs, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 26, this.zzt, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 27, this.zzu, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p6, 28, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 29, this.zzw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 30, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 31, this.zzy, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 32, this.zzz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 34, this.zzA);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 35, this.zzB, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 36, this.zzC, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 37, this.zzD);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 38, this.zzE);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v0);
        return;
    }
}
