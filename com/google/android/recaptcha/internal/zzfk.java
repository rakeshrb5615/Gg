package com.google.android.recaptcha.internal;
public final class zzfk {
    private final java.util.List zza;

    public zzfk()
    {
        this(1);
        return;
    }

    public zzfk(boolean p3)
    {
        this.zza = com.google.android.recaptcha.internal.zzfk.zzf(a.a.H(new String[] {"www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"})));
        return;
    }

    public static final boolean zzc(android.net.Uri p0)
    {
        return com.google.android.recaptcha.internal.zzfk.zze(p0);
    }

    private final boolean zzd(String p3)
    {
        java.util.Iterator v0_0 = this.zza;
        if ((v0_0 == null) || (!v0_0.isEmpty())) {
            java.util.Iterator v0_1 = v0_0.iterator();
            while (v0_1.hasNext()) {
                if (b8.p.p0(p3, ((String) v0_1.next()))) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private static final boolean zze(android.net.Uri p2)
    {
        if ((android.text.TextUtils.isEmpty(p2.toString())) || ((!"https".equals(p2.getScheme())) || (android.text.TextUtils.isEmpty(p2.getHost())))) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final java.util.List zzf(java.util.List p4)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(i7.j.X(p4, 10));
        java.util.Iterator v4_1 = p4.iterator();
        while (v4_1.hasNext()) {
            String v1_2 = ((String) v4_1.next());
            StringBuilder v2_1 = new StringBuilder("https://");
            v2_1.append(v1_2);
            v2_1.append("/");
            v0_1.add(v2_1.toString());
        }
        return v0_1;
    }

    public final boolean zza(android.net.Uri p2)
    {
        if ((!com.google.android.recaptcha.internal.zzfk.zze(p2)) || (!this.zzd(p2.toString()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzb(String p2)
    {
        int v2_1 = android.net.Uri.parse(p2);
        kotlin.jvm.internal.j.b(v2_1);
        if ((!com.google.android.recaptcha.internal.zzfk.zze(v2_1)) || (!this.zzd(v2_1.toString()))) {
            return 0;
        } else {
            return 1;
        }
    }
}
