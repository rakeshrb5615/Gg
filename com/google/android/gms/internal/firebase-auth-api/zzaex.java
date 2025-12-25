package com.google.android.gms.internal.firebase-auth-api;
public class zzaex {

    private zzaex()
    {
        return;
    }

    public static Object zza(String p3, reflect.Type p4)
    {
        if (p4 != String) {
            if (p4 != Void) {
                try {
                    try {
                        return ((com.google.android.gms.internal.firebase-auth-api.zzaez) ((Class) p4).getConstructor(0).newInstance(0)).zza(p3);
                    } catch (Exception v3_3) {
                        throw new com.google.android.gms.internal.firebase-auth-api.zzacn(g2.g.l("Json conversion failed! ", v3_3.getMessage()), v3_3);
                    }
                } catch (Exception v3_1) {
                    throw new com.google.android.gms.internal.firebase-auth-api.zzacn("Instantiation of JsonResponse failed! ".concat(String.valueOf(p4)), v3_1);
                }
                return ((com.google.android.gms.internal.firebase-auth-api.zzaez) ((Class) p4).getConstructor(0).newInstance(0)).zza(p3);
            } else {
                return 0;
            }
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzacn v4_8 = ((com.google.android.gms.internal.firebase-auth-api.zzagt) new com.google.android.gms.internal.firebase-auth-api.zzagt().zza(p3));
            if (!v4_8.zzb()) {
                String v0_10 = new StringBuilder("No error message: ");
                v0_10.append(p3);
                throw new com.google.android.gms.internal.firebase-auth-api.zzacn(v0_10.toString());
            } else {
                return v4_8.zza();
            }
        }
    }
}
