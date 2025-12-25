package n;
public abstract class p1 {
    public static final reflect.Method a;
    public static final reflect.Method b;
    public static final reflect.Method c;
    public static final boolean d;

    static p1()
    {
        try {
            Class[] v3_1 = Integer.TYPE;
            String v1_1 = android.widget.AbsListView.getDeclaredMethod("positionSelector", new Class[] {v3_1, android.view.View, Boolean.TYPE, Float.TYPE, Float.TYPE}));
            n.p1.a = v1_1;
            v1_1.setAccessible(1);
            String v1_3 = android.widget.AdapterView.getDeclaredMethod("setSelectedPositionInt", new Class[] {v3_1}));
            n.p1.b = v1_3;
            v1_3.setAccessible(1);
            NoSuchMethodException v0_1 = android.widget.AdapterView.getDeclaredMethod("setNextSelectedPositionInt", new Class[] {v3_1}));
            n.p1.c = v0_1;
            v0_1.setAccessible(1);
            n.p1.d = 1;
            return;
        } catch (NoSuchMethodException v0_2) {
            v0_2.printStackTrace();
            return;
        }
    }
}
