import java.util.Scanner;

public class App {

    void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("---명언 SSG---");
        outer:
        while(true){
            System.out.print("명령)");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "종료":
                    break outer;
            }

        }

        sc.close();
    }
}
