import data.Failures;
import services.HttpService;
import java.util.Objects;
import java.util.Scanner;

public final class Application {
    public static void main(String[] args) {
        var result = "";
        try {
            Scanner scan = new Scanner(System.in);
            var userId = scan.nextInt();
            scan.close();
            result = HttpService.getUserWithUrlConnection(userId);
        } catch (Exception e) {
            System.err.println(Failures.INVALID_ARGUMENT);
        }
        if (!Objects.equals(result, ""))
            System.out.println(result);
    }
}
