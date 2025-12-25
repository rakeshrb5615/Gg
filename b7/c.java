package b7;
public abstract class c {
    public static final q4.b a;

    static c()
    {
        try {
            b7.a v0_1 = new b7.b();
        } catch (ReflectiveOperationException) {
            v0_1 = new b7.a(3);
        }
        b7.c.a = v0_1;
        return;
    }

    public static void a(reflect.AccessibleObject p2, StringBuilder p3)
    {
        int v2_3;
        p3.append(40);
        if (!(p2 instanceof reflect.Method)) {
            v2_3 = ((reflect.Constructor) p2).getParameterTypes();
        } else {
            v2_3 = ((reflect.Method) p2).getParameterTypes();
        }
        int v0_1 = 0;
        while (v0_1 < v2_3.length) {
            if (v0_1 > 0) {
                p3.append(", ");
            }
            p3.append(v2_3[v0_1].getSimpleName());
            v0_1++;
        }
        p3.append(41);
        return;
    }

    public static String b(reflect.Constructor p2)
    {
        StringBuilder v0_1 = new StringBuilder(p2.getDeclaringClass().getName());
        b7.c.a(p2, v0_1);
        return v0_1.toString();
    }

    public static String c(reflect.Field p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p2.getDeclaringClass().getName());
        v0_1.append("#");
        v0_1.append(p2.getName());
        return v0_1.toString();
    }

    public static String d(reflect.AccessibleObject p4, boolean p5)
    {
        String v4_2;
        if (!(p4 instanceof reflect.Field)) {
            if (!(p4 instanceof reflect.Method)) {
                if (!(p4 instanceof reflect.Constructor)) {
                    StringBuilder v0_15 = new StringBuilder("<unknown AccessibleObject> ");
                    v0_15.append(p4.toString());
                    v4_2 = v0_15.toString();
                } else {
                    StringBuilder v0_2 = new StringBuilder("constructor \'");
                    v0_2.append(b7.c.b(((reflect.Constructor) p4)));
                    v0_2.append("\'");
                    v4_2 = v0_2.toString();
                }
            } else {
                StringBuilder v0_4 = new StringBuilder(((reflect.Method) p4).getName());
                b7.c.a(((reflect.Method) p4), v0_4);
                StringBuilder v0_6 = v0_4.toString();
                String v2_3 = new StringBuilder("method \'");
                v2_3.append(((reflect.Method) p4).getDeclaringClass().getName());
                v2_3.append("#");
                v2_3.append(v0_6);
                v2_3.append("\'");
                v4_2 = v2_3.toString();
            }
        } else {
            StringBuilder v0_8 = new StringBuilder("field \'");
            v0_8.append(b7.c.c(((reflect.Field) p4)));
            v0_8.append("\'");
            v4_2 = v0_8.toString();
        }
        if ((p5 != 0) && (Character.isLowerCase(v4_2.charAt(0)))) {
            StringBuilder v0_13 = new StringBuilder();
            v0_13.append(Character.toUpperCase(v4_2.charAt(0)));
            v0_13.append(v4_2.substring(1));
            v4_2 = v0_13.toString();
        }
        return v4_2;
    }

    public static String e(Exception p2)
    {
        if (!p2.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        } else {
            String v2_3;
            String v2_1 = p2.getMessage();
            if ((v2_1 == null) || (!v2_1.contains("to module com.google.gson"))) {
                v2_3 = "reflection-inaccessible";
            } else {
                v2_3 = "reflection-inaccessible-to-module-gson";
            }
            StringBuilder v0_3 = new StringBuilder("\nSee ");
            v0_3.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(v2_3));
            return v0_3.toString();
        }
    }

    public static void f(reflect.AccessibleObject p4)
    {
        try {
            p4.setAccessible(1);
            return;
        } catch (Exception v0_1) {
            String v4_1 = v1.a.q("Failed making ", b7.c.d(p4, 0), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            v4_1.append(b7.c.e(v0_1));
            throw new w6.p(v4_1.toString(), v0_1);
        }
    }
}
