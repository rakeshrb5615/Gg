package k0;
public abstract class a {

    public static boolean a(android.location.Location p0)
    {
        return p0.isMock();
    }

    public static android.graphics.Typeface b(android.content.res.Configuration p2, android.graphics.Typeface p3)
    {
        if (android.os.Build$VERSION.SDK_INT >= 31) {
            boolean v0_4 = r2.q.b(p2);
            if ((v0_4 != 2147483647) && ((v0_4) && (p3 != null))) {
                return android.graphics.Typeface.create(p3, c4.b.h((p3.getWeight() + r2.q.b(p2)), 1, 1000), p3.isItalic());
            }
        }
        return 0;
    }
}
