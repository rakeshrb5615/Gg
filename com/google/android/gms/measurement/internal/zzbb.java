package com.google.android.gms.measurement.internal;
public final class zzbb {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final com.google.android.gms.measurement.internal.zzbe zzf;

    public zzbb(com.google.android.gms.measurement.internal.zzic p3, String p4, String p5, String p6, long p7, long p9, android.os.Bundle p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        this.zza = p5;
        this.zzb = p6;
        if (1 == android.text.TextUtils.isEmpty(p4)) {
            p4 = 0;
        }
        this.zzc = p4;
        this.zzd = p7;
        this.zze = p9;
        if ((p9 != 0) && (p9 > p7)) {
            p3.zzaV().zze().zzb("Event created with reverse previous/current timestamps. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5));
        }
        if ((p11 == null) || (p11.isEmpty())) {
            com.google.android.gms.measurement.internal.zzbe v3_2 = new com.google.android.gms.measurement.internal.zzbe(new android.os.Bundle());
        } else {
            android.os.Bundle v4_9 = new android.os.Bundle(p11);
            java.util.Iterator v5_3 = v4_9.keySet().iterator();
            while (v5_3.hasNext()) {
                String v6_4 = ((String) v5_3.next());
                if (v6_4 != null) {
                    com.google.android.gms.measurement.internal.zzgs v7_2 = p3.zzk().zzE(v6_4, v4_9.get(v6_4));
                    if (v7_2 != null) {
                        p3.zzk().zzM(v4_9, v6_4, v7_2);
                    } else {
                        p3.zzaV().zze().zzb("Param value can\'t be null", p3.zzl().zzb(v6_4));
                        v5_3.remove();
                    }
                } else {
                    p3.zzaV().zzb().zza("Param name can\'t be null");
                    v5_3.remove();
                }
            }
            v3_2 = new com.google.android.gms.measurement.internal.zzbe(v4_9);
        }
        this.zzf = v3_2;
        return;
    }

    private zzbb(com.google.android.gms.measurement.internal.zzic p3, String p4, String p5, String p6, long p7, long p9, com.google.android.gms.measurement.internal.zzbe p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        this.zza = p5;
        this.zzb = p6;
        if (1 == android.text.TextUtils.isEmpty(p4)) {
            p4 = 0;
        }
        this.zzc = p4;
        this.zzd = p7;
        this.zze = p9;
        if ((p9 != 0) && (p9 > p7)) {
            p3.zzaV().zze().zzc("Event created with reverse previous/current timestamps. appId, name", com.google.android.gms.measurement.internal.zzgu.zzl(p5), com.google.android.gms.measurement.internal.zzgu.zzl(p6));
        }
        this.zzf = p11;
        return;
    }

    public final String toString()
    {
        String v0_1 = this.zzf.toString();
        String v1_2 = this.zza;
        String v3 = this.zzb;
        StringBuilder v4_3 = new StringBuilder((((((String.valueOf(v1_2).length() + 22) + String.valueOf(v3).length()) + 10) + v0_1.length()) + 1));
        v4_3.append("Event{appId=\'");
        v4_3.append(v1_2);
        v4_3.append("\', name=\'");
        v4_3.append(v3);
        return v1.a.o(v4_3, "\', params=", v0_1, "}");
    }

    public final com.google.android.gms.measurement.internal.zzbb zza(com.google.android.gms.measurement.internal.zzic p11, long p12)
    {
        return new com.google.android.gms.measurement.internal.zzbb(p11, this.zzc, this.zza, this.zzb, this.zzd, p12, this.zzf);
    }
}
