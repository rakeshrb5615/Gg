package com.google.android.gms.internal.firebase-auth-api;
final class zzo extends com.google.android.gms.internal.firebase-auth-api.zzl implements java.io.Serializable {
    private final java.util.regex.Pattern zza;

    public zzo(java.util.regex.Pattern p1)
    {
        this.zza = ((java.util.regex.Pattern) com.google.android.gms.internal.firebase-auth-api.zzu.zza(p1));
        return;
    }

    public final String toString()
    {
        return this.zza.toString();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzm zza(CharSequence p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzn(this.zza.matcher(p3));
    }
}
