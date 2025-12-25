package com.google.android.gms.internal.measurement;
public final class zzjr implements com.google.android.gms.internal.measurement.zzjv {
    public static final String[] zza;
    private static final java.util.concurrent.ConcurrentMap zzb;
    private final android.content.ContentResolver zzc;
    private final android.net.Uri zzd;
    private final Runnable zze;
    private android.database.ContentObserver zzf;
    private volatile boolean zzg;
    private final Object zzh;
    private volatile java.util.Map zzi;
    private final java.util.List zzj;

    static zzjr()
    {
        com.google.android.gms.internal.measurement.zzjr.zzb = new java.util.concurrent.ConcurrentHashMap();
        com.google.android.gms.internal.measurement.zzjr.zza = new String[] {"key", "value"});
        return;
    }

    private zzjr(android.content.ContentResolver p2, android.net.Uri p3, Runnable p4)
    {
        this.zzf = 0;
        this.zzg = 1;
        this.zzh = new Object();
        this.zzj = new java.util.ArrayList();
        p2.getClass();
        p3.getClass();
        this.zzc = p2;
        this.zzd = p3;
        this.zze = p4;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzjr zza(android.content.ContentResolver p3, android.net.Uri p4, Runnable p5)
    {
        com.google.android.gms.internal.measurement.zzjr v3_2 = ((com.google.android.gms.internal.measurement.zzjr) com.google.android.gms.internal.measurement.zzjr.zzb.computeIfAbsent(p4, new com.google.android.gms.internal.measurement.zzjq(p3, p4, p5)));
        try {
            if (!v3_2.zzg) {
                return v3_2;
            } else {
                if (v3_2.zzg) {
                    com.google.android.gms.internal.measurement.zzjo v5_3 = new com.google.android.gms.internal.measurement.zzjo(v3_2, 0);
                    v3_2.zzc.registerContentObserver(v3_2.zzd, 0, v5_3);
                    v3_2.zzf = v5_3;
                    v3_2.zzg = 0;
                }
                return v3_2;
            }
        } catch (SecurityException) {
            return 0;
        }
    }

    public static void zzd()
    {
        Throwable v0_3 = com.google.android.gms.internal.measurement.zzjr.zzb.values().iterator();
        while (v0_3.hasNext()) {
            com.google.android.gms.internal.measurement.zzjr v1_1 = ((com.google.android.gms.internal.measurement.zzjr) v0_3.next());
            if (!v1_1.zzg) {
                int v2_1 = v1_1.zzf;
                if (v2_1 != 0) {
                    v1_1.zzc.unregisterContentObserver(v2_1);
                    v1_1.zzf = 0;
                }
            } else {
                v1_1.zzg = 0;
            }
            v0_3.remove();
        }
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzjr zzf(android.content.ContentResolver p0, android.net.Uri p1, Runnable p2, android.net.Uri p3)
    {
        return new com.google.android.gms.internal.measurement.zzjr(p0, p1, p2);
    }

    public final java.util.Map zzb()
    {
        java.util.Map v0_0 = this.zzi;
        if (v0_0 == null) {
            try {
                v0_0 = this.zzi;
            } catch (java.util.Map v0_1) {
                throw v0_1;
            }
            if (v0_0 == null) {
                java.util.Map v0_3 = android.os.StrictMode.allowThreadDiskReads();
                try {
                    java.util.Map v2_1 = ((java.util.Map) com.google.android.gms.internal.measurement.zzjv.zzh(new com.google.android.gms.internal.measurement.zzjp(this)));
                } catch (java.util.Map v2_2) {
                    android.util.Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", v2_2);
                    v2_1 = java.util.Collections.EMPTY_MAP;
                } catch (java.util.Map v2_2) {
                } catch (java.util.Map v2_2) {
                } catch (java.util.Map v2_3) {
                    android.os.StrictMode.setThreadPolicy(v0_3);
                    throw v2_3;
                }
                android.os.StrictMode.setThreadPolicy(v0_3);
                this.zzi = v2_1;
                v0_0 = v2_1;
            }
        }
        if (v0_0 == null) {
            return java.util.Collections.EMPTY_MAP;
        } else {
            return v0_0;
        }
    }

    public final void zzc()
    {
        this.zzi = 0;
        this.zze.run();
        Throwable v0_2 = this.zzj.iterator();
        while (v0_2.hasNext()) {
            ((com.google.android.gms.internal.measurement.zzjs) v0_2.next()).zza();
        }
        return;
    }

    public final bridge synthetic Object zze(String p2)
    {
        return ((String) this.zzb().get(p2));
    }

    public final java.util.Map zzg()
    {
        String v2_0 = this.zzd;
        android.content.ContentProviderClient v1 = this.zzc.acquireUnstableContentProviderClient(v2_0);
        if (v1 != null) {
            try {
                String v2_1 = v1.query(v2_0, com.google.android.gms.internal.measurement.zzjr.zza, 0, 0, 0);
                try {
                    if (v2_1 != null) {
                        java.util.Map v0_1 = v2_1.getCount();
                        if (v0_1 != null) {
                            java.util.HashMap v3_2;
                            if (v0_1 > 256) {
                                v3_2 = new java.util.HashMap(v0_1, 1065353216);
                            } else {
                                v3_2 = new r.e(v0_1);
                            }
                            while (v2_1.moveToNext()) {
                                v3_2.put(v2_1.getString(0), v2_1.getString(1));
                            }
                            if (v2_1.isAfterLast()) {
                                v2_1.close();
                                v1.release();
                                return v3_2;
                            } else {
                                android.util.Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                v2_1.close();
                                v1.release();
                                return java.util.Collections.EMPTY_MAP;
                            }
                        } else {
                            v2_1.close();
                            v1.release();
                            return java.util.Collections.EMPTY_MAP;
                        }
                    } else {
                        android.util.Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        v1.release();
                        return java.util.Collections.EMPTY_MAP;
                    }
                } catch (java.util.Map v0_11) {
                    java.util.HashMap v3_4 = v0_11;
                    if (v2_1 != null) {
                        try {
                            v2_1.close();
                        } catch (java.util.Map v0_12) {
                            v3_4.addSuppressed(v0_12);
                        }
                    }
                    throw v3_4;
                }
            } catch (java.util.Map v0_13) {
                android.util.Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", v0_13);
                v1.release();
                return java.util.Collections.EMPTY_MAP;
            } catch (java.util.Map v0_15) {
                v1.release();
                throw v0_15;
            }
        } else {
            android.util.Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
            return java.util.Collections.EMPTY_MAP;
        }
    }
}
