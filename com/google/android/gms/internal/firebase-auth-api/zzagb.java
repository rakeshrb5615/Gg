package com.google.android.gms.internal.firebase-auth-api;
public final class zzagb {
    private static final java.util.Map zza;

    static zzagb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza = new r.e(0);
        return;
    }

    public static y4.u zza(String p0, y4.u p1, com.google.android.gms.internal.firebase-auth-api.zzaff p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza(p0, p2);
        return new com.google.android.gms.internal.firebase-auth-api.zzaga(p1, p0);
    }

    public static void zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza.clear();
        return;
    }

    public static synthetic void zza(String p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza.remove(p1);
        return;
    }

    private static void zza(String p4, com.google.android.gms.internal.firebase-auth-api.zzaff p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzagb.zza.put(p4, new com.google.android.gms.internal.firebase-auth-api.zzagd(p5, com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis()));
        return;
    }

    public static boolean zza(String p8, y4.u p9, android.app.Activity p10, java.util.concurrent.Executor p11)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_0 = com.google.android.gms.internal.firebase-auth-api.zzagb.zza;
        if (!v0_0.containsKey(p8)) {
            com.google.android.gms.internal.firebase-auth-api.zzagb.zza(p8, 0);
            return 0;
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = ((com.google.android.gms.internal.firebase-auth-api.zzagd) v0_0.get(p8));
            if ((com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis() - v0_1.zzb) >= 120000) {
                com.google.android.gms.internal.firebase-auth-api.zzagb.zza(p8, 0);
                return 0;
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzaff v0_2 = v0_1.zza;
                if (v0_2 != null) {
                    v0_2.zza(p9, p10, p11, p8);
                }
                return 1;
            }
        }
    }
}
