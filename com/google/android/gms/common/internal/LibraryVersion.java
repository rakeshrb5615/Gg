package com.google.android.gms.common.internal;
public class LibraryVersion {
    private static final com.google.android.gms.common.internal.GmsLogger zza;
    private static final com.google.android.gms.common.internal.LibraryVersion zzb;
    private final java.util.concurrent.ConcurrentHashMap zzc;

    static LibraryVersion()
    {
        com.google.android.gms.common.internal.LibraryVersion.zza = new com.google.android.gms.common.internal.GmsLogger("LibraryVersion", "");
        com.google.android.gms.common.internal.LibraryVersion.zzb = new com.google.android.gms.common.internal.LibraryVersion();
        return;
    }

    public LibraryVersion()
    {
        this.zzc = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public static com.google.android.gms.common.internal.LibraryVersion getInstance()
    {
        return com.google.android.gms.common.internal.LibraryVersion.zzb;
    }

    public String getVersion(String p10)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10, "Please provide a valid libraryName");
        com.google.android.gms.common.internal.GmsLogger v4_7 = this.zzc;
        if (!v4_7.containsKey(p10)) {
            com.google.android.gms.common.internal.GmsLogger v4_1 = new java.util.Properties();
            String v5_0 = 0;
            try {
                int v6_1 = new StringBuilder("/");
                v6_1.append(p10);
                v6_1.append(".properties");
                com.google.android.gms.common.internal.GmsLogger v1_3 = com.google.android.gms.common.internal.LibraryVersion.getResourceAsStream(v6_1.toString());
            } catch (com.google.android.gms.common.internal.GmsLogger v1_4) {
                String v2_1 = v1_4;
                v1_3 = 0;
                StringBuilder v7_5 = new StringBuilder((String.valueOf(p10).length() + 43));
                v7_5.append("Failed to get app version for libraryName: ");
                v7_5.append(p10);
                com.google.android.gms.common.internal.LibraryVersion.zza.e("LibraryVersion", v7_5.toString(), v2_1);
                String v8_1 = v5_0;
                v5_0 = v1_3;
                v1_3 = v8_1;
                if (v1_3 != null) {
                    com.google.android.gms.common.util.IOUtils.closeQuietly(v1_3);
                }
                if (v5_0 == null) {
                    com.google.android.gms.common.internal.LibraryVersion.zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                    v5_0 = "UNKNOWN";
                }
                this.zzc.put(p10, v5_0);
                return v5_0;
            } catch (Throwable v10_0) {
                if (v5_0 != null) {
                    com.google.android.gms.common.util.IOUtils.closeQuietly(v5_0);
                }
                throw p10;
            }
            if (v1_3 == null) {
                int v6_4 = new StringBuilder((String.valueOf(p10).length() + 43));
                v6_4.append("Failed to get app version for libraryName: ");
                v6_4.append(p10);
                com.google.android.gms.common.internal.LibraryVersion.zza.w("LibraryVersion", v6_4.toString());
            } else {
                v4_1.load(v1_3);
                v5_0 = v4_1.getProperty("version", 0);
                StringBuilder v7_3 = new StringBuilder(((String.valueOf(p10).length() + 12) + String.valueOf(v5_0).length()));
                v7_3.append(p10);
                v7_3.append(" version is ");
                v7_3.append(v5_0);
                com.google.android.gms.common.internal.LibraryVersion.zza.v("LibraryVersion", v7_3.toString());
            }
        } else {
            return ((String) v4_7.get(p10));
        }
    }
}
