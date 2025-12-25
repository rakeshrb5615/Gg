package j3;
public final class c {
    public final int a;
    public final synthetic int b;
    public final synthetic com.google.android.material.carousel.CarouselLayoutManager c;

    public c(int p1)
    {
        this.a = p1;
        return;
    }

    public c(com.google.android.material.carousel.CarouselLayoutManager p1, int p2)
    {
        this.b = p2;
        switch (p2) {
            case 1:
                this.c = p1;
                this(0);
                return;
            default:
                this.c = p1;
                this(1);
                return;
        }
    }

    public final int a()
    {
        switch (this.b) {
            case 0:
                return 0;
            default:
                int v0_3;
                int v0_2 = this.c;
                if (!v0_2.F0()) {
                    v0_3 = 0;
                } else {
                    v0_3 = v0_2.n;
                }
                return v0_3;
        }
    }
}
