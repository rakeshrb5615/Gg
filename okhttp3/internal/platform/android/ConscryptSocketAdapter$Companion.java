package okhttp3.internal.platform.android;
public final class ConscryptSocketAdapter$Companion {

    private ConscryptSocketAdapter$Companion()
    {
        return;
    }

    public synthetic ConscryptSocketAdapter$Companion(int p1)
    {
        return;
    }

    public static boolean a()
    {
        int v0_0 = org.conscrypt.Conscrypt.version();
        if (v0_0 != 0) {
            if (v0_0.major() == 2) {
                if (v0_0.minor() == 1) {
                    if (v0_0.patch() < 0) {
                        return 0;
                    }
                } else {
                    if (v0_0.minor() <= 1) {
                        return 0;
                    }
                }
            } else {
                if (v0_0.major() <= 2) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }
}
