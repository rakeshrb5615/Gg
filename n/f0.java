package n;
public abstract class f0 {

    public static boolean a(android.view.DragEvent p2, android.widget.TextView p3, android.app.Activity p4)
    {
        p4.requestDragAndDropPermissions(p2);
        q0.e v4_6 = p3.getOffsetForPosition(p2.getX(), p2.getY());
        p3.beginBatchEdit();
        try {
            q0.e v4_3;
            android.text.Selection.setSelection(((android.text.Spannable) p3.getText()), v4_6);
            int v2_1 = p2.getClipData();
        } catch (int v2_2) {
            p3.endBatchEdit();
            throw v2_2;
        }
        if (android.os.Build$VERSION.SDK_INT < 31) {
            v4_3 = new q0.e();
            v4_3.b = v2_1;
            v4_3.c = 3;
        } else {
            v4_3 = new q0.c(v2_1, 3);
        }
        q0.q0.j(p3, v4_3.build());
        p3.endBatchEdit();
        return 1;
    }

    public static boolean b(android.view.DragEvent p2, android.view.View p3, android.app.Activity p4)
    {
        q0.e v4_2;
        p4.requestDragAndDropPermissions(p2);
        int v2_3 = p2.getClipData();
        if (android.os.Build$VERSION.SDK_INT < 31) {
            v4_2 = new q0.e();
            v4_2.b = v2_3;
            v4_2.c = 3;
        } else {
            v4_2 = new q0.c(v2_3, 3);
        }
        q0.q0.j(p3, v4_2.build());
        return 1;
    }
}
