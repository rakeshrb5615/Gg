package com.google.android.gms.dynamite;
final class zzg implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy {

    public zzg()
    {
        return;
    }

    public final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult selectModule(android.content.Context p4, String p5, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions p6)
    {
        com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult v0_1 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult();
        int v2 = p6.zza(p4, p5, 1);
        v0_1.remoteVersion = v2;
        if (v2 == 0) {
            int v4_2 = p6.zzb(p4, p5);
            v0_1.localVersion = v4_2;
            if (v4_2 != 0) {
                v0_1.selection = -1;
            }
            return v0_1;
        } else {
            v0_1.selection = 1;
            return v0_1;
        }
    }
}
