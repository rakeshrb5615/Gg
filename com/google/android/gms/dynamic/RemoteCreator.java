package com.google.android.gms.dynamic;
public abstract class RemoteCreator {
    private final String zza;
    private Object zzb;

    public RemoteCreator(String p1)
    {
        this.zza = p1;
        return;
    }

    public abstract Object getRemoteCreator();

    public final Object getRemoteCreatorInstance(android.content.Context p3)
    {
        if (this.zzb == null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
            IllegalAccessException v3_10 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(p3);
            if (v3_10 == null) {
                throw new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException("Could not get remote context.");
            } else {
                try {
                    this.zzb = this.getRemoteCreator(((android.os.IBinder) v3_10.getClassLoader().loadClass(this.zza).newInstance()));
                } catch (IllegalAccessException v3_8) {
                    throw new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException("Could not load creator class.", v3_8);
                } catch (IllegalAccessException v3_7) {
                    throw new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException("Could not instantiate creator.", v3_7);
                } catch (IllegalAccessException v3_6) {
                    throw new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException("Could not access creator.", v3_6);
                }
            }
        }
        return this.zzb;
    }
}
