package collection.deque.test.stack;
/**
 * BrowserHistoryTest 와 실행 결과를 참고해서 BrowserHistory 클래스를 완성하자.
 * 브라우저의 방문 기록 관리 기능을 개발하자. 다음 기능을 개발해야 한다.
 *  visitPage() : 특정 페이지 방문
 *  goBack() : 뒤로가기
 */
public class BrowserHistoryTest {

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        // 사용자가 웹페이지를 방문하는 시나리오
        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        // 뒤로 가기 기능을 사용하는 시나리오
        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}
