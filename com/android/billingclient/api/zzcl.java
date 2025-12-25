package com.android.billingclient.api;
final class zzcl implements com.android.billingclient.api.zzch {
    private com.google.android.gms.internal.play_billing.zzis zzb;
    private final com.android.billingclient.api.zzcn zzc;

    public zzcl(android.content.Context p2, com.google.android.gms.internal.play_billing.zzis p3)
    {
        com.android.billingclient.api.zzcn v0_1 = new com.android.billingclient.api.zzcn(p2);
        this.zzc = v0_1;
        this.zzb = p3;
        return;
    }

    private final void zzl(com.google.android.gms.internal.play_billing.zzhx p2, com.google.android.gms.internal.play_billing.zzis p3)
    {
        if (p2 != null) {
            try {
                String v0_1 = com.google.android.gms.internal.play_billing.zzji.zzc();
                v0_1.zzn(p3);
                v0_1.zza(p2);
                this.zzc.zza(((com.google.android.gms.internal.play_billing.zzji) v0_1.zze()));
                return;
            } catch (Throwable v2_1) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v2_1);
                return;
            }
        } else {
            return;
        }
    }

    private final void zzm(com.google.android.gms.internal.play_billing.zzib p2, com.google.android.gms.internal.play_billing.zzis p3)
    {
        if (p2 != null) {
            try {
                String v0_1 = com.google.android.gms.internal.play_billing.zzji.zzc();
                v0_1.zzn(p3);
                v0_1.zzl(p2);
                this.zzc.zza(((com.google.android.gms.internal.play_billing.zzji) v0_1.zze()));
                return;
            } catch (Throwable v2_1) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v2_1);
                return;
            }
        } else {
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.play_billing.zzhx p3)
    {
        try {
            this.zzl(p3, this.zzb);
            return;
        } catch (Throwable v3_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v3_1);
            return;
        }
    }

    public final void zzb(com.google.android.gms.internal.play_billing.zzhx p2, int p3)
    {
        try {
            String v0_3 = ((com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm());
            v0_3.zzm(p3);
            this.zzb = ((com.google.android.gms.internal.play_billing.zzis) v0_3.zze());
            this.zza(p2);
            return;
        } catch (Throwable v2_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v2_1);
            return;
        }
    }

    public final void zzc(com.google.android.gms.internal.play_billing.zzhx p3, int p4, long p5)
    {
        try {
            long v0_3 = ((com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm());
            v0_3.zzm(p4);
            com.google.android.gms.internal.play_billing.zzis v4_4 = ((com.google.android.gms.internal.play_billing.zzis) v0_3.zze());
            this.zzb = v4_4;
        } catch (Throwable v3_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v3_1);
            return;
        }
        if (p5 != 0) {
            com.google.android.gms.internal.play_billing.zzis v4_2 = ((com.google.android.gms.internal.play_billing.zziq) v4_4.zzm());
            v4_2.zzo(p5);
            v4_4 = ((com.google.android.gms.internal.play_billing.zzis) v4_2.zze());
        } else {
        }
        this.zzl(p3, v4_4);
        return;
    }

    public final void zzd(com.google.android.gms.internal.play_billing.zzhx p3, long p4, boolean p6)
    {
        String v4_2;
        long v0_2 = ((com.google.android.gms.internal.play_billing.zzhv) p3.zzm());
        Throwable v3_6 = ((com.google.android.gms.internal.play_billing.zzja) p3.zzB().zzm());
        v3_6.zza(p6);
        v0_2.zzn(v3_6);
        Throwable v3_2 = ((com.google.android.gms.internal.play_billing.zzhx) v0_2.zze());
        if (p4 != 0) {
            com.google.android.gms.internal.play_billing.zziq v6_4 = ((com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm());
            v6_4.zzo(p4);
            v4_2 = ((com.google.android.gms.internal.play_billing.zzis) v6_4.zze());
        } else {
            v4_2 = this.zzb;
        }
        this.zzl(v3_2, v4_2);
        return;
    }

    public final void zze(com.google.android.gms.internal.play_billing.zzhx p3, int p4, long p5, boolean p7)
    {
        String v4_8;
        long v0_3 = ((com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm());
        v0_3.zzm(p4);
        this.zzb = ((com.google.android.gms.internal.play_billing.zzis) v0_3.zze());
        String v4_2 = ((com.google.android.gms.internal.play_billing.zzhv) p3.zzm());
        Throwable v3_3 = ((com.google.android.gms.internal.play_billing.zzja) p3.zzB().zzm());
        v3_3.zza(p7);
        v4_2.zzn(v3_3);
        Throwable v3_5 = ((com.google.android.gms.internal.play_billing.zzhx) v4_2.zze());
        if (p5 != 0) {
            String v4_6 = ((com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm());
            v4_6.zzo(p5);
            v4_8 = ((com.google.android.gms.internal.play_billing.zzis) v4_6.zze());
        } else {
            v4_8 = this.zzb;
        }
        this.zzl(v3_5, v4_8);
        return;
    }

    public final void zzf(com.google.android.gms.internal.play_billing.zzib p3)
    {
        try {
            this.zzm(p3, this.zzb);
            return;
        } catch (Throwable v3_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v3_1);
            return;
        }
    }

    public final void zzg(com.google.android.gms.internal.play_billing.zzib p2, int p3)
    {
        try {
            String v0_3 = ((com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm());
            v0_3.zzm(p3);
            this.zzb = ((com.google.android.gms.internal.play_billing.zzis) v0_3.zze());
            this.zzf(p2);
            return;
        } catch (Throwable v2_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v2_1);
            return;
        }
    }

    public final void zzh(com.google.android.gms.internal.play_billing.zzib p3, long p4, boolean p6)
    {
        String v4_2;
        long v0_2 = ((com.google.android.gms.internal.play_billing.zzhz) p3.zzm());
        Throwable v3_6 = ((com.google.android.gms.internal.play_billing.zzja) p3.zzA().zzm());
        v3_6.zza(p6);
        v0_2.zzm(v3_6);
        Throwable v3_2 = ((com.google.android.gms.internal.play_billing.zzib) v0_2.zze());
        if (p4 != 0) {
            com.google.android.gms.internal.play_billing.zziq v6_4 = ((com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm());
            v6_4.zzo(p4);
            v4_2 = ((com.google.android.gms.internal.play_billing.zzis) v6_4.zze());
        } else {
            v4_2 = this.zzb;
        }
        this.zzm(v3_2, v4_2);
        return;
    }

    public final void zzi(com.google.android.gms.internal.play_billing.zzij p3)
    {
        try {
            String v0_0 = com.google.android.gms.internal.play_billing.zzji.zzc();
            v0_0.zzn(this.zzb);
            v0_0.zzm(p3);
            this.zzc.zza(((com.google.android.gms.internal.play_billing.zzji) v0_0.zze()));
            return;
        } catch (Throwable v3_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v3_1);
            return;
        }
    }

    public final void zzj(com.google.android.gms.internal.play_billing.zzjo p4)
    {
        try {
            String v0_0 = this.zzc;
            String v1_1 = com.google.android.gms.internal.play_billing.zzji.zzc();
            v1_1.zzn(this.zzb);
            v1_1.zzo(p4);
            v0_0.zza(((com.google.android.gms.internal.play_billing.zzji) v1_1.zze()));
            return;
        } catch (Throwable v4_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v4_1);
            return;
        }
    }

    public final void zzk(com.google.android.gms.internal.play_billing.zzjs p3)
    {
        if (p3 != null) {
            try {
                String v0_1 = com.google.android.gms.internal.play_billing.zzji.zzc();
                v0_1.zzn(this.zzb);
                v0_1.zzp(p3);
                this.zzc.zza(((com.google.android.gms.internal.play_billing.zzji) v0_1.zze()));
                return;
            } catch (Throwable v3_1) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", v3_1);
                return;
            }
        } else {
            return;
        }
    }
}
