package com.google.android.gms.internal.fido;
abstract class zzbb extends com.google.android.gms.internal.fido.zzbc {

    public zzbb()
    {
        return;
    }

    public final boolean contains(Object p4)
    {
        if ((p4 instanceof java.util.Map$Entry)) {
            Object v0_2 = this.zzf().get(((java.util.Map$Entry) p4).getKey());
            if ((v0_2 != null) && (v0_2.equals(((java.util.Map$Entry) p4).getValue()))) {
                return 1;
            }
        }
        return 0;
    }

    public final int hashCode()
    {
        return com.google.android.gms.internal.fido.zzbx.zza(this.zzf().zzc());
    }

    public final int size()
    {
        return this.zzf().size();
    }

    public abstract com.google.android.gms.internal.fido.zzba zzf();

    public final boolean zzg()
    {
        return 0;
    }
}
