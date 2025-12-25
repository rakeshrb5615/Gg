package c7;
public abstract class e {
    public static final boolean a;
    public static final c7.a$a b;
    public static final c7.b$a c;
    public static final c7.c d;

    static e()
    {
        try {
            Class.forName("java.sql.Date");
            int v0_4 = 1;
        } catch (ClassNotFoundException) {
            v0_4 = 0;
        }
        c7.e.a = v0_4;
        if (v0_4 == 0) {
            c7.e.b = 0;
            c7.e.c = 0;
            c7.e.d = 0;
        } else {
            c7.e.b = c7.a.b;
            c7.e.c = c7.b.b;
            c7.e.d = c7.d.b;
        }
        return;
    }
}
