package com.google.android.gms.internal.measurement;
public final class zzjl implements com.google.android.gms.internal.measurement.zzjh {
    private final java.util.concurrent.atomic.AtomicBoolean zza;
    private java.util.HashMap zzb;
    private final java.util.HashMap zzc;
    private final java.util.HashMap zzd;
    private final java.util.HashMap zze;
    private final java.util.HashMap zzf;
    private Object zzg;
    private boolean zzh;
    private final String[] zzi;

    public zzjl()
    {
        this.zza = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzb = 0;
        this.zzc = new java.util.HashMap(16, 1065353216);
        this.zzd = new java.util.HashMap(16, 1065353216);
        this.zze = new java.util.HashMap(16, 1065353216);
        this.zzf = new java.util.HashMap(16, 1065353216);
        this.zzg = 0;
        this.zzh = 0;
        String[] v0_3 = new String[0];
        this.zzi = v0_3;
        return;
    }

    public final String zza(android.content.ContentResolver p10, String p11, String p12)
    {
        if (p10 == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        } else {
            String v2 = 0;
            if (this.zzb != null) {
                if (this.zza.getAndSet(0)) {
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd.clear();
                    this.zze.clear();
                    this.zzf.clear();
                    this.zzg = new Object();
                    this.zzh = 0;
                }
            } else {
                this.zza.set(0);
                this.zzb = new java.util.HashMap(16, 1065353216);
                this.zzg = new Object();
                p10.registerContentObserver(com.google.android.gms.internal.measurement.zzjg.zza, 1, new com.google.android.gms.internal.measurement.zzjj(this, 0));
            }
            String v12_15 = this.zzg;
            if (!this.zzb.containsKey(p11)) {
                try {
                    android.net.Uri v4 = com.google.android.gms.internal.measurement.zzjg.zza;
                    android.content.ContentProviderClient v3_1 = p10.acquireUnstableContentProviderClient(v4);
                } catch (com.google.android.gms.internal.measurement.zzjk) {
                    return 0;
                }
                if (v3_1 == null) {
                    throw new com.google.android.gms.internal.measurement.zzjk("Unable to acquire ContentProviderClient");
                } else {
                    try {
                        java.util.HashMap v10_12 = v3_1.query(v4, 0, 0, new String[] {p11}), 0);
                        try {
                            if (v10_12 == null) {
                                throw new com.google.android.gms.internal.measurement.zzjk("ContentProvider query returned null cursor");
                            } else {
                                Throwable v0_0;
                                if (!v10_12.moveToFirst()) {
                                    v10_12.close();
                                    v3_1.release();
                                    v0_0 = 0;
                                } else {
                                    v0_0 = v10_12.getString(1);
                                    v10_12.close();
                                    v3_1.release();
                                }
                                if ((v0_0 != null) && (v0_0.equals(0))) {
                                    v0_0 = 0;
                                }
                                if (v12_15 == this.zzg) {
                                    this.zzb.put(p11, v0_0);
                                }
                                if (v0_0 == null) {
                                    return 0;
                                } else {
                                    return v0_0;
                                }
                            }
                        } catch (Throwable v0_4) {
                            Throwable v11_5 = v0_4;
                            if (v10_12 != null) {
                                try {
                                    v10_12.close();
                                } catch (Throwable v0_5) {
                                    v11_5.addSuppressed(v0_5);
                                }
                            }
                            throw v11_5;
                        }
                    } catch (Throwable v0_6) {
                        throw new com.google.android.gms.internal.measurement.zzjk("ContentProvider query failed", v0_6);
                    } catch (Throwable v0_7) {
                        java.util.HashMap v10_15 = v0_7;
                        v3_1.release();
                        throw v10_15;
                    }
                }
            } else {
                java.util.HashMap v10_7 = ((String) this.zzb.get(p11));
                if (v10_7 != null) {
                    v2 = v10_7;
                } else {
                }
                return v2;
            }
        }
    }

    public final synthetic java.util.concurrent.atomic.AtomicBoolean zzb()
    {
        return this.zza;
    }
}
