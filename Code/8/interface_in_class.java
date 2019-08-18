public class interface_in_class {

    // ถ้าจะหลีกเลี่ยง แก้การเขียนโปรแกรมให้เป็นแบบ inner class / inner interface ซึ่งก็ เปลี่ยนได้ ถถถ 

    public interface Jobfair {
        abstract void job();
    }

    static String jobs = "Programmer";

    public static void main(String[] args) {

        Jobfair myJob4 = () -> {
            jobs = "writer";
            System.out.println(jobs);

        };

        myJob4.job(); // writer 

    }

}