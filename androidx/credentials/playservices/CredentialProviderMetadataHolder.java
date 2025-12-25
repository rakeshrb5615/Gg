package androidx.credentials.playservices;
public final class CredentialProviderMetadataHolder extends android.app.Service {
    public final u0.a a;

    public CredentialProviderMetadataHolder()
    {
        this.a = new u0.a();
        return;
    }

    public final android.os.IBinder onBind(android.content.Intent p2)
    {
        kotlin.jvm.internal.j.e(p2, "intent");
        return this.a;
    }
}
