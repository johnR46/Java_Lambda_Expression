public class Main {

    public static void main(String[] args) {

        IJob myJob = () -> System.out.println("Functional Programing lamda fun ");
        myJob.job();
        // new obj จาก interface ตรงๆ แล้ว ร่างรายละเอียดของ abstract ผ่านตัวที่เรียก
        // จากนั้นก็ call method กลับกลายเป็นล่างขึ้นบน gg

        AJob A = new AJob(); // AbstractJob - > AJob inheritance + overriding method
        A.dojob();

    }
}