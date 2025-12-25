package okhttp3;
public interface Authenticator {
    public static final okhttp3.Authenticator a;

    static Authenticator()
    {
        okhttp3.Authenticator.a = new okhttp3.Authenticator$Companion$AuthenticatorNone();
        new okhttp3.internal.authenticator.JavaNetAuthenticator(0);
        return;
    }

    public abstract okhttp3.Request a();
}
