package com.google.android.gms.internal.play_billing;
public final class zzak extends com.google.android.gms.internal.play_billing.zzap implements com.google.android.gms.internal.play_billing.zzam {

    public zzak(android.os.IBinder p2)
    {
        super(p2, "com.android.vending.billing.IInAppBillingService");
        return;
    }

    public final int zza(int p2, String p3, String p4)
    {
        android.os.Parcel v2_0 = this.zzs();
        v2_0.writeInt(3);
        v2_0.writeString(p3);
        v2_0.writeString(p4);
        android.os.Parcel v2_1 = this.zzt(5, v2_0);
        int v3_1 = v2_1.readInt();
        v2_1.recycle();
        return v3_1;
    }

    public final int zzc(int p2, String p3, String p4, android.os.Bundle p5)
    {
        android.os.Parcel v0 = this.zzs();
        v0.writeInt(p2);
        v0.writeString(p3);
        v0.writeString(p4);
        com.google.android.gms.internal.play_billing.zzar.zzc(v0, p5);
        android.os.Parcel v2_2 = this.zzt(10, v0);
        int v3_1 = v2_2.readInt();
        v2_2.recycle();
        return v3_1;
    }

    public final android.os.Bundle zzd(int p2, String p3, String p4, android.os.Bundle p5)
    {
        android.os.Parcel v2_0 = this.zzs();
        v2_0.writeInt(9);
        v2_0.writeString(p3);
        v2_0.writeString(p4);
        com.google.android.gms.internal.play_billing.zzar.zzc(v2_0, p5);
        android.os.Parcel v2_1 = this.zzt(902, v2_0);
        android.os.Bundle v3_3 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(v2_1, android.os.Bundle.CREATOR));
        v2_1.recycle();
        return v3_3;
    }

    public final android.os.Bundle zze(int p2, String p3, String p4, android.os.Bundle p5)
    {
        android.os.Parcel v2_0 = this.zzs();
        v2_0.writeInt(9);
        v2_0.writeString(p3);
        v2_0.writeString(p4);
        com.google.android.gms.internal.play_billing.zzar.zzc(v2_0, p5);
        android.os.Parcel v2_1 = this.zzt(12, v2_0);
        android.os.Bundle v3_3 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(v2_1, android.os.Bundle.CREATOR));
        v2_1.recycle();
        return v3_3;
    }

    public final android.os.Bundle zzf(int p1, String p2, String p3, String p4, String p5)
    {
        android.os.Parcel v1_0 = this.zzs();
        v1_0.writeInt(3);
        v1_0.writeString(p2);
        v1_0.writeString(p3);
        v1_0.writeString(p4);
        v1_0.writeString(0);
        android.os.Parcel v1_1 = this.zzt(3, v1_0);
        android.os.Bundle v2_3 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(v1_1, android.os.Bundle.CREATOR));
        v1_1.recycle();
        return v2_3;
    }

    public final android.os.Bundle zzg(int p1, String p2, String p3, String p4, String p5, android.os.Bundle p6)
    {
        p5 = this.zzs();
        p5.writeInt(p1);
        p5.writeString(p2);
        p5.writeString(p3);
        p5.writeString(p4);
        p5.writeString(0);
        com.google.android.gms.internal.play_billing.zzar.zzc(p5, p6);
        android.os.Parcel v1_1 = this.zzt(8, p5);
        android.os.Bundle v2_3 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(v1_1, android.os.Bundle.CREATOR));
        v1_1.recycle();
        return v2_3;
    }

    public final android.os.Bundle zzh(int p2, String p3, String p4, String p5)
    {
        android.os.Parcel v2_0 = this.zzs();
        v2_0.writeInt(3);
        v2_0.writeString(p3);
        v2_0.writeString(p4);
        v2_0.writeString(p5);
        android.os.Parcel v2_1 = this.zzt(4, v2_0);
        android.os.Bundle v3_3 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(v2_1, android.os.Bundle.CREATOR));
        v2_1.recycle();
        return v3_3;
    }

    public final android.os.Bundle zzi(int p2, String p3, String p4, String p5, android.os.Bundle p6)
    {
        android.os.Parcel v0 = this.zzs();
        v0.writeInt(p2);
        v0.writeString(p3);
        v0.writeString(p4);
        v0.writeString(p5);
        com.google.android.gms.internal.play_billing.zzar.zzc(v0, p6);
        android.os.Parcel v2_2 = this.zzt(11, v0);
        android.os.Bundle v3_3 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(v2_2, android.os.Bundle.CREATOR));
        v2_2.recycle();
        return v3_3;
    }

    public final android.os.Bundle zzj(int p2, String p3, String p4, android.os.Bundle p5, android.os.Bundle p6)
    {
        android.os.Parcel v0 = this.zzs();
        v0.writeInt(p2);
        v0.writeString(p3);
        v0.writeString(p4);
        com.google.android.gms.internal.play_billing.zzar.zzc(v0, p5);
        com.google.android.gms.internal.play_billing.zzar.zzc(v0, p6);
        android.os.Parcel v2_2 = this.zzt(901, v0);
        android.os.Bundle v3_3 = ((android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(v2_2, android.os.Bundle.CREATOR));
        v2_2.recycle();
        return v3_3;
    }

    public final void zzk(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzx p5)
    {
        p2 = this.zzs();
        p2.writeInt(21);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzv(1501, p2);
        return;
    }

    public final void zzl(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzz p5)
    {
        p2 = this.zzs();
        p2.writeInt(22);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzv(1801, p2);
        return;
    }

    public final void zzm(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzab p5)
    {
        p2 = this.zzs();
        p2.writeInt(21);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzv(1601, p2);
        return;
    }

    public final void zzn(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzad p5)
    {
        p2 = this.zzs();
        p2.writeInt(18);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzu(1301, p2);
        return;
    }

    public final void zzo(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzaf p5)
    {
        p2 = this.zzs();
        p2.writeInt(22);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzv(1901, p2);
        return;
    }

    public final void zzp(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzah p5)
    {
        p2 = this.zzs();
        p2.writeInt(21);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzv(1401, p2);
        return;
    }

    public final void zzq(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzaj p5)
    {
        p2 = this.zzs();
        p2.writeInt(24);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzv(1701, p2);
        return;
    }

    public final void zzr(int p2, String p3, android.os.Bundle p4, com.google.android.gms.internal.play_billing.zzao p5)
    {
        p2 = this.zzs();
        p2.writeInt(12);
        p2.writeString(p3);
        com.google.android.gms.internal.play_billing.zzar.zzc(p2, p4);
        p2.writeStrongBinder(p5);
        this.zzu(1201, p2);
        return;
    }

    public final int zzw(int p2, String p3, String p4)
    {
        android.os.Parcel v0 = this.zzs();
        v0.writeInt(p2);
        v0.writeString(p3);
        v0.writeString(p4);
        android.os.Parcel v2_2 = this.zzt(1, v0);
        int v3_1 = v2_2.readInt();
        v2_2.recycle();
        return v3_1;
    }
}
