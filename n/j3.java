package n;
public abstract class j3 {

    public static void a(android.view.View p2, android.graphics.Rect p3, android.graphics.Rect p4)
    {
        int v2_1 = p2.computeSystemWindowInsets(new android.view.WindowInsets$Builder().setSystemWindowInsets(android.graphics.Insets.of(p3)).build(), p4).getSystemWindowInsets();
        p3.set(v2_1.left, v2_1.top, v2_1.right, v2_1.bottom);
        return;
    }
}
