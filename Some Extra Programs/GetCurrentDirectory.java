public class GetCurrentDirectory {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDirectory);
    }
}
