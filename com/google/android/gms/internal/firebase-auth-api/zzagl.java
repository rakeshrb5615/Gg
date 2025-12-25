package com.google.android.gms.internal.firebase-auth-api;
public final class zzagl {
    private static final java.util.Map zza;
    private static final java.util.Map zzb;

    static zzagl()
    {
        com.google.android.gms.internal.firebase-auth-api.zzagl.zza = new r.e(0);
        com.google.android.gms.internal.firebase-auth-api.zzagl.zzb = new r.e(0);
        return;
    }

    public static String zza(String p3)
    {
        IllegalStateException v3_6 = ((com.google.android.gms.internal.firebase-auth-api.zzagk) com.google.android.gms.internal.firebase-auth-api.zzagl.zza.get(p3));
        if (v3_6 == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        } else {
            return g2.g.d(com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v3_6.zzb(), v3_6.zza(), v3_6.zzb().contains(":")), "emulator/auth/handler");
        }
    }

    private static String zza(String p2, int p3, boolean p4)
    {
        if (p4 == null) {
            StringBuilder v4_4 = new StringBuilder("http://");
            v4_4.append(p2);
            v4_4.append(":");
            v4_4.append(p3);
            v4_4.append("/");
            return v4_4.toString();
        } else {
            StringBuilder v4_2 = new StringBuilder("http://[");
            v4_2.append(p2);
            v4_2.append("]:");
            v4_2.append(p3);
            v4_2.append("/");
            return v4_2.toString();
        }
    }

    public static void zza(String p3, com.google.android.gms.internal.firebase-auth-api.zzagn p4)
    {
        java.util.Map v0 = com.google.android.gms.internal.firebase-auth-api.zzagl.zzb;
        if (!v0.containsKey(p3)) {
            java.util.ArrayList v1_4 = new java.util.ArrayList();
            v1_4.add(new ref.WeakReference(p4));
            v0.put(p3, v1_4);
        } else {
            ((java.util.List) v0.get(p3)).add(new ref.WeakReference(p4));
        }
        return;
    }

    public static void zza(q4.f p2, String p3, int p4)
    {
        p2.a();
        Throwable v2_2 = p2.c.a;
        com.google.android.gms.internal.firebase-auth-api.zzagl.zza.put(v2_2, new com.google.android.gms.internal.firebase-auth-api.zzagk(p3, p4));
        java.util.Map v3_1 = com.google.android.gms.internal.firebase-auth-api.zzagl.zzb;
        if (v3_1.containsKey(v2_2)) {
            java.util.Map v4_4 = ((java.util.List) v3_1.get(v2_2)).iterator();
            int v0_0 = 0;
            while (v4_4.hasNext()) {
                com.google.android.gms.internal.firebase-auth-api.zzagn v1_4 = ((com.google.android.gms.internal.firebase-auth-api.zzagn) ((ref.WeakReference) v4_4.next()).get());
                if (v1_4 != null) {
                    v1_4.zza();
                    v0_0 = 1;
                }
            }
            if (v0_0 == 0) {
                com.google.android.gms.internal.firebase-auth-api.zzagl.zza.remove(v2_2);
            }
        }
        return;
    }

    public static boolean zza(q4.f p1)
    {
        p1.a();
        return com.google.android.gms.internal.firebase-auth-api.zzagl.zza.containsKey(p1.c.a);
    }

    public static String zzb(String p3)
    {
        String v3_5;
        String v3_7 = ((com.google.android.gms.internal.firebase-auth-api.zzagk) com.google.android.gms.internal.firebase-auth-api.zzagl.zza.get(p3));
        if (v3_7 == null) {
            v3_5 = "https://";
        } else {
            v3_5 = g2.g.l("", com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v3_7.zzb(), v3_7.zza(), v3_7.zzb().contains(":")));
        }
        return g2.g.d(v3_5, "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String p3)
    {
        String v3_5;
        String v3_7 = ((com.google.android.gms.internal.firebase-auth-api.zzagk) com.google.android.gms.internal.firebase-auth-api.zzagl.zza.get(p3));
        if (v3_7 == null) {
            v3_5 = "https://";
        } else {
            v3_5 = g2.g.l("", com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v3_7.zzb(), v3_7.zza(), v3_7.zzb().contains(":")));
        }
        return g2.g.d(v3_5, "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String p3)
    {
        String v3_5;
        String v3_7 = ((com.google.android.gms.internal.firebase-auth-api.zzagk) com.google.android.gms.internal.firebase-auth-api.zzagl.zza.get(p3));
        if (v3_7 == null) {
            v3_5 = "https://";
        } else {
            v3_5 = g2.g.l("", com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v3_7.zzb(), v3_7.zza(), v3_7.zzb().contains(":")));
        }
        return g2.g.d(v3_5, "securetoken.googleapis.com/v1");
    }
}
