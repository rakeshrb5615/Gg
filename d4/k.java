package d4;
public final class k extends android.content.BroadcastReceiver {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic k(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onReceive(android.content.Context p20, android.content.Intent p21)
    {
        switch (this.a) {
            case 0:
                d4.l v2_3 = ((c4.c) this.b);
                if (p20.getPackageName().equals(p21.getStringExtra("package.name"))) {
                    String v5_1 = new Object[0];
                    v2_3.a.d("List of extras in received intent:", v5_1);
                    i2.e0 v3_8 = p21.getExtras().keySet().iterator();
                    while (v3_8.hasNext()) {
                        String v5_6 = ((String) v3_8.next());
                        v2_3.a.d("Key: %s; value: %s", new Object[] {v5_6, p21.getExtras().get(v5_6)}));
                    }
                    i2.e0 v3_9 = v2_3.a;
                    String v6_1 = new Object[0];
                    v3_9.d("List of extras in received intent needed by fromUpdateIntent:", v6_1);
                    v3_9.d("Key: %s; value: %s", new Object[] {"install.status", Integer.valueOf(p21.getIntExtra("install.status", 0))}));
                    v3_9.d("Key: %s; value: %s", new Object[] {"error.code", Integer.valueOf(p21.getIntExtra("error.code", 0))}));
                    com.google.android.play.core.install.zza v9_1 = new com.google.android.play.core.install.zza(p21.getIntExtra("install.status", 0), p21.getLongExtra("bytes.downloaded", 0), p21.getLongExtra("total.bytes.to.download", 0), p21.getIntExtra("error.code", 0), p21.getStringExtra("package.name"));
                    v2_3.a.d("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[] {v9_1}));
                    Throwable v0_10 = new java.util.HashSet(v2_3.d).iterator();
                    while (v0_10.hasNext()) {
                        ((i2.e0) v0_10.next()).a(v9_1);
                    }
                } else {
                    v2_3.a.d("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", new Object[] {p21.getStringExtra("package.name")}));
                }
                return;
            case 1:
                ((h.z) this.b).g();
                return;
            default:
                ((i2.n0) this.b).b();
                return;
        }
    }
}
