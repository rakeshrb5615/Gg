package com.google.android.gms.internal.measurement;
public final class zzl extends com.google.android.gms.internal.measurement.zzal {
    private final com.google.android.gms.internal.measurement.zzab zzb;

    public zzl(com.google.android.gms.internal.measurement.zzab p1)
    {
        this.zzb = p1;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p5, com.google.android.gms.internal.measurement.zzg p6, java.util.List p7)
    {
        switch (p5.hashCode()) {
            case 21624207:
                if (!p5.equals("getEventName")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("getEventName", 0, p7);
                    return new com.google.android.gms.internal.measurement.zzas(this.zzb.zzc().zzb());
                }
            case 45521504:
                if (!p5.equals("getTimestamp")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("getTimestamp", 0, p7);
                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) this.zzb.zzc().zza())));
                }
            case 146575578:
                if (!p5.equals("getParamValue")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("getParamValue", 1, p7);
                    return com.google.android.gms.internal.measurement.zzi.zza(this.zzb.zzc().zze(p6.zza(((com.google.android.gms.internal.measurement.zzao) p7.get(0))).zzc()));
                }
            case 700587132:
                if (!p5.equals("getParams")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("getParams", 0, p7);
                    String v5_25 = this.zzb.zzc().zzf();
                    com.google.android.gms.internal.measurement.zzas v6_18 = new com.google.android.gms.internal.measurement.zzal();
                    String v7_7 = v5_25.keySet().iterator();
                    while (v7_7.hasNext()) {
                        String v0_11 = ((String) v7_7.next());
                        v6_18.zzm(v0_11, com.google.android.gms.internal.measurement.zzi.zza(v5_25.get(v0_11)));
                    }
                    return v6_18;
                }
            case 920706790:
                if (!p5.equals("setParamValue")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("setParamValue", 2, p7);
                    String v5_22 = p6.zza(((com.google.android.gms.internal.measurement.zzao) p7.get(0))).zzc();
                    com.google.android.gms.internal.measurement.zzas v6_16 = p6.zza(((com.google.android.gms.internal.measurement.zzao) p7.get(1)));
                    this.zzb.zzc().zzd(v5_22, com.google.android.gms.internal.measurement.zzh.zzj(v6_16));
                    return v6_16;
                }
            case 1570616835:
                if (!p5.equals("setEventName")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("setEventName", 1, p7);
                    String v5_13 = p6.zza(((com.google.android.gms.internal.measurement.zzao) p7.get(0)));
                    if ((com.google.android.gms.internal.measurement.zzao.zzf.equals(v5_13)) || (com.google.android.gms.internal.measurement.zzao.zzg.equals(v5_13))) {
                        throw new IllegalArgumentException("Illegal event name");
                    } else {
                        this.zzb.zzc().zzc(v5_13.zzc());
                        return new com.google.android.gms.internal.measurement.zzas(v5_13.zzc());
                    }
                }
            default:
        }
        return super.zzcA(p5, p6, p7);
    }
}
