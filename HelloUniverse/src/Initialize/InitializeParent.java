package HelloUniverse.src.Initialize;

public class InitializeParent {
    protected String pNum = "pNum 명시적 초기화";

    {
        this.pNum = "pNum 초기화 블록";
    }

    public InitializeParent() {
        this.pNum = "pNum 생성자를 통해 초기화";
    }

    public String getPnum() {
        return this.pNum;
    }
}