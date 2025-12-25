package b2;
public final class e {
    public final c2.a a;
    public b2.a b;

    public e(c2.a p1)
    {
        this.a = p1;
        return;
    }

    public final android.os.Bundle a(String p5)
    {
        String v0_0 = this.a;
        if (!v0_0.g) {
            throw new IllegalStateException("You can \'consumeRestoredStateForKey\' only after the corresponding component has moved to the \'CREATED\' state");
        } else {
            android.os.Bundle v1_1 = v0_0.f;
            if (v1_1 != null) {
                int v3_1;
                if (!v1_1.containsKey(p5)) {
                    v3_1 = 0;
                } else {
                    v3_1 = j5.t1.E(v1_1, p5);
                }
                v1_1.remove(p5);
                if (v1_1.isEmpty()) {
                    v0_0.f = 0;
                }
                return v3_1;
            } else {
                return 0;
            }
        }
    }

    public final b2.d b()
    {
        try {
            java.util.Iterator v1_3 = this.a.d.entrySet().iterator();
        } catch (Throwable v0_1) {
            throw v0_1;
        }
        do {
            b2.d v4 = 0;
            if (!v1_3.hasNext()) {
                break;
            }
            b2.d v3_1 = ((java.util.Map$Entry) v1_3.next());
            if (kotlin.jvm.internal.j.a(((String) v3_1.getKey()), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                v4 = ((b2.d) v3_1.getValue());
            }
        } while(v4 == null);
        return v4;
    }

    public final void c(String p4, b2.d p5)
    {
        kotlin.jvm.internal.j.e(p5, "provider");
        java.util.LinkedHashMap v0_2 = this.a;
        try {
            if (v0_2.d.containsKey(p4)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            } else {
                v0_2.d.put(p4, p5);
                return;
            }
        } catch (String v4_1) {
            throw v4_1;
        }
    }

    public final void d()
    {
        if (!this.a.h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else {
            java.util.LinkedHashSet v1_2 = this.b;
            if (v1_2 == null) {
                v1_2 = new b2.a(this);
            }
            this.b = v1_2;
            try {
                androidx.lifecycle.k.getDeclaredConstructor(0);
                java.util.LinkedHashSet v1_4 = this.b;
            } catch (java.util.LinkedHashSet v1_5) {
                StringBuilder v3_1 = new StringBuilder("Class ");
                v3_1.append(androidx.lifecycle.k.getSimpleName());
                v3_1.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(v3_1.toString(), v1_5);
            }
            if (v1_4 != null) {
                ((java.util.LinkedHashSet) v1_4.b).add(androidx.lifecycle.k.getName());
            }
            return;
        }
    }
}
