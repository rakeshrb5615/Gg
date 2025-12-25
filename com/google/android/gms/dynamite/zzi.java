package com.google.android.gms.dynamite;
final class zzi implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy {

    public zzi()
    {
        return;
    }

    public final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult selectModule(android.content.Context p3, String p4, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions p5)
    {
        com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult v0_1 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult();
        int v1 = 0;
        int v3_1 = p5.zza(p3, p4, 0);
        v0_1.remoteVersion = v3_1;
        if (v3_1 != 0) {
            v1 = 1;
        }
        v0_1.selection = v1;
        return v0_1;
    }
}
