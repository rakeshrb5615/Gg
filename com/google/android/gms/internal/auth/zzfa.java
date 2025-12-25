package com.google.android.gms.internal.auth;
public final class zzfa extends java.io.IOException {
    private com.google.android.gms.internal.auth.zzfw zza;

    public zzfa(java.io.IOException p2)
    {
        super(p2.getMessage(), p2);
        super.zza = 0;
        return;
    }

    public zzfa(String p1)
    {
        super(p1);
        super.zza = 0;
        return;
    }

    public static com.google.android.gms.internal.auth.zzfa zza()
    {
        return new com.google.android.gms.internal.auth.zzfa("Protocol message contained an invalid tag (zero).");
    }

    public static com.google.android.gms.internal.auth.zzfa zzb()
    {
        return new com.google.android.gms.internal.auth.zzfa("Protocol message had invalid UTF-8.");
    }

    public static com.google.android.gms.internal.auth.zzfa zzc()
    {
        return new com.google.android.gms.internal.auth.zzfa("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static com.google.android.gms.internal.auth.zzfa zzd()
    {
        return new com.google.android.gms.internal.auth.zzfa("Failed to parse the message.");
    }

    public static com.google.android.gms.internal.auth.zzfa zzf()
    {
        return new com.google.android.gms.internal.auth.zzfa("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final com.google.android.gms.internal.auth.zzfa zze(com.google.android.gms.internal.auth.zzfw p1)
    {
        this.zza = p1;
        return this;
    }
}
