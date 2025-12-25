package q4;
public class h extends java.lang.Exception {

    public h(String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "Detail message must not be empty");
        super(p2);
        return;
    }

    public h(String p2, Throwable p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "Detail message must not be empty");
        super(p2, p3);
        return;
    }
}
