package com.google.android.gms.internal.play_billing;
public abstract class zzds implements com.google.android.gms.internal.play_billing.zzgl {
    protected int zza;

    public zzds()
    {
        this.zza = 0;
        return;
    }

    public static void zzg(Iterable p4, java.util.List p5)
    {
        int v0_3 = ((java.util.Collection) p4).size();
        if (!(p5 instanceof java.util.ArrayList)) {
            if ((p5 instanceof com.google.android.gms.internal.play_billing.zzgt)) {
                ((com.google.android.gms.internal.play_billing.zzgt) p5).zzf((p5.size() + v0_3));
            }
        } else {
            ((java.util.ArrayList) p5).ensureCapacity((p5.size() + v0_3));
        }
        int v0_2 = p5.size();
        int v1_3 = ((java.util.List) p4).size();
        int v2_4 = 0;
        while (v2_4 < v1_3) {
            Object v3 = ((java.util.List) p4).get(v2_4);
            if (v3 != null) {
                p5.add(v3);
                v2_4++;
            } else {
                String v4_4 = v1.a.j("Element at index ", (p5.size() - v0_2), " is null.");
                int v1_5 = p5.size();
                while(true) {
                    v1_5--;
                    if (v1_5 < v0_2) {
                        break;
                    }
                    p5.remove(v1_5);
                }
                throw new NullPointerException(v4_4);
            }
        }
        return;
    }

    public final byte[] zzM()
    {
        try {
            java.io.IOException v0_0 = this.zzj();
            String v1_3 = new byte[v0_0];
            RuntimeException v2_3 = new com.google.android.gms.internal.play_billing.zzem(v1_3, 0, v0_0);
            this.zzL(v2_3);
            v2_3.zzE();
            return v1_3;
        } catch (java.io.IOException v0_1) {
            throw new RuntimeException(v1.a.l("Serializing ", this.getClass().getName(), " to a byte array threw an IOException (should never happen)."), v0_1);
        }
    }

    public int zze(com.google.android.gms.internal.play_billing.zzgv p1)
    {
        throw 0;
    }

    public final com.google.android.gms.internal.play_billing.zzei zzf()
    {
        try {
            java.io.IOException v0_0 = this.zzj();
            String v1_3 = new byte[v0_0];
            RuntimeException v2_3 = new com.google.android.gms.internal.play_billing.zzem(v1_3, 0, v0_0);
            this.zzL(v2_3);
            return com.google.android.gms.internal.play_billing.zzee.zza(v2_3, v1_3);
        } catch (java.io.IOException v0_2) {
            throw new RuntimeException(v1.a.l("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), v0_2);
        }
    }
}
