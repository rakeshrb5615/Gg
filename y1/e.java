package y1;
public abstract class e {

    public static android.content.pm.PackageInfo a(android.content.pm.PackageManager p2, android.content.Context p3)
    {
        return p2.getPackageInfo(p3.getPackageName(), android.content.pm.PackageManager$PackageInfoFlags.of(0));
    }
}
