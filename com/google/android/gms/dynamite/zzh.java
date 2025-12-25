package com.google.android.gms.dynamite;
final class zzh implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy {

    public zzh()
    {
        return;
    }

    public final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult selectModule(android.content.Context p3, String p4, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions p5)
    {
        com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult v0_1 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult();
        int v1_0 = p5.zzb(p3, p4);
        v0_1.localVersion = v1_0;
        if (v1_0 == 0) {
            int v3_2 = p5.zza(p3, p4, 1);
            v0_1.remoteVersion = v3_2;
            if (v3_2 != 0) {
                v0_1.selection = 1;
            }
            return v0_1;
        } else {
            v0_1.selection = -1;
            return v0_1;
        }
    }
}
