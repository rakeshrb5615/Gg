package okhttp3.internal.connection;
public final synthetic class ConnectPlan$WhenMappings {
    public static final synthetic int[] a;

    static ConnectPlan$WhenMappings()
    {
        int[] v0_2 = new int[java.net.Proxy$Type.values().length];
        java.net.Proxy$Type.DIRECT.ordinal()[int v1_2] = 1;
        try {
            java.net.Proxy$Type.HTTP.ordinal()[int v1_0] = 2;
        } catch (NoSuchFieldError) {
        }
        okhttp3.internal.connection.ConnectPlan$WhenMappings.a = v0_2;
        return;
    }
}
