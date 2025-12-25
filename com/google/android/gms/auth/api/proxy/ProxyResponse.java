package com.google.android.gms.auth.api.proxy;
public class ProxyResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int STATUS_CODE_NO_CONNECTION = 255;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final android.app.PendingIntent recoveryAction;
    public final int statusCode;
    final int zza;
    final android.os.Bundle zzb;

    static ProxyResponse()
    {
        com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR = new com.google.android.gms.auth.api.proxy.zzb();
        return;
    }

    public ProxyResponse(int p1, int p2, android.app.PendingIntent p3, int p4, android.os.Bundle p5, byte[] p6)
    {
        this.zza = p1;
        this.googlePlayServicesStatusCode = p2;
        this.statusCode = p4;
        this.zzb = p5;
        this.body = p6;
        this.recoveryAction = p3;
        return;
    }

    public ProxyResponse(int p8, android.app.PendingIntent p9, int p10, android.os.Bundle p11, byte[] p12)
    {
        this(1, p8, p9, p10, p11, p12);
        return;
    }

    public ProxyResponse(int p8, java.util.Map p9, byte[] p10)
    {
        this(1, 0, 0, p8, com.google.android.gms.auth.api.proxy.ProxyResponse.zza(p9), p10);
        return;
    }

    public static com.google.android.gms.auth.api.proxy.ProxyResponse createErrorProxyResponse(int p7, android.app.PendingIntent p8, int p9, java.util.Map p10, byte[] p11)
    {
        return new com.google.android.gms.auth.api.proxy.ProxyResponse(1, p7, p8, p9, com.google.android.gms.auth.api.proxy.ProxyResponse.zza(p10), p11);
    }

    private static android.os.Bundle zza(java.util.Map p3)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        if (p3 != null) {
            java.util.Iterator v3_2 = p3.entrySet().iterator();
            while (v3_2.hasNext()) {
                String v1_1 = ((java.util.Map$Entry) v3_2.next());
                v0_1.putString(((String) v1_1.getKey()), ((String) v1_1.getValue()));
            }
        }
        return v0_1;
    }

    public java.util.Map getHeaders()
    {
        if (this.zzb != null) {
            java.util.HashMap v0_3 = new java.util.HashMap();
            java.util.Iterator v1_2 = this.zzb.keySet().iterator();
            while (v1_2.hasNext()) {
                String v2_2 = ((String) v1_2.next());
                v0_3.put(v2_2, this.zzb.getString(v2_2));
            }
            return v0_3;
        } else {
            return java.util.Collections.EMPTY_MAP;
        }
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.googlePlayServicesStatusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.recoveryAction, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p5, 4, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p5, 5, this.body, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
