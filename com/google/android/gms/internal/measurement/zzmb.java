package com.google.android.gms.internal.measurement;
public class zzmb extends com.google.android.gms.internal.measurement.zzkr {
    protected com.google.android.gms.internal.measurement.zzmf zza;
    private final com.google.android.gms.internal.measurement.zzmf zzb;

    public zzmb(com.google.android.gms.internal.measurement.zzmf p2)
    {
        this.zzb = p2;
        if (p2.zzcf()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        } else {
            this.zza = p2.zzch();
            return;
        }
    }

    private static void zza(Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zznu.zza().zzb(p2.getClass()).zzd(p2, p3);
        return;
    }

    public final bridge synthetic Object clone()
    {
        return this.zzba();
    }

    public final bridge synthetic com.google.android.gms.internal.measurement.zzkr zzaR()
    {
        return this.zzba();
    }

    public final bridge synthetic com.google.android.gms.internal.measurement.zzkr zzaS(byte[] p2, int p3, int p4)
    {
        p3 = com.google.android.gms.internal.measurement.zznu.zza;
        this.zzbe(p2, 0, p4, com.google.android.gms.internal.measurement.zzlr.zza);
        return this;
    }

    public final bridge synthetic com.google.android.gms.internal.measurement.zzkr zzaT(byte[] p1, int p2, int p3, com.google.android.gms.internal.measurement.zzlr p4)
    {
        this.zzbe(p1, 0, p3, p4);
        return this;
    }

    public final void zzaX()
    {
        if (!this.zza.zzcf()) {
            this.zzaY();
        }
        return;
    }

    public void zzaY()
    {
        com.google.android.gms.internal.measurement.zzmf v0_1 = this.zzb.zzch();
        com.google.android.gms.internal.measurement.zzmb.zza(v0_1, this.zza);
        this.zza = v0_1;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzmb zzba()
    {
        com.google.android.gms.internal.measurement.zzmb v0_2 = ((com.google.android.gms.internal.measurement.zzmb) this.zzb.zzl(5, 0, 0));
        v0_2.zza = this.zzbb();
        return v0_2;
    }

    public com.google.android.gms.internal.measurement.zzmf zzbb()
    {
        if (this.zza.zzcf()) {
            this.zza.zzcj();
            return this.zza;
        } else {
            return this.zza;
        }
    }

    public final com.google.android.gms.internal.measurement.zzmf zzbc()
    {
        com.google.android.gms.internal.measurement.zzmf v0 = this.zzbb();
        if (!v0.zzcD()) {
            throw new com.google.android.gms.internal.measurement.zzoh(v0);
        } else {
            return v0;
        }
    }

    public final com.google.android.gms.internal.measurement.zzmb zzbd(com.google.android.gms.internal.measurement.zzmf p2)
    {
        if (!this.zzb.equals(p2)) {
            if (!this.zza.zzcf()) {
                this.zzaY();
            }
            com.google.android.gms.internal.measurement.zzmb.zza(this.zza, p2);
        }
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzmb zzbe(byte[] p8, int p9, int p10, com.google.android.gms.internal.measurement.zzlr p11)
    {
        if (!this.zza.zzcf()) {
            this.zzaY();
        }
        try {
            com.google.android.gms.internal.measurement.zznu.zza().zzb(this.zza.getClass()).zzi(this.zza, p8, 0, p10, new com.google.android.gms.internal.measurement.zzkw(p11));
            return this;
        } catch (java.io.IOException v0_1) {
            throw v0_1;
        } catch (IndexOutOfBoundsException) {
            throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (java.io.IOException v0_0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", v0_0);
        }
    }

    public bridge synthetic com.google.android.gms.internal.measurement.zznm zzbf()
    {
        return this.zzbb();
    }

    public final boolean zzcD()
    {
        return com.google.android.gms.internal.measurement.zzmf.zzcx(this.zza, 0);
    }

    public final bridge synthetic com.google.android.gms.internal.measurement.zznm zzcE()
    {
        throw 0;
    }
}
