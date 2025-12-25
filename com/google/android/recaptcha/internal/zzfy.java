package com.google.android.recaptcha.internal;
public final class zzfy extends com.google.android.recaptcha.internal.zzfx {
    private final u7.p zza;
    private final String zzb;

    public zzfy(u7.p p1, String p2, Object p3)
    {
        super(p3);
        super.zza = p1;
        super.zzb = p2;
        return;
    }

    public final boolean zza(Object p5, reflect.Method p6, Object[] p7)
    {
        if (!kotlin.jvm.internal.j.a(p6.getName(), this.zzb)) {
            return 0;
        } else {
            u7.p v0_0;
            int v5_7 = com.google.android.recaptcha.internal.zzti.zzf();
            if (p7 == null) {
                v0_0 = i7.n.a;
            } else {
                v0_0 = new java.util.ArrayList(p7.length);
                int v1_1 = 0;
                while (v1_1 < p7.length) {
                    com.google.android.recaptcha.internal.zzth v2_2 = p7[v1_1];
                    com.google.android.recaptcha.internal.zztg v3 = com.google.android.recaptcha.internal.zzth.zzf();
                    v3.zzw(v2_2.toString());
                    v0_0.add(((com.google.android.recaptcha.internal.zzth) v3.zzi()));
                    v1_1++;
                }
            }
            v5_7.zze(v0_0);
            u7.p v0_2 = this.zza;
            int v5_3 = ((com.google.android.recaptcha.internal.zzti) v5_7.zzi()).zzd();
            v0_2.invoke(p7, com.google.android.recaptcha.internal.zzkh.zzh().zzi(v5_3, 0, v5_3.length));
            return 1;
        }
    }
}
