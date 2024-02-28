class HumanWithName {
    Name name;
    int height;

    public HumanWithName(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        return name + ", рост: " + height;
    }
}
