package com.google.android.gms.internal.fido;
public final class zzaf {

    public static final Appendable zza(Appendable p2, java.util.Iterator p3, com.google.android.gms.internal.fido.zzag p4, String p5)
    {
        if (p3.hasNext()) {
            CharSequence v5_10 = ((java.util.Map$Entry) p3.next());
            p2.append(com.google.android.gms.internal.fido.zzag.zzd(v5_10.getKey()));
            p2.append(" : ");
            p2.append(com.google.android.gms.internal.fido.zzag.zzd(v5_10.getValue()));
            while (p3.hasNext()) {
                p2.append(com.google.android.gms.internal.fido.zzag.zzc(p4));
                CharSequence v5_6 = ((java.util.Map$Entry) p3.next());
                p2.append(com.google.android.gms.internal.fido.zzag.zzd(v5_6.getKey()));
                p2.append(" : ");
                p2.append(com.google.android.gms.internal.fido.zzag.zzd(v5_6.getValue()));
            }
        }
        return p2;
    }
}
