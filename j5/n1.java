package j5;
public final class n1 {
    public final boolean a;

    public n1(boolean p3)
    {
        if (android.os.Build$VERSION.RELEASE == null) {
            throw new NullPointerException("Null osRelease");
        } else {
            if (android.os.Build$VERSION.CODENAME == null) {
                throw new NullPointerException("Null osCodeName");
            } else {
                this.a = p3;
                return;
            }
        }
    }

    public final boolean equals(Object p2)
    {
        if ((p2 != this) && ((!(p2 instanceof j5.n1)) || ((!android.os.Build$VERSION.RELEASE.equals(android.os.Build$VERSION.RELEASE)) || ((!android.os.Build$VERSION.CODENAME.equals(android.os.Build$VERSION.CODENAME)) || (this.a != ((j5.n1) p2).a))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_6 = (((android.os.Build$VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ android.os.Build$VERSION.CODENAME.hashCode());
        if (!this.a) {
            v1_1 = 1237;
        } else {
            v1_1 = 1231;
        }
        return ((v0_6 * 1000003) ^ v1_1);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("OsData{osRelease=");
        v0_2.append(android.os.Build$VERSION.RELEASE);
        v0_2.append(", osCodeName=");
        v0_2.append(android.os.Build$VERSION.CODENAME);
        v0_2.append(", isRooted=");
        v0_2.append(this.a);
        v0_2.append("}");
        return v0_2.toString();
    }
}
