package com.google.android.gms.dynamite;
final class zzd extends dalvik.system.PathClassLoader {

    public zzd(String p1, ClassLoader p2)
    {
        super(p1, p2);
        return;
    }

    public final Class loadClass(String p2, boolean p3)
    {
        try {
            if ((p2.startsWith("java.")) || (p2.startsWith("android."))) {
                return super.loadClass(p2, p3);
            } else {
                p2 = this.findClass(p2);
                return p2;
            }
        } catch (ClassNotFoundException) {
            return super.loadClass(p2, p3);
        }
    }
}
