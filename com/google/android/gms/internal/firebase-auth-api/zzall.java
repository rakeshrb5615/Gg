package com.google.android.gms.internal.firebase-auth-api;
public class zzall extends java.io.IOException {
    private boolean zza;

    public zzall(java.io.IOException p2)
    {
        super(p2.getMessage(), p2);
        return;
    }

    public zzall(String p1)
    {
        super(p1);
        return;
    }

    public zzall(String p1, java.io.IOException p2)
    {
        super(p1, p2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzalo zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzalo("Protocol message tag had invalid wire type.");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzb()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("Protocol message end-group tag did not match expected tag.");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzc()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("Protocol message contained an invalid tag (zero).");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzd()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("Protocol message had invalid UTF-8.");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zze()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("CodedInputStream encountered a malformed varint.");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzf()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzg()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("Failed to parse the message.");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzh()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzi()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzall zzj()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzall("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void zzk()
    {
        this.zza = 1;
        return;
    }

    public final boolean zzl()
    {
        return this.zza;
    }
}
