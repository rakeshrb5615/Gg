package kotlin.jvm.internal;
public abstract class c implements z7.b, java.io.Serializable {
    public static final Object NO_RECEIVER;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient z7.b reflected;
    private final String signature;

    static c()
    {
        kotlin.jvm.internal.c.NO_RECEIVER = kotlin.jvm.internal.b.a;
        return;
    }

    public c(Object p1, Class p2, String p3, String p4, boolean p5)
    {
        this.receiver = p1;
        this.owner = p2;
        this.name = p3;
        this.signature = p4;
        this.isTopLevel = p5;
        return;
    }

    public varargs Object call(Object[] p2)
    {
        return this.getReflected().call(p2);
    }

    public Object callBy(java.util.Map p2)
    {
        return this.getReflected().callBy(p2);
    }

    public z7.b compute()
    {
        z7.b v0 = this.reflected;
        if (v0 == null) {
            v0 = this.computeReflected();
            this.reflected = v0;
        }
        return v0;
    }

    public abstract z7.b computeReflected();

    public java.util.List getAnnotations()
    {
        return this.getReflected().getAnnotations();
    }

    public Object getBoundReceiver()
    {
        return this.receiver;
    }

    public String getName()
    {
        return this.name;
    }

    public z7.d getOwner()
    {
        kotlin.jvm.internal.e v0_0 = this.owner;
        if (v0_0 != null) {
            if (!this.isTopLevel) {
                return kotlin.jvm.internal.s.a(v0_0);
            } else {
                kotlin.jvm.internal.s.a.getClass();
                return new kotlin.jvm.internal.l(v0_0);
            }
        } else {
            return 0;
        }
    }

    public java.util.List getParameters()
    {
        return this.getReflected().getParameters();
    }

    public abstract z7.b getReflected();

    public z7.h getReturnType()
    {
        this.getReflected().getReturnType();
        return 0;
    }

    public String getSignature()
    {
        return this.signature;
    }

    public java.util.List getTypeParameters()
    {
        return this.getReflected().getTypeParameters();
    }

    public z7.i getVisibility()
    {
        return this.getReflected().getVisibility();
    }

    public boolean isAbstract()
    {
        return this.getReflected().isAbstract();
    }

    public boolean isFinal()
    {
        return this.getReflected().isFinal();
    }

    public boolean isOpen()
    {
        return this.getReflected().isOpen();
    }
}
