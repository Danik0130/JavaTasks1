class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public String toString() {
        return "Линия от " + startPoint + " до " + endPoint;
    }
}