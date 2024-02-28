class Department {
    String name;
    Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }
}
