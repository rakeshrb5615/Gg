package com.google.android.gms.dynamite;
final class zzj implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy {

    public zzj()
    {
        return;
    }

    public final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult selectModule(android.content.Context p3, String p4, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions p5)
    {
        com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult v0_1 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult();
        v0_1.localVersion = p5.zzb(p3, p4);
        int v1_0 = 1;
        int v3_1 = p5.zza(p3, p4, 1);
        v0_1.remoteVersion = v3_1;
        int v4_1 = v0_1.localVersion;
        if (v4_1 != 0) {
            if (v4_1 >= v3_1) {
                v1_0 = -1;
            }
        } else {
            v4_1 = 0;
            if (v3_1 != 0) {
            } else {
                v1_0 = 0;
            }
        }
        v0_1.selection = v1_0;
        return v0_1;
    }
}
