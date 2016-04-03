package oa.pavlenko.model;

public enum Role {
    ANONIM("anonim"), USER("user"), ADMIN("admin");

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
