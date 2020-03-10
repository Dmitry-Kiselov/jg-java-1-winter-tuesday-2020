package l8.p6;

public class NokwaDemo {

    public static void main(String[] args) {

        Phone phone = new NokwaSmartPhone();

        charge((SmartPhone) phone);
        call(phone);

    }

    public static void charge(SmartPhone phone) {
        phone.battery = 100;
    }

    public static void call(Phone phone) {
        phone.dial();
    }

}
