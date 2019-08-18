public class Main {

    public static void main(String[] args) {
        // การประยุกต์ใช้แลมบ์ดา
        IJob myJob = () -> System.out.println("Functional Programing  ");
        myJob.job();
        // new obj จาก interface ตรงๆ แล้ว ร่างรายละเอียดของ abstract ผ่านตัวที่เรียก
        // จากนั้นก็ call method กลับกลายเป็นล่างขึ้นบน gg

        // AJob A = new AJob(); // AbstractJob - > AJob inheritance + overriding method
        // A.dojob();

        // การใช้งาน แลมบ์ดาเดิมหลายครั้ง นับอันบนเป็นอันแรก
        IJob yourjob = () -> System.out.println("Lambda Expressing ");
        yourjob.job();

        // การสร้าง anonymous class
        AbstractJob myjob2 = new AbstractJob() {
            @Override
            void dojob() {
                System.out.println("Functional Programing agin !");
            }
        };
        myjob2.dojob();

        // การอ้างค่าตัวแปรของ lambda เป็น final
        // แก้ค่าไม่ได้ตอนทำงาน แล้ว ?
        // example
        final String job = "Programmer";
        IJob myJob3 = () -> {
            String morejob = "Writer";
            System.out.println(job + "," + morejob);
        };

        myJob3.job();


     

        



    }
}