package h2;
public abstract class a {
    public final r.e a;
    public final r.e b;
    public final r.e c;

    public a(r.e p1, r.e p2, r.e p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public abstract h2.b a();

    public final Class b(Class p5)
    {
        r.e v1 = this.c;
        Class v0_5 = ((Class) v1.get(p5.getName()));
        if (v0_5 == null) {
            Class v0_1 = p5.getPackage().getName();
            int v2_0 = p5.getSimpleName();
            ClassLoader v3_1 = new StringBuilder();
            v3_1.append(v0_1);
            v3_1.append(".");
            v3_1.append(v2_0);
            v3_1.append("Parcelizer");
            v0_5 = Class.forName(v3_1.toString(), 0, p5.getClassLoader());
            v1.put(p5.getName(), v0_5);
        }
        return v0_5;
    }

    public final reflect.Method c(String p5)
    {
        r.e v0 = this.a;
        reflect.Method v1_1 = ((reflect.Method) v0.get(p5));
        if (v1_1 == null) {
            System.currentTimeMillis();
            v1_1 = Class.forName(p5, 1, h2.a.getClassLoader()).getDeclaredMethod("read", new Class[] {h2.a}));
            v0.put(p5, v1_1);
        }
        return v1_1;
    }

    public final reflect.Method d(Class p5)
    {
        r.e v1 = this.b;
        reflect.Method v0_1 = ((reflect.Method) v1.get(p5.getName()));
        if (v0_1 == null) {
            reflect.Method v0_3 = this.b(p5);
            System.currentTimeMillis();
            v0_1 = v0_3.getDeclaredMethod("write", new Class[] {p5, h2.a}));
            v1.put(p5.getName(), v0_1);
        }
        return v0_1;
    }

    public abstract boolean e();

    public final android.os.Parcelable f(android.os.Parcelable p1, int p2)
    {
        if (this.e(p2)) {
            return ((h2.b) this).e.readParcelable(h2.b.getClassLoader());
        } else {
            return p1;
        }
    }

    public final h2.c g()
    {
        RuntimeException v0_11 = ((h2.b) this).e.readString();
        if (v0_11 != null) {
            try {
                return ((h2.c) this.c(v0_11).invoke(0, new Object[] {this.a()})));
            } catch (RuntimeException v0_12) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", v0_12);
            } catch (RuntimeException v0_8) {
                if (!(v0_8.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", v0_8);
                } else {
                    throw ((RuntimeException) v0_8.getCause());
                }
            } catch (RuntimeException v0_7) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", v0_7);
            } catch (RuntimeException v0_5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", v0_5);
            }
        } else {
            return 0;
        }
    }

    public abstract void h();

    public final void i(h2.c p4)
    {
        if (p4 != null) {
            try {
                ((h2.b) this).e.writeString(this.b(p4.getClass()).getName());
                String v1_0 = this.a();
                try {
                    this.d(p4.getClass()).invoke(0, new Object[] {p4, v1_0}));
                    RuntimeException v4_5 = v1_0.e;
                    RuntimeException v0_2 = v1_0.i;
                } catch (RuntimeException v4_11) {
                    throw new RuntimeException("VersionedParcel encountered IllegalAccessException", v4_11);
                } catch (RuntimeException v4_8) {
                    if (!(v4_8.getCause() instanceof RuntimeException)) {
                        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", v4_8);
                    } else {
                        throw ((RuntimeException) v4_8.getCause());
                    }
                } catch (RuntimeException v4_7) {
                    throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", v4_7);
                } catch (RuntimeException v4_6) {
                    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", v4_6);
                }
                if (v0_2 >= null) {
                    RuntimeException v0_13 = v1_0.d.get(v0_2);
                    String v1_10 = v4_5.dataPosition();
                    int v2_4 = (v1_10 - v0_13);
                    v4_5.setDataPosition(v0_13);
                    v4_5.writeInt(v2_4);
                    v4_5.setDataPosition(v1_10);
                }
                return;
            } catch (RuntimeException v0_1) {
                throw new RuntimeException(p4.getClass().getSimpleName().concat(" does not have a Parcelizer"), v0_1);
            }
        } else {
            ((h2.b) this).e.writeString(0);
            return;
        }
    }
}
