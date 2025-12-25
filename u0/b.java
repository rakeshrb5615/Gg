package u0;
public final synthetic class b implements com.google.android.gms.tasks.OnFailureListener {
    public final synthetic int a;
    public final synthetic androidx.credentials.playservices.HiddenActivity b;

    public synthetic b(androidx.credentials.playservices.HiddenActivity p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onFailure(Exception p9)
    {
        StringBuilder v1_0 = "CREATE_INTERRUPTED";
        String v3_0 = "GET_INTERRUPTED";
        androidx.credentials.playservices.HiddenActivity v7 = this.b;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(v7, "this$0");
                kotlin.jvm.internal.j.e(p9, "e");
                if ((!(p9 instanceof com.google.android.gms.common.api.ApiException)) || (!v0.a.a.contains(Integer.valueOf(((com.google.android.gms.common.api.ApiException) p9).getStatusCode())))) {
                    v1_0 = "CREATE_UNKNOWN";
                }
                android.os.ResultReceiver v0_14 = v7.a;
                kotlin.jvm.internal.j.b(v0_14);
                String v2_6 = new StringBuilder("During create public key credential, fido registration failure: ");
                v2_6.append(p9.getMessage());
                v7.a(v0_14, v1_0, v2_6.toString());
                return;
            case 1:
                kotlin.jvm.internal.j.e(v7, "this$0");
                kotlin.jvm.internal.j.e(p9, "e");
                if ((!(p9 instanceof com.google.android.gms.common.api.ApiException)) || (!v0.a.a.contains(Integer.valueOf(((com.google.android.gms.common.api.ApiException) p9).getStatusCode())))) {
                    v1_0 = "CREATE_UNKNOWN";
                }
                android.os.ResultReceiver v0_10 = v7.a;
                kotlin.jvm.internal.j.b(v0_10);
                String v2_4 = new StringBuilder("During save password, found password failure response from one tap ");
                v2_4.append(p9.getMessage());
                v7.a(v0_10, v1_0, v2_4.toString());
                return;
            case 2:
                kotlin.jvm.internal.j.e(v7, "this$0");
                kotlin.jvm.internal.j.e(p9, "e");
                if ((!(p9 instanceof com.google.android.gms.common.api.ApiException)) || (!v0.a.a.contains(Integer.valueOf(((com.google.android.gms.common.api.ApiException) p9).getStatusCode())))) {
                    v3_0 = "GET_NO_CREDENTIALS";
                }
                android.os.ResultReceiver v0_6 = v7.a;
                kotlin.jvm.internal.j.b(v0_6);
                StringBuilder v1_11 = new StringBuilder("During get sign-in intent, failure response from one tap: ");
                v1_11.append(p9.getMessage());
                v7.a(v0_6, v3_0, v1_11.toString());
                return;
            default:
                kotlin.jvm.internal.j.e(v7, "this$0");
                kotlin.jvm.internal.j.e(p9, "e");
                if ((!(p9 instanceof com.google.android.gms.common.api.ApiException)) || (!v0.a.a.contains(Integer.valueOf(((com.google.android.gms.common.api.ApiException) p9).getStatusCode())))) {
                    v3_0 = "GET_NO_CREDENTIALS";
                }
                android.os.ResultReceiver v0_2 = v7.a;
                kotlin.jvm.internal.j.b(v0_2);
                StringBuilder v1_5 = new StringBuilder("During begin sign in, failure response from one tap: ");
                v1_5.append(p9.getMessage());
                v7.a(v0_2, v3_0, v1_5.toString());
                return;
        }
    }
}
