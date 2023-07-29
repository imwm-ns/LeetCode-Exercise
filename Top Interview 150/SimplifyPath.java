import java.util.ArrayList;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        ArrayList<String> domain = new ArrayList<>();

        for (String subdomain : path.split("/")) {
            if (subdomain.equals(".") || subdomain.isEmpty()) continue;
            if (subdomain.equals("..")) {
                if (!domain.isEmpty()) domain.remove(domain.size() - 1);
            }
            else domain.add(subdomain);
        }

        return "/" + String.join("/", domain);
    }
}