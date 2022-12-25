import java.util.*;

public class Task_18 {
    private int id;
    private String stamp;
    private int deviceMemory;
    private int hardDriveDisk;
    private String processor;
    private String graphicAdapter;
    private String operatingSystem;
    private int display;
    private Double weight;
    private String color;
    private int price;

    public Task_18(int id, String stamp, int deviceMemory, int hardDriveDisk,
            String processor, String graphicAdapter, String operatingSystem,
            int display, Double weight, String color, int price) {
        this.id = id;
        this.stamp = stamp;
        this.deviceMemory = deviceMemory;
        this.hardDriveDisk = hardDriveDisk;
        this.processor = processor;
        this.graphicAdapter = graphicAdapter;
        this.operatingSystem = operatingSystem;
        this.display = display;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public static Set<Task_18> lotsOfLaptops() {
        Set<Task_18> deviceCharacteristics = new HashSet<>();
        deviceCharacteristics.add(new Task_18(1, "ASUS", 8, 120, "Nvidia", "Nvidia",
                "No", 14, 1.0, "Black", 15000));
        deviceCharacteristics.add(new Task_18(2, "HP", 16, 256, "Apple", "AFOX",
                "Windows", 15, 2.0, "Red", 20000));
        deviceCharacteristics.add(new Task_18(3, "Lenovo", 4, 120, "IBM", "Biostar",
                "Windows", 16, 1.0, "Green", 28000));
        deviceCharacteristics.add(new Task_18(4, "ASUS", 4, 256, "Nvidia", "GIGABYTE",
                "Windows", 14, 2.5, "Black", 23000));
        deviceCharacteristics.add(new Task_18(5, "Acer", 16, 960, "Intel", "AFOX",
                "Windows", 15, 1.5, "Blue", 40000));
        deviceCharacteristics.add(new Task_18(6, "Lenovo", 16, 256, "Intel", "GIGABYTE",
                "No", 14, 1.0, "Black", 31000));
        // for (Task_18 i : deviceCharacteristics) {
        // // System.out.println(i);
        // }
        return deviceCharacteristics;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getStamp() {

        return stamp;
    }

    public void setStamp(String stamp) {

        this.stamp = stamp;
    }

    public int getDeviceMemory() {

        return deviceMemory;
    }

    public void setDeviceMemory(int deviceMemory) {

        this.deviceMemory = deviceMemory;
    }

    public int getHardDriveDisk() {

        return hardDriveDisk;
    }

    public void setHardDriveDisk(int hardDriveDisk) {

        this.hardDriveDisk = hardDriveDisk;
    }

    public String getProcessor() {

        return processor;
    }

    public void setProcessor(String processor) {

        this.processor = processor;
    }

    public String getGraphicAdapter() {

        return graphicAdapter;
    }

    public void setGraphicAdapter(String graphicAdapter) {

        this.graphicAdapter = graphicAdapter;
    }

    public String getOperatingSystem() {

        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {

        this.operatingSystem = operatingSystem;
    }

    public int getDisplay() {

        return display;
    }

    public void setDisplay(int display) {

        this.display = display;
    }

    public Double getWeight() {

        return weight;
    }

    public void setWeight(Double weight) {

        this.weight = weight;
    }

    public String getcolor() {

        return color;
    }

    public void setcolor(String color) {

        this.color = color;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public static Map<String, String> enterFilter() {
        Map<String, String> deviceMap = new HashMap<>();
        String key = "";
        while (!key.equals("s")) {
            System.out.printf("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - Марка (ASUS, HP, Lenovo, Acer)\n" +
                    "2 - Оперативная память RAM, ГБ (4, 8, 16)\n" +
                    "3 - Емкость накопителя SSD, ГБ (120, 256, 960)\n" +
                    "4 - Процессор (Nvidia, IBM, Apple, Intel)\n" +
                    "5 - Видеокарта (GIGABYTE, Nvidia, AFOX, Biostar)\n" +
                    "6 - Операционная система (No, Windows)\n" +
                    "7 - Монитор, дюйм (14, 15, 16)\n" +
                    "8 - Масса, кг (1.0, 1.5, 2.0, 2.5)\n" +
                    "9 - Цвет (Black, Blue, Red, Green)\n" +
                    "10 - Стоимость, руб.\n" +
                    "s - Вывести все соответствия\n" + "Ваш выбор: ");
            Scanner input = new Scanner(System.in);
            key = input.nextLine();
            if (!key.equals("s")) {
                System.out.printf("Введите фильтр по значению:\n" + "Ваш выбор: ");
                String value = input.nextLine();
                deviceMap.put(key, value);
            }
        }
        return deviceMap;
    }

    @Override
    public String toString() {
        return "Марка: " + stamp + ", оперативная память: " + deviceMemory + ", емкость накопителя: " + hardDriveDisk +
                ", процессор: " + processor + ", видеокарта: " + graphicAdapter + ", операционная система: "
                + operatingSystem + ", монитор: " + display + ", масса: " + weight + ", цвет: " + color + ", стоимость: " + price;
    }

    public static boolean selectionByFilter(Task_18 device, Map<String, String> deviceMap) {
        Boolean result = false;
        Integer count = 0;
        for (String key : deviceMap.keySet()) {
            if (key.equals("1")) {
                if (deviceMap.get("1").equals(device.stamp)) {
                    count += 1;
                }
            }
            if (key.equals("2")) {
                int integerValue = Integer.parseInt(deviceMap.get("2"));
                if (integerValue <= device.deviceMemory) {
                    count += 1;
                }
            }
            if (key.equals("3")) {
                int integerValue = Integer.parseInt(deviceMap.get("3"));
                if (integerValue <= device.hardDriveDisk) {
                    count += 1;
                }
            }
            if (key.equals("4")) {
                if (deviceMap.get("4").equals(device.processor)) {
                    count += 1;
                }
            }
            if (key.equals("5")) {
                if (deviceMap.get("5").equals(device.graphicAdapter)) {
                    count += 1;
                }
            }
            if (key.equals("6")) {
                if (deviceMap.get("6").equals(device.operatingSystem)) {
                    count += 1;
                }
            }
            if (key.equals("7")) {
                int integerValue = Integer.parseInt(deviceMap.get("7"));
                if (integerValue <= device.display) {
                    count += 1;
                }
            }
            if (key.equals("8")) {
                double fractionalValue = Double.parseDouble(deviceMap.get("8"));
                if (fractionalValue <= device.weight) {
                    count += 1;
                }
            }
            if (key.equals("9")) {
                if (deviceMap.get("9").equals(device.color)) {
                    count += 1;
                }
            }
            if (key.equals("10")) {
                int integerValue = Integer.parseInt(deviceMap.get("10"));
                if (integerValue <= device.price) {
                    count += 1;
                }
            }
        }
        if ((deviceMap.keySet().size()) == count) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Task_18> deviceCharacteristics = lotsOfLaptops();
        Map<String, String> deviceMap = enterFilter();
        for (Task_18 device : deviceCharacteristics) {
            if (selectionByFilter(device, deviceMap)) {
                System.out.println(device);
            }
        }
    }
}