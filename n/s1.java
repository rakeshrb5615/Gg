package n;
public abstract class s1 {
    public static final reflect.Field a;

    static s1()
    {
        try {
            reflect.Field v0 = android.widget.AbsListView.getDeclaredField("mIsChildViewEnabled");
            v0.setAccessible(1);
        } catch (NoSuchFieldException v1_2) {
            v1_2.printStackTrace();
        }
        n.s1.a = v0;
        return;
    }
}
