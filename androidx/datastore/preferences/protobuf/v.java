package androidx.datastore.preferences.protobuf;
public abstract class v extends androidx.datastore.preferences.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = 2147483647;
    private static final int MUTABLE_FLAG_MASK = 2147483648;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = 2147483647;
    private static java.util.Map defaultInstanceMap;
    private int memoizedSerializedSize;
    protected androidx.datastore.preferences.protobuf.b1 unknownFields;

    static v()
    {
        androidx.datastore.preferences.protobuf.v.defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public v()
    {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = androidx.datastore.preferences.protobuf.b1.f;
        return;
    }

    public static androidx.datastore.preferences.protobuf.v d(Class p3)
    {
        androidx.datastore.preferences.protobuf.v v0_3 = ((androidx.datastore.preferences.protobuf.v) androidx.datastore.preferences.protobuf.v.defaultInstanceMap.get(p3));
        if (v0_3 == null) {
            try {
                Class.forName(p3.getName(), 1, p3.getClassLoader());
                v0_3 = ((androidx.datastore.preferences.protobuf.v) androidx.datastore.preferences.protobuf.v.defaultInstanceMap.get(p3));
            } catch (IllegalStateException v3_1) {
                throw new IllegalStateException("Class initialization cannot fail.", v3_1);
            }
        }
        if (v0_3 != null) {
            return v0_3;
        } else {
            androidx.datastore.preferences.protobuf.v v0_10 = ((androidx.datastore.preferences.protobuf.v) ((androidx.datastore.preferences.protobuf.v) androidx.datastore.preferences.protobuf.h1.d(p3)).c(6));
            if (v0_10 == null) {
                throw new IllegalStateException();
            } else {
                androidx.datastore.preferences.protobuf.v.defaultInstanceMap.put(p3, v0_10);
                return v0_10;
            }
        }
    }

    public static varargs Object e(reflect.Method p0, androidx.datastore.preferences.protobuf.v p1, Object[] p2)
    {
        try {
            return p0.invoke(p1, p2);
        } catch (Error v0_3) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", v0_3);
        } catch (Error v0_4) {
            Error v0_5 = v0_4.getCause();
            if ((v0_5 instanceof RuntimeException)) {
                throw ((RuntimeException) v0_5);
            } else {
                if (!(v0_5 instanceof Error)) {
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", v0_5);
                } else {
                    throw ((Error) v0_5);
                }
            }
        }
    }

    public static final boolean f(androidx.datastore.preferences.protobuf.v p2, boolean p3)
    {
        Class v1_3 = ((Byte) p2.c(1)).byteValue();
        if (v1_3 != 1) {
            if (v1_3 != null) {
                boolean v0_3 = androidx.datastore.preferences.protobuf.r0.c;
                v0_3.getClass();
                boolean v0_2 = v0_3.a(p2.getClass()).f(p2);
                if (p3 != 0) {
                    p2.c(2);
                }
                return v0_2;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public static void j(Class p1, androidx.datastore.preferences.protobuf.v p2)
    {
        p2.h();
        androidx.datastore.preferences.protobuf.v.defaultInstanceMap.put(p1, p2);
        return;
    }

    public final int a(androidx.datastore.preferences.protobuf.u0 p4)
    {
        if (!this.g()) {
            IllegalStateException v0_3 = this.memoizedSerializedSize;
            if ((v0_3 & 2147483647) == 2147483647) {
                String v4_3;
                if (p4 != null) {
                    v4_3 = p4.h(this);
                } else {
                    String v4_1 = androidx.datastore.preferences.protobuf.r0.c;
                    v4_1.getClass();
                    v4_3 = v4_1.a(this.getClass()).h(this);
                }
                this.k(v4_3);
                return v4_3;
            } else {
                return (v0_3 & 2147483647);
            }
        } else {
            String v4_5;
            if (p4 != null) {
                v4_5 = p4.h(this);
            } else {
                String v4_6 = androidx.datastore.preferences.protobuf.r0.c;
                v4_6.getClass();
                v4_5 = v4_6.a(this.getClass()).h(this);
            }
            if (v4_5 < null) {
                throw new IllegalStateException(g2.g.c(v4_5, "serialized size must be non-negative, was "));
            } else {
                return v4_5;
            }
        }
    }

    public final void b(androidx.datastore.preferences.protobuf.l p3)
    {
        androidx.datastore.preferences.protobuf.u0 v0_0 = androidx.datastore.preferences.protobuf.r0.c;
        v0_0.getClass();
        androidx.datastore.preferences.protobuf.u0 v0_1 = v0_0.a(this.getClass());
        androidx.datastore.preferences.protobuf.e0 v1_1 = p3.c;
        if (v1_1 == null) {
            v1_1 = new androidx.datastore.preferences.protobuf.e0(p3);
        }
        v0_1.c(this, v1_1);
        return;
    }

    public abstract Object c();

    public final boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3) && (this.getClass() == p3.getClass())) {
                androidx.datastore.preferences.protobuf.u0 v0_2 = androidx.datastore.preferences.protobuf.r0.c;
                v0_2.getClass();
                return v0_2.a(this.getClass()).g(this, ((androidx.datastore.preferences.protobuf.v) p3));
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final boolean g()
    {
        if ((this.memoizedSerializedSize & -2147483648) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void h()
    {
        this.memoizedSerializedSize = (this.memoizedSerializedSize & 2147483647);
        return;
    }

    public final int hashCode()
    {
        if (!this.g()) {
            if (this.memoizedHashCode == 0) {
                int v0_8 = androidx.datastore.preferences.protobuf.r0.c;
                v0_8.getClass();
                this.memoizedHashCode = v0_8.a(this.getClass()).d(this);
            }
            return this.memoizedHashCode;
        } else {
            int v0_4 = androidx.datastore.preferences.protobuf.r0.c;
            v0_4.getClass();
            return v0_4.a(this.getClass()).d(this);
        }
    }

    public final androidx.datastore.preferences.protobuf.v i()
    {
        return ((androidx.datastore.preferences.protobuf.v) this.c(4));
    }

    public final void k(int p3)
    {
        if (p3 < null) {
            throw new IllegalStateException(g2.g.c(p3, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = ((p3 & 2147483647) | (this.memoizedSerializedSize & -2147483648));
            return;
        }
    }

    public final String toString()
    {
        String v0_0 = super.toString();
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("# ");
        v1_1.append(v0_0);
        androidx.datastore.preferences.protobuf.l0.c(this, v1_1, 0);
        return v1_1.toString();
    }
}
