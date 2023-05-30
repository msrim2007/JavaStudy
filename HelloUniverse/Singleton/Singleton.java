package HelloUniverse.Singleton;

public class Singleton {
    private String text;

    private String mailServer;

    private static Singleton singleton;

    static {
        singleton = new Singleton();
        // 설정을 읽어오는 컴포넌트가 필요
        // 메일 서버 연결하고 -> 연결 정보를 어떻게 가져올까
        // 메일 인증 처리하고 .. 등 등
    }

    private Singleton() {}

    public static Singleton getInstance() {
        // 해제되었으면 메일서버 연결 후 반환 singleton.mailServer;
        return Singleton.singleton;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static void setText1(String text) {
        singleton.setText(text);
    }

    public void send() {
        // this.text 를 내용으로 메일 발송
    }

    public static void release() {
        singleton.mailServer = null;
    }

    public static String getMailServerName() {
        return singleton.mailServer.toString();
    }

    // 굳이 싱글턴 -> 메모리 관리 개념 -> 안쓸 때는 release 해줄수 있다.
    // 또 -> 인스턴스를 안만들면 컴포넌트화 시킬 수 없다. -> 그러니 컴포넌트들은 보통 싱글턴 패턴을 가진다.
}