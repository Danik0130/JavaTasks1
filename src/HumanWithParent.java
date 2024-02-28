class HumanWithParent {
    Name name;
   int height;
    HumanWithParent father;

    public HumanWithParent(Name name, int height, HumanWithParent father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }

    public String toString() {
        String fullName = name.toString();
        if (father != null) {
            if (name.getLastName() == null && father.name.getLastName() != null) {
                name.setLastName(father.name.getLastName());
                fullName = name.toString();
            }
            if (name.getMiddleName() == null && father.name.getFirstName() != null) {
                name.setMiddleName(father.name.getFirstName() + "ович");
                fullName = name.toString();
            }
            return fullName + ", отец: " + father.name.getFirstName();
        }
        return fullName;
    }
}