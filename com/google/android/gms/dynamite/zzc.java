package com.google.android.gms.dynamite;
final class zzc implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy {

    public zzc()
    {
        return;
    }

    public final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult selectModule(android.content.Context p2, String p3, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions p4)
    {
        int v2_2;
        com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult v0_1 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult();
        int v2_1 = p4.zzb(p2, p3);
        v0_1.localVersion = v2_1;
        if (v2_1 == 0) {
            v2_2 = 0;
        } else {
            v2_2 = -1;
        }
        v0_1.selection = v2_2;
        return v0_1;
    }
}
