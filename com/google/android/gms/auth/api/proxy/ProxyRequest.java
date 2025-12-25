package com.google.android.gms.auth.api.proxy;
public class ProxyRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int HTTP_METHOD_DELETE = 0;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 0;
    public static final int HTTP_METHOD_OPTIONS = 0;
    public static final int HTTP_METHOD_PATCH = 0;
    public static final int HTTP_METHOD_POST = 0;
    public static final int HTTP_METHOD_PUT = 0;
    public static final int HTTP_METHOD_TRACE = 0;
    public static final int LAST_CODE = 0;
    public static final int VERSION_CODE = 2;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    final int zza;
    android.os.Bundle zzb;

    static ProxyRequest()
    {
        com.google.android.gms.auth.api.proxy.ProxyRequest.CREATOR = new com.google.android.gms.auth.api.proxy.zza();
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_GET = 0;
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_POST = 1;
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_PUT = 2;
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_DELETE = 3;
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_HEAD = 4;
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_OPTIONS = 5;
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_TRACE = 6;
        com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_PATCH = 7;
        com.google.android.gms.auth.api.proxy.ProxyRequest.LAST_CODE = 7;
        return;
    }

    public ProxyRequest(int p1, String p2, int p3, long p4, byte[] p6, android.os.Bundle p7)
    {
        this.zza = p1;
        this.url = p2;
        this.httpMethod = p3;
        this.timeoutMillis = p4;
        this.body = p6;
        this.zzb = p7;
        return;
    }

    public java.util.Map getHeaderMap()
    {
        java.util.Map v0_2 = new java.util.LinkedHashMap(this.zzb.size());
        java.util.Iterator v1_4 = this.zzb.keySet().iterator();
        while (v1_4.hasNext()) {
            String v2_2 = ((String) v1_4.next());
            String v3_1 = this.zzb.getString(v2_2);
            if (v3_1 == null) {
                v3_1 = "";
            }
            v0_2.put(v2_2, v3_1);
        }
        return java.util.Collections.unmodifiableMap(v0_2);
    }

    public String toString()
    {
        String v0_0 = this.url;
        int v1 = this.httpMethod;
        StringBuilder v2_1 = new StringBuilder("ProxyRequest[ url: ");
        v2_1.append(v0_0);
        v2_1.append(", method: ");
        v2_1.append(v1);
        v2_1.append(" ]");
        return v2_1.toString();
    }

    public void writeToParcel(android.os.Parcel p6, int p7)
    {
        p7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 1, this.url, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 2, this.httpMethod);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 3, this.timeoutMillis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p6, 4, this.body, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p6, 5, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, p7);
        return;
    }
}
