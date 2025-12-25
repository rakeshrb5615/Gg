package com.google.android.gms.dynamite;
final class zzk implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy {

    public zzk()
    {
        return;
    }

    public final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult selectModule(android.content.Context p5, String p6, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions p7)
    {
        int v5_1;
        com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult v0_1 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult();
        int v1 = p7.zzb(p5, p6);
        v0_1.localVersion = v1;
        int v2 = 1;
        int v3 = 0;
        if (v1 == 0) {
            v5_1 = p7.zza(p5, p6, 1);
            v0_1.remoteVersion = v5_1;
        } else {
            v5_1 = p7.zza(p5, p6, 0);
            v0_1.remoteVersion = v5_1;
        }
        int v6_1 = v0_1.localVersion;
        if (v6_1 != 0) {
            v3 = v6_1;
            if (v3 >= v5_1) {
                v2 = -1;
            }
        } else {
            if (v5_1 != 0) {
            } else {
                v2 = 0;
            }
        }
        v0_1.selection = v2;
        return v0_1;
    }
}
