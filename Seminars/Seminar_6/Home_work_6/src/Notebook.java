public class Notebook {
    //    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//    Создать множество ноутбуков.
//    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
//    и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//    Например:“Введите цифру, соответствующую необходимому критерию: "
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

//    Ноутбук ITEL Spirit 2, 15.6", IPS, Intel Core i3 1115G4 3.0ГГц, " +
//            "8ГБ, 256ГБ SSD, Intel UHD Graphics , " +
//            "Linux, серый [71006300174]

    public String brand;
    public String diagonal;
    public int RAM;
    public int SSD;
    public String OS;
    public String color;

    public Notebook(String brand, String diagonal, int RAM, int SSD, String OS, String color) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.RAM = RAM;
        this.SSD = SSD;
        this.OS = OS;
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }
    public String getDiagonal(){
        return this.diagonal;
    }
    public int getRAM(){
        return RAM;
    }
    public int getSSD(){
        return SSD;
    }
    public String getOS(){
        return OS;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return String.format("Фирма: %s; Диагональ: %s\"; ОЗУ: %dГб; Объём ЖД: %dГб; ОC: %s; Цвет: %s", this.brand, this.diagonal, this.RAM, this.SSD, this.OS, this.color);
    }
}
