package com.google.android.recaptcha.internal;
public final class zzoc extends java.util.LinkedHashMap {
    private static final com.google.android.recaptcha.internal.zzoc zza;
    private boolean zzb;

    static zzoc()
    {
        com.google.android.recaptcha.internal.zzoc v0_1 = new com.google.android.recaptcha.internal.zzoc();
        com.google.android.recaptcha.internal.zzoc.zza = v0_1;
        v0_1.zzb = 0;
        return;
    }

    private zzoc()
    {
        this.zzb = 1;
        return;
    }

    private zzoc(java.util.Map p1)
    {
        super(p1);
        super.zzb = 1;
        return;
    }

    public static com.google.android.recaptcha.internal.zzoc zza()
    {
        return com.google.android.recaptcha.internal.zzoc.zza;
    }

    private static int zzf(Object p2)
    {
        if (!(p2 instanceof byte[])) {
            if ((p2 instanceof com.google.android.recaptcha.internal.zznf)) {
                throw new UnsupportedOperationException();
            } else {
                return p2.hashCode();
            }
        } else {
            UnsupportedOperationException v2_2 = com.google.android.recaptcha.internal.zznl.zzb(((byte[]) p2).length, ((byte[]) p2), 0, ((byte[]) p2).length);
            if (v2_2 == null) {
                v2_2 = 1;
            }
            return v2_2;
        }
    }

    private final void zzg()
    {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        this.zzg();
        super.clear();
        return;
    }

    public final java.util.Set entrySet()
    {
        if (!this.isEmpty()) {
            return super.entrySet();
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public final boolean equals(Object p5)
    {
        if ((p5 instanceof java.util.Map)) {
            if (this != ((java.util.Map) p5)) {
                if (this.size() == ((java.util.Map) p5).size()) {
                    java.util.Iterator v0_2 = this.entrySet().iterator();
                    while (v0_2.hasNext()) {
                        boolean v1_2 = ((java.util.Map$Entry) v0_2.next());
                        if (!((java.util.Map) p5).containsKey(v1_2.getKey())) {
                            return 0;
                        } else {
                            boolean v1_5;
                            byte[] v2_2 = v1_2.getValue();
                            boolean v1_4 = ((java.util.Map) p5).get(v1_2.getKey());
                            if ((!(v2_2 instanceof byte[])) || (!(v1_4 instanceof byte[]))) {
                                v1_5 = v2_2.equals(v1_4);
                            } else {
                                v1_5 = java.util.Arrays.equals(((byte[]) v2_2), ((byte[]) v1_4));
                            }
                            if (!v1_5) {
                                return 0;
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public final int hashCode()
    {
        java.util.Iterator v0_1 = this.entrySet().iterator();
        int v1 = 0;
        while (v0_1.hasNext()) {
            int v2_1 = ((java.util.Map$Entry) v0_1.next());
            v1 += (com.google.android.recaptcha.internal.zzoc.zzf(v2_1.getValue()) ^ com.google.android.recaptcha.internal.zzoc.zzf(v2_1.getKey()));
        }
        return v1;
    }

    public final Object put(Object p2, Object p3)
    {
        this.zzg();
        Class vtmp1 = p2.getClass();
        p3.getClass();
        return super.put(p2, p3);
    }

    public final void putAll(java.util.Map p4)
    {
        this.zzg();
        java.util.Iterator v0_1 = p4.keySet().iterator();
        while (v0_1.hasNext()) {
            Object v1_0 = v0_1.next();
            Class vtmp5 = v1_0.getClass();
            p4.get(v1_0).getClass();
        }
        super.putAll(p4);
        return;
    }

    public final Object remove(Object p1)
    {
        this.zzg();
        return super.remove(p1);
    }

    public final com.google.android.recaptcha.internal.zzoc zzb()
    {
        if (!this.isEmpty()) {
            return new com.google.android.recaptcha.internal.zzoc(this);
        } else {
            return new com.google.android.recaptcha.internal.zzoc();
        }
    }

    public final void zzc()
    {
        this.zzb = 0;
        return;
    }

    public final void zzd(com.google.android.recaptcha.internal.zzoc p2)
    {
        this.zzg();
        if (!p2.isEmpty()) {
            this.putAll(p2);
        }
        return;
    }

    public final boolean zze()
    {
        return this.zzb;
    }
}
