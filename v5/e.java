package v5;
public final class e implements t5.e, t5.g {
    public final boolean a;
    public final android.util.JsonWriter b;
    public final java.util.Map c;
    public final java.util.Map d;
    public final t5.d e;
    public final boolean f;

    public e(java.io.Writer p2, java.util.HashMap p3, java.util.HashMap p4, v5.a p5, boolean p6)
    {
        this.a = 1;
        this.b = new android.util.JsonWriter(p2);
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        return;
    }

    public final t5.e a(t5.c p2, boolean p3)
    {
        String v2_1 = p2.a;
        this.j();
        android.util.JsonWriter v0 = this.b;
        v0.name(v2_1);
        this.j();
        v0.value(p3);
        return this;
    }

    public final t5.e b(t5.c p2, double p3)
    {
        String v2_1 = p2.a;
        this.j();
        android.util.JsonWriter v0 = this.b;
        v0.name(v2_1);
        this.j();
        v0.value(p3);
        return this;
    }

    public final t5.e c(t5.c p2, long p3)
    {
        String v2_1 = p2.a;
        this.j();
        android.util.JsonWriter v0 = this.b;
        v0.name(v2_1);
        this.j();
        v0.value(p3);
        return this;
    }

    public final t5.e d(t5.c p2, int p3)
    {
        long v2_1 = p2.a;
        this.j();
        android.util.JsonWriter v0 = this.b;
        v0.name(v2_1);
        this.j();
        v0.value(((long) p3));
        return this;
    }

    public final t5.g e(String p2)
    {
        this.j();
        this.b.value(p2);
        return this;
    }

    public final t5.e f(t5.c p1, Object p2)
    {
        this.i(p2, p1.a);
        return this;
    }

    public final t5.g g(boolean p2)
    {
        this.j();
        this.b.value(p2);
        return this;
    }

    public final v5.e h(Object p6)
    {
        t5.b v0_0 = this.b;
        if (p6 != null) {
            if (!(p6 instanceof Number)) {
                if (!p6.getClass().isArray()) {
                    if (!(p6 instanceof java.util.Collection)) {
                        if (!(p6 instanceof java.util.Map)) {
                            long v1_15 = ((t5.d) this.c.get(p6.getClass()));
                            if (v1_15 == 0) {
                                long v1_19 = ((t5.f) this.d.get(p6.getClass()));
                                if (v1_19 == 0) {
                                    if (!(p6 instanceof Enum)) {
                                        v0_0.beginObject();
                                        this.e.a(p6, this);
                                        v0_0.endObject();
                                        return this;
                                    } else {
                                        if (!(p6 instanceof v5.f)) {
                                            String v6_11 = ((Enum) p6).name();
                                            this.j();
                                            v0_0.value(v6_11);
                                            return this;
                                        } else {
                                            String v6_13 = ((v5.f) p6).a();
                                            this.j();
                                            v0_0.value(((long) v6_13));
                                            return this;
                                        }
                                    }
                                } else {
                                    v1_19.a(p6, this);
                                    return this;
                                }
                            } else {
                                v0_0.beginObject();
                                v1_15.a(p6, this);
                                v0_0.endObject();
                                return this;
                            }
                        } else {
                            v0_0.beginObject();
                            String v6_16 = ((java.util.Map) p6).entrySet().iterator();
                            while (v6_16.hasNext()) {
                                long v1_27 = ((java.util.Map$Entry) v6_16.next());
                                int v2_3 = v1_27.getKey();
                                try {
                                    this.i(v1_27.getValue(), ((String) v2_3));
                                } catch (String v6_17) {
                                    throw new t5.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[] {v2_3, v2_3.getClass()})), v6_17);
                                }
                            }
                            v0_0.endObject();
                            return this;
                        }
                    } else {
                        v0_0.beginArray();
                        String v6_19 = ((java.util.Collection) p6).iterator();
                        while (v6_19.hasNext()) {
                            this.h(v6_19.next());
                        }
                        v0_0.endArray();
                        return this;
                    }
                } else {
                    if (!(p6 instanceof byte[])) {
                        v0_0.beginArray();
                        int v2_0 = 0;
                        if (!(p6 instanceof int[])) {
                            if (!(p6 instanceof long[])) {
                                if (!(p6 instanceof double[])) {
                                    if (!(p6 instanceof boolean[])) {
                                        if (!(p6 instanceof Number[])) {
                                            long v1_6 = ((Object[]) p6).length;
                                            while (v2_0 < v1_6) {
                                                this.h(((Object[]) p6)[v2_0]);
                                                v2_0++;
                                            }
                                        } else {
                                            long v1_7 = ((Number[]) p6).length;
                                            while (v2_0 < v1_7) {
                                                this.h(((Number[]) p6)[v2_0]);
                                                v2_0++;
                                            }
                                        }
                                    } else {
                                        long v1_8 = ((boolean[]) p6).length;
                                        while (v2_0 < v1_8) {
                                            v0_0.value(((boolean[]) p6)[v2_0]);
                                            v2_0++;
                                        }
                                    }
                                } else {
                                    long v1_10 = ((double[]) p6).length;
                                    while (v2_0 < v1_10) {
                                        v0_0.value(((double[]) p6)[v2_0]);
                                        v2_0++;
                                    }
                                }
                            } else {
                                long v1_11 = ((long[]) p6).length;
                                while (v2_0 < v1_11) {
                                    String v3_4 = ((long[]) p6)[v2_0];
                                    this.j();
                                    v0_0.value(v3_4);
                                    v2_0++;
                                }
                            }
                        } else {
                            long v1_12 = ((int[]) p6).length;
                            while (v2_0 < v1_12) {
                                v0_0.value(((long) ((int[]) p6)[v2_0]));
                                v2_0++;
                            }
                        }
                        v0_0.endArray();
                        return this;
                    } else {
                        this.j();
                        v0_0.value(android.util.Base64.encodeToString(((byte[]) p6), 2));
                        return this;
                    }
                }
            } else {
                v0_0.value(((Number) p6));
                return this;
            }
        } else {
            v0_0.nullValue();
            return this;
        }
    }

    public final v5.e i(Object p3, String p4)
    {
        android.util.JsonWriter v1 = this.b;
        if (!this.f) {
            this.j();
            v1.name(p4);
            if (p3 != null) {
                this.h(p3);
                return this;
            } else {
                v1.nullValue();
                return this;
            }
        } else {
            if (p3 != null) {
                this.j();
                v1.name(p4);
                this.h(p3);
                return this;
            } else {
                return this;
            }
        }
    }

    public final void j()
    {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        } else {
            return;
        }
    }
}
