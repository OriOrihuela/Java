package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.person.Employee;
import org.lasencinas.person.Member;
import org.lasencinas.person.Person;
import org.lasencinas.publicEntity.Library;
import org.lasencinas.publicEntity.TownHall;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    private Library library = null;
    private Person director = null;
    private TownHall townHall = null;
    private List<Library> libraryList = null;

    @Before
    public void __init__() {
        director = new Person("Adolfo", "Domínguez", "12345678X");
        libraryList = new ArrayList<>();
        townHall = new TownHall("Ajuntament de Palma", libraryList);
        library = new Library(101, "Biblioteca Nacional", "C/ Mossèn Palau, 15", director,
                townHall);
    }

    @Test
    public void constructorTest() {
        assertNotNull(director);
        assertNotNull(townHall);
        assertNotNull(library);
    }

    @Test
    public void settersAndGettersTest() {
        assertEquals("Ajuntament de Palma", library.getTownHall().getName());
        assertEquals("Adolfo", library.getDirector().getName());

        List<Employee> employeeList = new ArrayList<>();
        library.setEmployeeList(employeeList);
        assertEquals(employeeList, library.getEmployeeList());

        List<Member> memberList = new ArrayList<>();
        library.setMemberList(memberList);
        assertEquals(memberList, library.getMemberList());

        library.setLibraryWantsToFire(true);
        assertTrue(library.libraryWantsToFire());
    }

    @Test
    public void createAndRemoveEmployeeTest() {
        Person person = new Person("Pablo", "López", "12345678X");
        person.setWantsToBeEmployee(true);

        List<Employee> employeeList = new ArrayList<>();
        library.setEmployeeList(employeeList);

        library.getEmployeeList().add(library.createEmployee(person));
        assertEquals(1, library.getEmployeeList().size());

        person.setWantsToBeEmployee(false);
        /*library.setLibraryWantsToFire(true);
        assertTrue(library.libraryWantsToFire());*/
        library.removeEmployee(person);
        assertEquals(0, library.getEmployeeList().size());
    }

    @Test
    public void createAndRemoveMemberTest() {
        Person person = new Person("Pablo", "López", "12345678X");
        person.setWantsToBeMember(true);

        List<Member> memberList = new ArrayList<>();
        library.setMemberList(memberList);

        library.getMemberList().add(library.createMember(person));
        assertEquals(1, library.getMemberList().size());

        person.setWantsToBeMember(false);
        //assertFalse(person.wantsToBeMember());
        library.getMemberList().remove(library.removeMember(person));
        assertEquals(0, library.getMemberList().size());
    }
}
