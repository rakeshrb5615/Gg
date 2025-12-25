package com.google.android.recaptcha.internal;
public final class zzgc {

    public static final Class zza(Object p6)
    {
        if (!(p6 instanceof Class)) {
            if (!(p6 instanceof Integer)) {
                if (!(p6 instanceof String)) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    try {
                        int v0_1 = Class.forName(((String) p6));
                        com.google.android.recaptcha.internal.zzfu v1_3 = ((com.google.android.recaptcha.internal.zzfu) a.a.F(com.google.android.recaptcha.internal.zzgb.zza).getValue());
                    } catch (int v6_5) {
                        throw new com.google.android.recaptcha.internal.zzce(6, v1_3, v6_5);
                    }
                    if (!v1_3.zzb(((String) p6))) {
                        throw new com.google.android.recaptcha.internal.zzce(6, 47, 0);
                    } else {
                        return v0_1;
                    }
                }
            } else {
                int v6_10;
                int v6_9 = ((Number) p6).intValue();
                if (v6_9 != 1) {
                    if (v6_9 != 2) {
                        if (v6_9 != 3) {
                            if (v6_9 != 4) {
                                if (v6_9 != 5) {
                                    if (v6_9 != 6) {
                                        if (v6_9 != 7) {
                                            if (v6_9 != 8) {
                                                v6_10 = 0;
                                            } else {
                                                v6_10 = Boolean.TYPE;
                                            }
                                        } else {
                                            v6_10 = Double.TYPE;
                                        }
                                    } else {
                                        v6_10 = Float.TYPE;
                                    }
                                } else {
                                    v6_10 = Character.TYPE;
                                }
                            } else {
                                v6_10 = Long.TYPE;
                            }
                        } else {
                            v6_10 = Byte.TYPE;
                        }
                    } else {
                        v6_10 = Short.TYPE;
                    }
                } else {
                    v6_10 = Integer.TYPE;
                }
                if (v6_10 == 0) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 6, 0);
                } else {
                    return v6_10;
                }
            }
        } else {
            return ((Class) p6);
        }
    }
}
