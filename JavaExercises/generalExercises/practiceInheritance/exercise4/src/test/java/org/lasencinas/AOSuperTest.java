package org.lasencinas;

import org.junit.Test;

public class AOSuperTest {

    @Test
    public static void main(String[] args) {
        AOSub aoSub = new AOSub();
        aoSub.print();
        aoSub.callOverridenPrint();
    }
}
