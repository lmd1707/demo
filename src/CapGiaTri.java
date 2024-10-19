public class CapGiaTri<T, U> {
    private T giaTri1;
    private U giaTri2;


    public CapGiaTri(T giaTri1, U giaTri2) {
        this.giaTri1 = giaTri1;
        this.giaTri2 = giaTri2;
    }


    public T layGiaTri1() {
        return giaTri1;
    }


    public U layGiaTri2() {
        return giaTri2;
    }


    public void datGiaTri1(T giaTri1) {
        this.giaTri1 = giaTri1;
    }


    public void datGiaTri2(U giaTri2) {
        this.giaTri2 = giaTri2;
    }

    public static void main(String[] args) {

        CapGiaTri<String, Integer> capGiaTri = new CapGiaTri<>("Hello", 123);

        System.out.println("Giá trị 1: " + capGiaTri.layGiaTri1());
        System.out.println("Giá trị 2: " + capGiaTri.layGiaTri2());
    }
}