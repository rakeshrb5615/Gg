package i8;
public abstract class n {
    public static final e8.c a;

    static n()
    {
        String v1_0 = 0;
        try {
            IllegalStateException v0_9 = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException) {
            v0_9 = 0;
        }
        if (v0_9 != null) {
            Boolean.parseBoolean(v0_9);
        }
        try {
            IllegalStateException v0_3 = java.util.Arrays.asList(new e8.a[] {new e8.a()})).iterator();
            kotlin.jvm.internal.j.e(v0_3, "<this>");
            IllegalStateException v0_7 = a8.h.X(new a8.a(new a8.i(v0_3, 1))).iterator();
        } catch (IllegalStateException v0_8) {
            throw new java.util.ServiceConfigurationError(v0_8.getMessage(), v0_8);
        }
        if (v0_7.hasNext()) {
            v1_0 = v0_7.next();
            if (v0_7.hasNext()) {
                ((e8.a) v1_0).getClass();
                do {
                    ((e8.a) v0_7.next()).getClass();
                } while(v0_7.hasNext());
            }
        }
        if (((e8.a) v1_0) == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'");
        } else {
            IllegalStateException v0_12 = android.os.Looper.getMainLooper();
            if (v0_12 == null) {
                throw new IllegalStateException("The main looper is not available");
            } else {
                i8.n.a = new e8.c(e8.d.a(v0_12), 0);
                return;
            }
        }
    }
}
