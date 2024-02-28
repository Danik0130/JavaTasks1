class House {
    int floors;

    public House(int floors) {
        this.floors = floors;
    }

    public String toString() {
        String suffix;
        if (floors == 1 || floors % 100 == 1) {
            suffix = "этажом";
        }
        else {
            suffix = "этажами";
        }
        return "дом с " + floors + " " + suffix;
    }
}