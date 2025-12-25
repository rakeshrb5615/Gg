package com.google.android.gms.dynamic;
public final class ObjectWrapper extends com.google.android.gms.dynamic.IObjectWrapper$Stub {
    private final Object zza;

    private ObjectWrapper(Object p1)
    {
        this.zza = p1;
        return;
    }

    public static Object unwrap(com.google.android.gms.dynamic.IObjectWrapper p7)
    {
        if (!(p7 instanceof com.google.android.gms.dynamic.ObjectWrapper)) {
            IllegalAccessException v7_3 = p7.asBinder();
            IllegalArgumentException v0_10 = v7_3.getClass().getDeclaredFields();
            StringBuilder v2_2 = 0;
            reflect.Field v4 = 0;
            int v3_1 = 0;
            while (v2_2 < v0_10.length) {
                reflect.Field v5 = v0_10[v2_2];
                if (!v5.isSynthetic()) {
                    v3_1++;
                    v4 = v5;
                }
                v2_2++;
            }
            if (v3_1 != 1) {
                IllegalArgumentException v0_1 = v0_10.length;
                throw new IllegalArgumentException(v1.a.m(new StringBuilder((String.valueOf(v0_1).length() + 53)), "Unexpected number of IObjectWrapper declared fields: ", v0_1));
            } else {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v4);
                if (v4.isAccessible()) {
                    throw new IllegalArgumentException("IObjectWrapper declared field not private!");
                } else {
                    v4.setAccessible(1);
                    try {
                        return v4.get(v7_3);
                    } catch (IllegalAccessException v7_8) {
                        throw new IllegalArgumentException("Binder object is null.", v7_8);
                    } catch (IllegalAccessException v7_7) {
                        throw new IllegalArgumentException("Could not access the field in remoteBinder.", v7_7);
                    }
                }
            }
        } else {
            return ((com.google.android.gms.dynamic.ObjectWrapper) p7).zza;
        }
    }

    public static com.google.android.gms.dynamic.IObjectWrapper wrap(Object p1)
    {
        return new com.google.android.gms.dynamic.ObjectWrapper(p1);
    }
}
