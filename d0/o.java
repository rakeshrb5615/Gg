package d0;
public abstract class o {

    public static android.media.AudioAttributes a(android.media.AudioAttributes$Builder p0)
    {
        return p0.build();
    }

    public static android.media.AudioAttributes$Builder b()
    {
        return new android.media.AudioAttributes$Builder();
    }

    public static android.media.AudioAttributes$Builder c(android.media.AudioAttributes$Builder p0, int p1)
    {
        return p0.setContentType(p1);
    }

    public static android.media.AudioAttributes$Builder d(android.media.AudioAttributes$Builder p0, int p1)
    {
        return p0.setUsage(p1);
    }
}
