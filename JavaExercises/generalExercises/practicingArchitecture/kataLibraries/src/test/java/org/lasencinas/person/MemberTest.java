package org.lasencinas.person;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MemberTest {

    private Member member = null;
    private Member member2 = null;
    private Member member3 = null;

    @Before
    public void __init__() {
        member = new Member("Marta", "Croft", "45678921X");
        member2 = new Member("Pepe", "Viyuela", "12345678K");
        member3 = new Member("Robert", "Baratheon", "45632198H");
    }

    @Test
    public void constructorTest() {
        assertNotNull(member);
        assertNotNull(member2);
        assertNotNull(member3);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Marta", member.getName());
        assertEquals("Pepe", member2.getName());
        assertEquals("Robert", member3.getName());

        member.setDni("12345678Z");
        assertEquals("12345678Z", member.getDni());

        member3.setBirth("02/08/1993");
        assertEquals("02/08/1993", member3.getBirth());
    }
}
