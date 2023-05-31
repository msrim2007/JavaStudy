package HelloUniverse.src.Initialize;

public class Initialize extends InitializeParent {
    private String num = "num 명시적 초기화"; // 인스턴스 변수


    { // 인스턴스 변수 초기화 블록
        this.num = "num 초기화 블록";
        this.pNum = "pNum 하위 초기화 블록";
    }

    public Initialize() { // 생성자
        // this.num = "num 생성자를 통해 초기화";
    }

    public String getNum() {
        return this.num;
    }
}
