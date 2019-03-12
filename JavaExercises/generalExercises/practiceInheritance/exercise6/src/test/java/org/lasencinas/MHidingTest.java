package org.lasencinas;

public class MHidingTest {
    public static void main(String[] args) {
        MHidingSuper mhSuper = new MHidingSub();
        MHidingSub mhSub = new MHidingSub();
        System.out.println("#1");

        // #1
        MHidingSuper.print();
        mhSuper.print();

        System.out.println("#2");

        // #2
        MHidingSub.print();
        mhSub.print();
        ((MHidingSuper) mhSub).print();

        System.out.println("#3");

        // #3
        mhSuper = mhSub;
        mhSuper.print();
        ((MHidingSub) mhSuper).print();

        /**
         * #1
         * Inside MHidingSuper.print()
         * Inside MHidingSuper.print()
         * #2
         * Inside MHidingSub.print()
         * Inside MHidingSub.print()
         * Inside MHidingSuper.print()
         * #3
         * Inside MHidingSuper.print()
         * Inside MHidingSub.print()
         */
    }
}
