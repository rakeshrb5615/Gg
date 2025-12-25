package androidx.lifecycle;
public final class w0 extends androidx.lifecycle.y0 {
    public static androidx.lifecycle.w0 c;
    public static final a6.e d;
    public final android.app.Application b;

    static w0()
    {
        androidx.lifecycle.w0.d = new a6.e();
        return;
    }

    public w0(android.app.Application p1)
    {
        this.b = p1;
        return;
    }

    public final androidx.lifecycle.v0 a(Class p2)
    {
        String v0_0 = this.b;
        if (v0_0 == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        } else {
            return this.d(p2, v0_0);
        }
    }

    public final androidx.lifecycle.v0 b(Class p2, o1.c p3)
    {
        if (this.b == null) {
            String v3_5 = ((android.app.Application) p3.a.get(androidx.lifecycle.w0.d));
            if (v3_5 == null) {
                if (androidx.lifecycle.a.isAssignableFrom(p2)) {
                    throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
                } else {
                    return j5.t1.l(p2);
                }
            } else {
                return this.d(p2, v3_5);
            }
        } else {
            return this.a(p2);
        }
    }

    public final androidx.lifecycle.v0 d(Class p4, android.app.Application p5)
    {
        if (!androidx.lifecycle.a.isAssignableFrom(p4)) {
            return j5.t1.l(p4);
        } else {
            try {
                reflect.InvocationTargetException v5_3 = ((androidx.lifecycle.v0) p4.getConstructor(new Class[] {android.app.Application})).newInstance(new Object[] {p5})));
                kotlin.jvm.internal.j.b(v5_3);
                return v5_3;
            } catch (reflect.InvocationTargetException v5_7) {
                StringBuilder v2_7 = new StringBuilder("Cannot create an instance of ");
                v2_7.append(p4);
                throw new RuntimeException(v2_7.toString(), v5_7);
            } catch (reflect.InvocationTargetException v5_6) {
                StringBuilder v2_5 = new StringBuilder("Cannot create an instance of ");
                v2_5.append(p4);
                throw new RuntimeException(v2_5.toString(), v5_6);
            } catch (reflect.InvocationTargetException v5_5) {
                StringBuilder v2_3 = new StringBuilder("Cannot create an instance of ");
                v2_3.append(p4);
                throw new RuntimeException(v2_3.toString(), v5_5);
            } catch (reflect.InvocationTargetException v5_4) {
                StringBuilder v2_1 = new StringBuilder("Cannot create an instance of ");
                v2_1.append(p4);
                throw new RuntimeException(v2_1.toString(), v5_4);
            }
        }
    }
}
