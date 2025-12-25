package r;
public class i {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final s.b lock;
    private final s.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public i(int p1)
    {
        this.maxSize = p1;
        if (p1 <= 0) {
            s.a.c("maxSize <= 0");
            throw 0;
        } else {
            this.map = new s.c();
            this.lock = new s.b();
            return;
        }
    }

    public final int a(Object p3, Object p4)
    {
        StringBuilder v0_0 = this.sizeOf(p3, p4);
        if (v0_0 < null) {
            StringBuilder v0_2 = new StringBuilder("Negative size: ");
            v0_2.append(p3);
            v0_2.append(61);
            v0_2.append(p4);
            String v3_1 = v0_2.toString();
            kotlin.jvm.internal.j.e(v3_1, "message");
            throw new IllegalStateException(v3_1);
        } else {
            return v0_0;
        }
    }

    public Object create(Object p2)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        return 0;
    }

    public final int createCount()
    {
        try {
            return this.createCount;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public void entryRemoved(boolean p1, Object p2, Object p3, Object p4)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        kotlin.jvm.internal.j.e(p3, "oldValue");
        return;
    }

    public final void evictAll()
    {
        this.trimToSize(-1);
        return;
    }

    public final int evictionCount()
    {
        try {
            return this.evictionCount;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final Object get(Object p6)
    {
        kotlin.jvm.internal.j.e(p6, "key");
        try {
            int v1_1 = this.map;
            v1_1.getClass();
            int v1_4 = v1_1.a.get(p6);
        } catch (int v6_1) {
            throw v6_1;
        }
        if (v1_4 == 0) {
            this.missCount = (this.missCount + 1);
            Object v0_1 = this.create(p6);
            if (v0_1 != null) {
                this.createCount = (this.createCount + 1);
                Object v2_4 = this.map.a.put(p6, v0_1);
                if (v2_4 == null) {
                    this.size = (this.size + this.a(p6, v0_1));
                } else {
                    this.map.a.put(p6, v2_4);
                }
                if (v2_4 == null) {
                    this.trimToSize(this.maxSize);
                    return v0_1;
                } else {
                    this.entryRemoved(0, p6, v0_1, v2_4);
                    return v2_4;
                }
            } else {
                return 0;
            }
        } else {
            this.hitCount = (this.hitCount + 1);
            return v1_4;
        }
    }

    public final int hitCount()
    {
        try {
            return this.hitCount;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final int maxSize()
    {
        try {
            return this.maxSize;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final int missCount()
    {
        try {
            return this.missCount;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final Object put(Object p5, Object p6)
    {
        kotlin.jvm.internal.j.e(p5, "key");
        kotlin.jvm.internal.j.e(p6, "value");
        try {
            this.putCount = (this.putCount + 1);
            this.size = (this.size + this.a(p5, p6));
            Object v1_3 = this.map.a.put(p5, p6);
        } catch (int v5_1) {
            throw v5_1;
        }
        if (v1_3 != null) {
            this.size = (this.size - this.a(p5, v1_3));
        }
        if (v1_3 != null) {
            this.entryRemoved(0, p5, v1_3, p6);
        }
        this.trimToSize(this.maxSize);
        return v1_3;
    }

    public final int putCount()
    {
        try {
            return this.putCount;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public final Object remove(Object p5)
    {
        kotlin.jvm.internal.j.e(p5, "key");
        try {
            Object v1_0 = this.map;
            v1_0.getClass();
            Object v1_2 = v1_0.a.remove(p5);
        } catch (Throwable v5_1) {
            throw v5_1;
        }
        if (v1_2 != null) {
            this.size = (this.size - this.a(p5, v1_2));
        }
        if (v1_2 != null) {
            this.entryRemoved(0, p5, v1_2, 0);
        }
        return v1_2;
    }

    public void resize(int p2)
    {
        s.b v0;
        if (p2 <= null) {
            v0 = 0;
        } else {
            v0 = 1;
        }
        if (v0 == null) {
            s.a.c("maxSize <= 0");
            throw 0;
        } else {
            try {
                this.maxSize = p2;
                this.trimToSize(p2);
                return;
            } catch (Throwable v2_1) {
                throw v2_1;
            }
        }
    }

    public final int size()
    {
        try {
            return this.size;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public int sizeOf(Object p2, Object p3)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        kotlin.jvm.internal.j.e(p3, "value");
        return 1;
    }

    public final java.util.Map snapshot()
    {
        try {
            java.util.Iterator v2_6 = this.map.a.entrySet();
            kotlin.jvm.internal.j.d(v2_6, "<get-entries>(...)");
            Throwable v1_1 = new java.util.LinkedHashMap(v2_6.size());
            java.util.Iterator v2_2 = this.map.a.entrySet();
            kotlin.jvm.internal.j.d(v2_2, "<get-entries>(...)");
            java.util.Iterator v2_3 = v2_2.iterator();
        } catch (Throwable v1_2) {
            throw v1_2;
        }
        while (v2_3.hasNext()) {
            Object v3_3 = ((java.util.Map$Entry) v2_3.next());
            v1_1.put(v3_3.getKey(), v3_3.getValue());
        }
        return v1_1;
    }

    public String toString()
    {
        int v2_1;
        int v2_0 = this.hitCount;
        StringBuilder v3_3 = (this.missCount + v2_0);
        if (v3_3 == null) {
            v2_1 = 0;
        } else {
            v2_1 = ((v2_0 * 100) / v3_3);
        }
        StringBuilder v3_1 = new StringBuilder("LruCache[maxSize=");
        v3_1.append(this.maxSize);
        v3_1.append(",hits=");
        v3_1.append(this.hitCount);
        v3_1.append(",misses=");
        v3_1.append(this.missCount);
        v3_1.append(",hitRate=");
        v3_1.append(v2_1);
        v3_1.append("%]");
        return v3_1.toString();
    }

    public void trimToSize(int p7)
    {
        while (this.size >= 0) {
            if (this.map.a.isEmpty()) {
                if (this.size != 0) {
                    break;
                }
            }
            if (this.size > p7) {
                if (!this.map.a.isEmpty()) {
                    Object v1_12;
                    Object v1_9 = this.map.a.entrySet();
                    kotlin.jvm.internal.j.d(v1_9, "<get-entries>(...)");
                    if (!(v1_9 instanceof java.util.List)) {
                        Object v1_11 = v1_9.iterator();
                        if (v1_11.hasNext()) {
                            v1_12 = v1_11.next();
                        } else {
                            v1_12 = 0;
                        }
                    } else {
                        Object v1_13 = ((java.util.List) v1_9);
                        if (!v1_13.isEmpty()) {
                            v1_12 = v1_13.get(0);
                        }
                    }
                    Object v1_15 = ((java.util.Map$Entry) v1_12);
                    if (v1_15 != null) {
                        Object v2_5 = v1_15.getKey();
                        Object v1_16 = v1_15.getValue();
                        int v4_0 = this.map;
                        v4_0.getClass();
                        kotlin.jvm.internal.j.e(v2_5, "key");
                        v4_0.a.remove(v2_5);
                        this.size = (this.size - this.a(v2_5, v1_16));
                        this.evictionCount = (this.evictionCount + 1);
                        this.entryRemoved(1, v2_5, v1_16, 0);
                    } else {
                        return;
                    }
                } else {
                }
            }
            return;
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }
}
