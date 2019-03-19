package org.lasencinas.publicEntity;

public class PublicEntity {

    /* ---- Properties of the class ---- */
    private int entityCode = 0;
    private String entityName = null;
    private String address = null;


    /* ---- Constructor ---- */
    public PublicEntity() {

    }
    public PublicEntity(int entityCode, String entityName, String address) {
        this.entityCode = entityCode;
        this.entityName = entityName;
        this.address = address;
    }


    /* ---- Getters ---- */
    public int getEntityCode() {
        return entityCode;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getAddress() {
        return address;
    }


    /* ---- Setters ---- */
    public void setEntityCode(int entityCode) {
        this.entityCode = entityCode;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /* ---- Behaviours ---- */
    public static void showLibrary(Library library) {
        System.out.println(library.toString());
    }

    @Override
    public String toString() {
        return "PublicEntity { " +
                "entityCode: " + getEntityCode() +
                ", entityName: '" + getEntityName() + '\'' +
                ", address: '" + getAddress() + '\'' + " " +
                '}';
    }
}
