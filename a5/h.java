package a5;
public final synthetic class h implements c6.b {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic h(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final Object get()
    {
        switch (this.a) {
            case 0:
                boolean v1_1 = ((a5.c) this.c);
                return v1_1.f.e(new a5.z(v1_1, ((a5.j) this.b)));
            case 1:
                return new a6.l(((android.content.Context) this.b), ((String) this.c));
            default:
                android.os.Bundle v0_5 = ((q4.f) this.b);
                boolean v1_3 = ((android.content.Context) this.c);
                a5.z v3_2 = v0_5.f();
                v0_5.d.a(x5.b);
                a6.l v2_2 = new h6.a();
                android.os.Bundle v0_9 = e0.c.createDeviceProtectedStorageContext(v1_3);
                boolean v1_5 = new StringBuilder("com.google.firebase.common.prefs:");
                v1_5.append(v3_2);
                boolean v1_8 = v0_9.getSharedPreferences(v1_5.toString(), 0);
                boolean v5 = 1;
                try {
                    if (!v1_8.contains("firebase_data_collection_default_enabled")) {
                        boolean v1_9 = v0_9.getPackageManager();
                        if (v1_9) {
                            android.os.Bundle v0_11 = v1_9.getApplicationInfo(v0_9.getPackageName(), 128);
                            if (v0_11 != null) {
                                boolean v1_11 = v0_11.metaData;
                                if ((v1_11) && (v1_11.containsKey("firebase_data_collection_default_enabled"))) {
                                    v5 = v0_11.metaData.getBoolean("firebase_data_collection_default_enabled");
                                }
                            }
                        }
                    } else {
                        v5 = v1_8.getBoolean("firebase_data_collection_default_enabled", 1);
                    }
                } catch (android.content.pm.PackageManager$NameNotFoundException) {
                }
                v2_2.a = v5;
                return v2_2;
        }
    }
}
