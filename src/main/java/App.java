import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;
    int wiseSayingLastId;
    private List<WiseSaying> wiseSayings;

    public App() {
        sc = new Scanner(System.in);
        wiseSayingLastId = 0;
        wiseSayings = new ArrayList<>();
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
        wiseSayings.add(wiseSaying);
        System.out.printf("%d번 명언이 등록 되었습니다.\n", id);
    }
}
