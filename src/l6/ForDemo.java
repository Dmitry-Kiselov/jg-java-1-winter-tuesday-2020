package l6;

public class ForDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.println("Dayte mne pelmen 😋!");
            System.out.println("U menja ih uzhe " + i + ", ostalosj " + (30 - i));
        }

        System.out.println("Prihodit malish i prosit otdatj pelmeni obratno!!!");
        System.out.println();

        for (int i = 30; i >= 2; i -= 2) {
            System.out.println("Mne ochenj zhalj rasstavatsa s pelmeshkami 😭, ostalosj tolko " + i);

            if (i == 2) {
                System.out.println("Chto estj to estj.. Poestj..");
            }
        }

    }

}
