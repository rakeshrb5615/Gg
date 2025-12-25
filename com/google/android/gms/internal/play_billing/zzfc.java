package com.google.android.gms.internal.play_billing;
public abstract class zzfc {

    public zzfc()
    {
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzeu zzb(Class p11)
    {
        IllegalStateException v0_22;
        java.util.ArrayList v2_0 = com.google.android.gms.internal.play_billing.zzfc.getClassLoader();
        if (!p11.equals(com.google.android.gms.internal.play_billing.zzeu)) {
            if (!p11.getPackage().equals(com.google.android.gms.internal.play_billing.zzfc.getPackage())) {
                throw new IllegalArgumentException(p11.getName());
            } else {
                IllegalStateException v0_18 = p11.getPackage().getName();
                String v3_1 = p11.getSimpleName();
                StringBuilder v4_1 = new StringBuilder();
                v4_1.append(v0_18);
                v4_1.append(".BlazeGenerated");
                v4_1.append(v3_1);
                v4_1.append("Loader");
                v0_22 = v4_1.toString();
            }
        } else {
            v0_22 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
        } catch (ClassNotFoundException) {
            Class[] v1_1 = java.util.ServiceLoader.load(com.google.android.gms.internal.play_billing.zzfc, v2_0).iterator();
            java.util.ArrayList v2_2 = new java.util.ArrayList();
        }
        return ((com.google.android.gms.internal.play_billing.zzeu) p11.cast(((com.google.android.gms.internal.play_billing.zzfc) Class.forName(v0_22, 1, v2_0).getConstructor(0).newInstance(0)).zza()));
    }

    public abstract com.google.android.gms.internal.play_billing.zzeu zza();
}
