package com.google.android.gms.internal.firebase-auth-api;
public final class zzafe {
    private android.content.Context zza;
    private com.google.android.gms.internal.firebase-auth-api.zzafx zzb;
    private String zzc;
    private final q4.f zzd;
    private boolean zze;
    private String zzf;

    public zzafe(android.content.Context p2, q4.f p3, String p4)
    {
        this.zze = 0;
        this.zza = ((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzd = ((q4.f) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzc = g2.g.l("Android/Fallback/", p4);
        return;
    }

    public zzafe(q4.f p2, String p3)
    {
        p2.a();
        this(p2.a, p2, p3);
        return;
    }

    private static String zza(q4.f p0)
    {
        if (com.google.firebase.auth.FirebaseAuth.getInstance(p0).p.get() != null) {
            throw new ClassCastException();
        } else {
            return 0;
        }
    }

    private static String zzb(q4.f p4)
    {
        String v4_11 = ((a6.f) com.google.firebase.auth.FirebaseAuth.getInstance(p4).q.get());
        if (v4_11 != null) {
            try {
                String v4_3;
                String v4_12 = ((a6.d) v4_11);
            } catch (String v4_5) {
                String v4_6 = v4_5.getMessage();
                String v1_5 = new StringBuilder("Unable to get heartbeats: ");
                v1_5.append(v4_6);
                android.util.Log.w("LocalRequestInterceptor", v1_5.toString());
            } catch (String v4_5) {
            }
            if (((android.os.UserManager) v4_12.b.getSystemService(android.os.UserManager)).isUserUnlocked()) {
                v4_3 = com.google.android.gms.tasks.Tasks.call(v4_12.e, new a6.c(v4_12, 0));
            } else {
                v4_3 = com.google.android.gms.tasks.Tasks.forResult("");
            }
            return ((String) com.google.android.gms.tasks.Tasks.await(v4_3));
        }
        return 0;
    }

    public final void zza(String p1)
    {
        this.zze = (android.text.TextUtils.isEmpty(p1) ^ 1);
        return;
    }

    public final void zza(java.net.URLConnection p4)
    {
        String v0_10;
        if (!this.zze) {
            v0_10 = g2.g.d(this.zzc, "/FirebaseCore-Android");
        } else {
            v0_10 = g2.g.d(this.zzc, "/FirebaseUI-Android");
        }
        if (this.zzb == null) {
            this.zzb = new com.google.android.gms.internal.firebase-auth-api.zzafx(this.zza);
        }
        p4.setRequestProperty("X-Android-Package", this.zzb.zzb());
        p4.setRequestProperty("X-Android-Cert", this.zzb.zza());
        p4.setRequestProperty("Accept-Language", com.google.android.gms.internal.firebase-auth-api.zzafd.zza());
        p4.setRequestProperty("X-Client-Version", v0_10);
        p4.setRequestProperty("X-Firebase-Locale", this.zzf);
        String v0_3 = this.zzd;
        v0_3.a();
        p4.setRequestProperty("X-Firebase-GMPID", v0_3.c.b);
        p4.setRequestProperty("X-Firebase-Client", com.google.android.gms.internal.firebase-auth-api.zzafe.zzb(this.zzd));
        String v0_9 = com.google.android.gms.internal.firebase-auth-api.zzafe.zza(this.zzd);
        if (!android.text.TextUtils.isEmpty(v0_9)) {
            p4.setRequestProperty("X-Firebase-AppCheck", v0_9);
        }
        this.zzf = 0;
        return;
    }

    public final void zzb(String p1)
    {
        this.zzf = p1;
        return;
    }
}
