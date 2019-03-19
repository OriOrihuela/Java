package org.lasencinas.publicEntity;

import org.lasencinas.person.Employee;
import org.lasencinas.person.Member;
import org.lasencinas.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library extends PublicEntity {

    /* ---- Properties of the class ---- */
    private Person director = null;
    private TownHall townHall = null;
    private boolean libraryWantsToFire = false;

    private List<Employee> employeeList = new ArrayList<>();
    private List<Member> memberList = new ArrayList<>();


    /* ---- Constructor ---- */
    public Library() {

    }

    public Library(int entityCode, String entityName, String address) {
        super(entityCode, entityName, address);
    }

    public Library(int entityCode, String entityName, String address, Person director, TownHall townHall) {
        super(entityCode, entityName, address);
        this.director = director;
        this.townHall = townHall;
    }


    /* ---- Getters ---- */
    public Person getDirector() {
        return director;
    }

    public TownHall getTownHall() {
        return townHall;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public boolean libraryWantsToFire() {
        return libraryWantsToFire;
    }


    /* ---- Setters ---- */
    public void setDirector(Person director) {
        this.director = director;
    }

    public void setTownHall(TownHall townHall) {
        this.townHall = townHall;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public void setLibraryWantsToFire(boolean libraryWantsToFire) {
        this.libraryWantsToFire = libraryWantsToFire;
    }


    /* ---- Behaviours ---- */
    public void createEmployee(Person person) {
        if (person.wantsToBeEmployee()) {
            Employee employee = (Employee) person;
            employee.setIdLibrary(this.getEntityCode());

            System.out.println("Introduce the Employee ID");
            Scanner scanner = new Scanner(System.in);
            employee.setEmployeeID(scanner.nextInt());

            getEmployeeList().add(employee);
        } else {
            System.out.println("This person cannot be an employee of our Library");
        }
    }

    public void removeEmployee(Employee employee) {
        if (!employee.wantsToBeEmployee() | this.libraryWantsToFire()) {
            getEmployeeList().remove(employee);
        }
    }

    public void createMember(Person person) {
        if (person.wantsToBeEmployee()) {
            Member member = (Member) person;
            member.setIdLibrary(this.getEntityCode());

            System.out.println("Introduce the Member ID");
            Scanner scanner = new Scanner(System.in);
            member.setMemberID(scanner.nextInt());

            getMemberList().add(member);
        } else {
            System.out.println("This person cannot be a member of our Library");
        }
    }

    public void removeMember(Member member) {
        if (!member.wantsToBeEmployee()) {
            getEmployeeList().remove(member);
        }
    }

    @Override
    public String toString() {
        return "director {" + getDirector()+ "}" +
                "\n" + "townHall {" + getTownHall() + '}' +
                "\n" + "employeeList: " + getEmployeeList() +
                "\n" + "memberList: " + getMemberList() + "\n"+  super.toString();
    }
}
