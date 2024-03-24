import java.io.*;

class MyReader extends FileReader {
    File file;
    char[] content = new char[1000];

    MyReader(File file) throws Exception {
        super(file);
        this.file = file;
    }

    MyReader(String filename) throws Exception {
        super(filename);
        file = new File(filename);
    }

    public String readContent() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("Welcome.txt")) {
            fw.write("Welcome to Software Engineering Department");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }

        MyReader reader = new MyReader("Welcome.txt");
        System.out.println(reader.readContent());

        File file = new File("Welcome.txt");
        MyReader reader2 = new MyReader(file);
        System.out.println(reader2.readContent());
    }
}
