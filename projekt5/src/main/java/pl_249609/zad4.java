package pl_249609;

public class zad4 {
    int tab[];

    public zad4(int tab[]) {

        this.tab = tab;

    }

    public void aw(int[] tab) {
        int k = tab.length;
        int f = k - 1;
        for (int i = 0; i < k; i++) {
            //system.out.print(tab[f]);
            f--;
        }
    }
}
