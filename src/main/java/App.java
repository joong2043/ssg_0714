import java.util.Scanner;

public class App {
    private Scanner sc;

    public App(){
        sc = new Scanner(System.in);
    }
    void run(){

        System.out.println("---명언 SSG---");
        outer:
        while(true){
            System.out.print("명령)");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "등록":
                    write();
                    break;

                case "종료":
                    break outer;
            }
        }
        sc.close();
    }

    void write(){
        int id = 1;
        System.out.printf("명언 : ");
        String content = sc.nextLine();

        System.out.printf("작가 : ");
        String author = sc.nextLine();

        System.out.printf("%d번 명언이 등록 되었습니다.",id);
    }
}
