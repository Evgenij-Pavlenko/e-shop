package oa.pavlenko.model;

public enum Role {
    ROLE_ANONYMOUS("anonim"), ROLE_USER("user"), ROLE_ADMIN("admin");


   private String displayName;

    Role(String displayName){
        setDisplayName(displayName);
    }


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
