package com.google.android.gms.internal.common;
public final class zzq {

    public static final CharSequence zza(Object p0, String p1)
    {
        java.util.Objects.requireNonNull(p0);
        if (!(p0 instanceof CharSequence)) {
            return p0.toString();
        } else {
            return ((CharSequence) p0);
        }
    }
}
