class Time {
    int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public String toString() {
        int hours = (seconds / 3600) % 24;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}