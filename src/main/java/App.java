import java.util.Scanner;

public class App {
    private Scanner sc;
    int wiseSayingLastId;

    public App() {
        sc = new Scanner(System.in);
        wiseSayingLastId = 0;
    }

    void run() {

        System.out.println("---명언 SSG---");
        outer:
        while (true) {
            System.out.print("명령)");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "등록":
                    write();
                    break;

                case "목록":

                case "삭제":

                case "종료":
                    break outer;
            }
        }
        sc.close();
    }

    void write() {
        int id = ++wiseSayingLastId;
        System.out.printf("명언 : ");
        String content = sc.nextLine();

        System.out.printf("작가 : ");
        String author = sc.nextLine();

        WiseSaying wiseSaying = new WiseSaying(id,content,author);
        System.out.println(wiseSaying);
        System.out.printf("%d번 명언이 등록 되었습니다.\n", id);
    }
}
