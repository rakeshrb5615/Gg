package com.google.android.recaptcha.internal;
final class zzfv extends n7.i implements u7.p {
    final synthetic String[] zza;
    final synthetic com.google.android.recaptcha.internal.zzfw zzb;
    final synthetic String zzc;

    public zzfv(String[] p1, com.google.android.recaptcha.internal.zzfw p2, String p3, l7.c p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzfv(this.zza, this.zzb, this.zzc, p5);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzfv) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        c4.b.e0(p8);
        h7.l v8_2 = this.zza;
        String v0_3 = v8_2.length;
        int v1_3 = new java.util.ArrayList(v0_3);
        StringBuilder v2_3 = 0;
        while (v2_3 < v0_3) {
            int v3_1 = v8_2[v2_3];
            int v4_2 = new StringBuilder("\"");
            v4_2.append(v3_1);
            v4_2.append("\"");
            v1_3.add(v4_2.toString());
            v2_3++;
        }
        String v0_4 = this.zzc;
        h7.l v8_1 = com.google.android.recaptcha.internal.zzfw.zza(this.zzb);
        int v1_0 = i7.i.c0(v1_3, ",", 0, 0, 0, 62);
        StringBuilder v2_2 = new StringBuilder();
        v2_2.append(v0_4);
        v2_2.append("(");
        v2_2.append(v1_0);
        v2_2.append(")");
        v8_1.evaluateJavascript(v2_2.toString(), 0);
        return h7.l.a;
    }
}
