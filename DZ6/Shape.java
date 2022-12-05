package DZ6;

abstract class Shape {
    String crayon;
    int brightness;
    int definition;

    public Shape(String crayon, int brightness, int definition) {
        this.crayon = crayon;
        this.brightness = brightness;
        this.definition = definition;
    }

    void square() {
    }
}
