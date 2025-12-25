package n;
public abstract class l1 {
    public static final boolean a;
    public static final reflect.Method b;
    public static final reflect.Field c;
    public static final reflect.Field d;
    public static final reflect.Field e;
    public static final reflect.Field f;

    static l1()
    {
        try {
            reflect.Field v3_1;
            int v8_1;
            reflect.Field v3_2 = Class.forName("android.graphics.Insets");
            int v4_0 = android.graphics.drawable.Drawable.getMethod("getOpticalInsets", 0);
            try {
                int v5_0 = v3_2.getField("left");
                try {
                    int v6_0 = v3_2.getField("top");
                    try {
                        int v7_0 = v3_2.getField("right");
                    } catch (NoSuchFieldException) {
                        v7_0 = 0;
                        v3_1 = 0;
                        v8_1 = 0;
                        if (v8_1 == 0) {
                            n.l1.b = 0;
                            n.l1.c = 0;
                            n.l1.d = 0;
                            n.l1.e = 0;
                            n.l1.f = 0;
                            n.l1.a = 0;
                        } else {
                            n.l1.b = v4_0;
                            n.l1.c = v5_0;
                            n.l1.d = v6_0;
                            n.l1.e = v7_0;
                            n.l1.f = v3_1;
                            n.l1.a = 1;
                        }
                        return;
                    }
                    v3_1 = v3_2.getField("bottom");
                    v8_1 = 1;
                } catch (NoSuchMethodException) {
                    v6_0 = 0;
                    v7_0 = v6_0;
                } catch (ClassNotFoundException) {
                    v6_0 = 0;
                } catch (NoSuchFieldException) {
                    v6_0 = 0;
                }
            } catch (NoSuchMethodException) {
                v5_0 = 0;
                v6_0 = v5_0;
            } catch (ClassNotFoundException) {
                v5_0 = 0;
                v6_0 = v5_0;
            } catch (NoSuchFieldException) {
                v5_0 = 0;
                v6_0 = v5_0;
            }
        } catch (NoSuchMethodException) {
            v4_0 = 0;
            v5_0 = 0;
        } catch (ClassNotFoundException) {
            v4_0 = 0;
            v5_0 = 0;
        } catch (NoSuchFieldException) {
            v4_0 = 0;
            v5_0 = 0;
        } catch (NoSuchFieldException) {
        }
    }
}
