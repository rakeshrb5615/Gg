package com.google.android.gms.internal.fido;
public final class zzag {
    private final String zza;

    private zzag(String p1)
    {
        this.zza = ",\n  ";
        return;
    }

    public static com.google.android.gms.internal.fido.zzag zza(String p1)
    {
        return new com.google.android.gms.internal.fido.zzag(",\n  ");
    }

    public static bridge synthetic String zzc(com.google.android.gms.internal.fido.zzag p0)
    {
        return p0.zza;
    }

    public static final CharSequence zzd(Object p1)
    {
        p1.getClass();
        if (!(p1 instanceof CharSequence)) {
            return p1.toString();
        } else {
            return ((CharSequence) p1);
        }
    }

    public final Appendable zzb(Appendable p2, java.util.Iterator p3)
    {
        if (p3.hasNext()) {
            p2.append(com.google.android.gms.internal.fido.zzag.zzd(p3.next()));
            while (p3.hasNext()) {
                p2.append(this.zza);
                p2.append(com.google.android.gms.internal.fido.zzag.zzd(p3.next()));
            }
        }
        return p2;
    }
}
