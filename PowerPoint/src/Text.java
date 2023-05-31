public class Text implements Draw{
    public String text;

    public Text(String text) {
        this.text = text;
    }

    public void draw() {
        System.out.println(text + ":" + " 문자");
    }
}
