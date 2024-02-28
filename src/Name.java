class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String toString() {
        StringBuilder fullName = new StringBuilder();
        if (firstName != null) fullName.append(firstName).append(" ");
        if (lastName != null) fullName.append(lastName).append(" ");
        if (middleName != null) fullName.append(middleName);
        return fullName.toString().trim();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
