package com.google.android.gms.common.internal;
public abstract class zzc {
    private Object zza;
    private boolean zzb;
    final synthetic com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient p1, Object p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        this.zza = p2;
        this.zzb = 0;
        return;
    }

    public abstract void zzc();

    public final void zzd()
    {
        Object v2 = this.zza;
        if (this.zzb) {
            String v4 = this.toString();
            StringBuilder v6_1 = new StringBuilder((v4.length() + 47));
            v6_1.append("Callback proxy ");
            v6_1.append(v4);
            v6_1.append(" being reused. This is not safe.");
            android.util.Log.w("GmsClient", v6_1.toString());
        }
        if (v2 != null) {
            this.zzc(v2);
        }
        this.zzb = 1;
        this.zze();
        return;
    }

    public final void zze()
    {
        this.zzf();
        Throwable v0_0 = this.zzd;
        v0_0.zzj();
        try {
            v0_0.zzj().remove(this);
            return;
        } catch (Throwable v0_2) {
            throw v0_2;
        }
    }

    public final void zzf()
    {
        try {
            this.zza = 0;
            return;
        } catch (Throwable v0_1) {
            throw v0_1;
        }
    }
}
