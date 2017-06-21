package chapter3.access_inherited;

public class Main {

    public static void main(String[] args) {
        ExtendShow ext = new ExtendShow();
        SuperShow sup = ext;

        System.out.println(sup.str);
        sup.show();

        System.out.println(ext.str);
        ext.show();
    }
}
