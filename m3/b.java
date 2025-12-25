package m3;
public final class b implements m3.c {
    public Long a;

    public final boolean b()
    {
        int v1 = 1;
        if (this.a == null) {
            try {
                Long v0_7 = android.os.Build.getDeclaredMethod("getLong", new Class[] {String}));
                v0_7.setAccessible(1);
                Long v0_2 = ((Long) v0_7.invoke(0, new Object[] {"ro.build.version.oneui"})));
                v0_2.longValue();
                this.a = v0_2;
            } catch (Exception) {
                this.a = Long.valueOf(-1);
            }
        }
        if (this.a.longValue() < 40100) {
            v1 = 0;
        }
        return v1;
    }
}
