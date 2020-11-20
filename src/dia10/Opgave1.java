package dia10;

import java.nio.file.Path;

public class Opgave1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        Path userhome = Path.of(System.getProperty("user.home"));
        System.out.println(userhome.getClass().getName());

        Path folder = userhome.resolve("JavaAdvIO/Opdracht1/Fase2");
        System.out.println(folder.toString());
        System.out.println(folder.getFileName());
        System.out.println(folder.getName(0));
        System.out.println(folder.getNameCount());
        System.out.println(folder.subpath(0, 2));
        System.out.println(folder.getParent());
        System.out.println(folder.getRoot());
    }
}
