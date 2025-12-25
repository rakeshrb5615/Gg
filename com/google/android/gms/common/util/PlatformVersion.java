package com.google.android.gms.common.util;
public final class PlatformVersion {

    private PlatformVersion()
    {
        return;
    }

    public static boolean isAtLeastHoneycomb()
    {
        return 1;
    }

    public static boolean isAtLeastHoneycombMR1()
    {
        return 1;
    }

    public static boolean isAtLeastIceCreamSandwich()
    {
        return 1;
    }

    public static boolean isAtLeastIceCreamSandwichMR1()
    {
        return 1;
    }

    public static boolean isAtLeastJellyBean()
    {
        return 1;
    }

    public static boolean isAtLeastJellyBeanMR1()
    {
        return 1;
    }

    public static boolean isAtLeastJellyBeanMR2()
    {
        return 1;
    }

    public static boolean isAtLeastKitKat()
    {
        return 1;
    }

    public static boolean isAtLeastKitKatWatch()
    {
        return 1;
    }

    public static boolean isAtLeastLollipop()
    {
        return 1;
    }

    public static boolean isAtLeastLollipopMR1()
    {
        return 1;
    }

    public static boolean isAtLeastM()
    {
        return 1;
    }

    public static boolean isAtLeastN()
    {
        return 1;
    }

    public static boolean isAtLeastO()
    {
        return 1;
    }

    public static boolean isAtLeastP()
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isAtLeastQ()
    {
        if (android.os.Build$VERSION.SDK_INT < 29) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isAtLeastR()
    {
        if (android.os.Build$VERSION.SDK_INT < 30) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isAtLeastS()
    {
        if (android.os.Build$VERSION.SDK_INT < 31) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isAtLeastSv2()
    {
        if (android.os.Build$VERSION.SDK_INT < 32) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isAtLeastT()
    {
        if (android.os.Build$VERSION.SDK_INT < 33) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isAtLeastU()
    {
        if (android.os.Build$VERSION.SDK_INT < 34) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isAtLeastV()
    {
        int v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 35) {
            if (v0_0 >= 34) {
                kotlin.jvm.internal.j.d(android.os.Build$VERSION.CODENAME, "CODENAME");
                if (m0.a.a("VanillaIceCream")) {
                    return 1;
                }
            }
            return 0;
        }
        return 1;
    }
}
