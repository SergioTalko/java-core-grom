package lesson11.biginterfaceexample;

/**
 * Created by SERGIO on 30.04.2017.
 */
public class Storage {
    private File[] files = new File[5];

    public Storage(File[] files) {
        this.files = files;
    }

    public File[] getFiles() {
        return files;
    }
}
