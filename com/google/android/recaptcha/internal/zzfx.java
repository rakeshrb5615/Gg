package com.google.android.recaptcha.internal;
public abstract class zzfx implements java.lang.reflect.InvocationHandler {
    private final Object zza;

    public zzfx(Object p1)
    {
        this.zza = p1;
        return;
    }

    public final Object invoke(Object p3, reflect.Method p4, Object[] p5)
    {
        if ((!kotlin.jvm.internal.j.a(p4.getName(), "toString")) || (p4.getParameterTypes().length != 0)) {
            if ((!kotlin.jvm.internal.j.a(p4.getName(), "hashCode")) || (p4.getParameterTypes().length != 0)) {
                if ((kotlin.jvm.internal.j.a(p4.getName(), "equals")) && (p4.getParameterTypes().length != 0)) {
                    int v4_2 = 0;
                    if ((p5 != null) && (p5.length != 0)) {
                        Class v5_2;
                        Class v5_1 = p5[0];
                        if (v5_1 == null) {
                            v5_2 = 0;
                        } else {
                            v5_2 = v5_1.hashCode();
                        }
                        if (v5_2 == p3.hashCode()) {
                            v4_2 = 1;
                        }
                    }
                    return Boolean.valueOf(v4_2);
                } else {
                    Class v5_3 = h7.l.a;
                    if (this.zza(p3, p4, p5)) {
                        if ((this.zza != null) || (!kotlin.jvm.internal.j.a(p4.getReturnType(), Void.TYPE))) {
                            int v3_9 = this.zza;
                            if ((v3_9 == 0) || (!kotlin.jvm.internal.j.a(com.google.android.recaptcha.internal.zzkm.zza(v3_9.getClass()), com.google.android.recaptcha.internal.zzkm.zza(p4.getReturnType())))) {
                                int v3_13 = this.zza;
                                int v4_3 = p4.getReturnType();
                                StringBuilder v0_16 = new StringBuilder();
                                v0_16.append(v3_13);
                                v0_16.append(" cannot be returned from method with return type ");
                                v0_16.append(v4_3);
                                throw new IllegalArgumentException(v0_16.toString());
                            }
                        }
                        int v3_16 = this.zza;
                        if (v3_16 != 0) {
                            return v3_16;
                        } else {
                            return v5_3;
                        }
                    } else {
                        return v5_3;
                    }
                }
            } else {
                return Integer.valueOf(System.identityHashCode(p3));
            }
        } else {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(p3.hashCode())));
        }
    }

    public abstract boolean zza();
}
