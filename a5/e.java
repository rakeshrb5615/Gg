package a5;
public final synthetic class e implements c6.b {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic e(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object get()
    {
        switch (this.a) {
            case 0:
                String v0_8 = ((String) this.b);
                reflect.InvocationTargetException v1_0 = ".";
                com.google.firebase.components.ComponentRegistrar v5 = 0;
                try {
                    a5.q v6_0 = Class.forName(v0_8);
                } catch (ClassNotFoundException) {
                    reflect.InvocationTargetException v1_2 = new StringBuilder("Class ");
                    v1_2.append(v0_8);
                    v1_2.append(" is not an found.");
                    android.util.Log.w("ComponentDiscovery", v1_2.toString());
                    return v5;
                }
                if (!com.google.firebase.components.ComponentRegistrar.isAssignableFrom(v6_0)) {
                    StringBuilder v7_3 = new StringBuilder("Class ");
                    v7_3.append(v0_8);
                    v7_3.append(" is not an instance of com.google.firebase.components.ComponentRegistrar");
                    throw new a5.q(v7_3.toString());
                } else {
                    v5 = ((com.google.firebase.components.ComponentRegistrar) v6_0.getDeclaredConstructor(0).newInstance(0));
                    return v5;
                }
            case 1:
                return ((com.google.firebase.components.ComponentRegistrar) this.b);
            default:
                return new e6.c(((q4.f) this.b));
        }
    }
}
