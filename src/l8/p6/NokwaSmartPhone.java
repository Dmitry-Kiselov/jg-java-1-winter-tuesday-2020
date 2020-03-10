package l8.p6;

public class NokwaSmartPhone extends SmartPhone {

    @Override
    void sms() {
        System.out.println("Sending Nokwa SMS...");
    }

    @Override
    public void dial() {
        if (battery < 5) {
            System.out.println("Please charge me.. Hello Darkness, my old friend");
        }
        System.out.println("Dial like Nokwa");
    }

}
