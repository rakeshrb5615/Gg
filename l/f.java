package l;
public final class f implements android.view.MenuItem$OnMenuItemClickListener {
    public static final Class[] c;
    public Object a;
    public reflect.Method b;

    static f()
    {
        l.f.c = new Class[] {android.view.MenuItem});
        return;
    }

    public final boolean onMenuItemClick(android.view.MenuItem p5)
    {
        RuntimeException v0_0 = this.a;
        reflect.Method v1 = this.b;
        if (v1.getReturnType() != Boolean.TYPE) {
            v1.invoke(v0_0, new Object[] {p5}));
            return 1;
        } else {
            return ((Boolean) v1.invoke(v0_0, new Object[] {p5}))).booleanValue();
        }
    }
}
