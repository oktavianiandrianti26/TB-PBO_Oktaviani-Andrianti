import java.util.Scanner;

public class Login
{

    String userName = "haitayo";
    String password = "123456";

    public void Login() {
        masukkanDetails();
    }

    public void masukkanDetails() {
        System.out.println("Selamat Datang di Showroom mobil");
        System.out.println("-----------------------------------");
        System.out.println("LOGIN");
        Scanner scanner = new Scanner(System.in);
        boolean login = false;
        while (!login) {
            
            try
            {
                System.out.print("Masukkan username : ");
                String masukkanUserName = scanner.nextLine();
                System.out.print("Masukkan password : ");
                String masukkanPassword = scanner.nextLine();
                if (masukkanUserName.equals(userName) && masukkanPassword.equals(password))
                {
                    login = true;
                }
                else
                {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Login Gagal. Masukkan Username dan Password dengan benar");
                System.out.println("--------------------------");
            }
        }
    }
}