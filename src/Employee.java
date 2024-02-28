class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        if (department == null) {
            return "департамент не создан";
        } else {

            if (department.manager == this) {
                return name + " начальник отдела " + department.getName();
            } else {

                return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getManager().getName();
            }
        }
    }

    public String getName() {
        return name;
    }
}
