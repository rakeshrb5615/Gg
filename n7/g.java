package n7;
public abstract class g extends n7.a {

    public g(l7.c p2)
    {
        super(p2);
        if ((p2 != null) && (p2.getContext() != l7.i.a)) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        } else {
            return;
        }
    }

    public final l7.h getContext()
    {
        return l7.i.a;
    }
}
