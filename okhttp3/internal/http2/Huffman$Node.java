package okhttp3.internal.http2;
final class Huffman$Node {
    public final okhttp3.internal.http2.Huffman$Node[] a;
    public final int b;
    public final int c;

    public Huffman$Node()
    {
        int v0_1 = new okhttp3.internal.http2.Huffman$Node[256];
        this.a = v0_1;
        this.b = 0;
        this.c = 0;
        return;
    }

    public Huffman$Node(int p2, int p3)
    {
        this.a = 0;
        this.b = p2;
        int v2_1 = (p3 & 7);
        if (v2_1 == 0) {
            v2_1 = 8;
        }
        this.c = v2_1;
        return;
    }
}
