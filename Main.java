public class Interface {
    public static void main(String[] args) {
        Line line = new Line();
        PolyLine polyLine = new PolyLine();
        printLengths(line, polyLine);
    }

    private static void printLengths(Measurable... measurables) {
        for (Measurable measurable : measurables) {
            System.out.println("Длина: " + measurable.getLength());
        }
    }
}

interface Measurable {
    double getLength();
}

class Line implements Measurable {
    @Override
    public double getLength() {
        System.out.println("Считаем длину линии.");
        return 12; // Пример значения
    }
}

class PolyLine implements Measurable {
    @Override
    public double getLength() {
        System.out.println("Считаем длину ломаной линии.");
        return 24; // Пример значения
    }
}
