package HelloUniverse.ShopExam;

public class Shop {
    private int ipgo = 0; // 각 가게의 입고 수량
    private int sale = 0; // 각 가게의 판매 수량

    private static int totalIpgo = 0; // 총 입고 수량
    private static int totalSale = 0; // 총 판매 수량

    // 입고
    public void Ipgo(int num) {
        this.ipgo += num;
        Shop.totalIpgo += num; // 총 입고 수량도 같이 증가시킨다.
    }

    // 판매
    public void Sale(int num) {
        if (this.ipgo <= 0) {
            System.out.println("품절");
        } else {
            this.sale += num;
            Shop.totalSale += num; // 총 판매 수량도 같이 증가시킨다.
        }
    }

    public int getIpgo() { // 가게 입고량 가져오기
        return this.ipgo;
    }

    public int getSale() { // 가게 판매량 가져오기
        return this.sale;
    }

    public static int getTotalIpgo() { // 총 입고량 가져오기
        return Shop.totalIpgo;
    }

    public static int getTotalSale() { // 총 판매량 가져오기
        return Shop.totalSale;
    }
}
