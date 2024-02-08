public class Main {
    protected String brand_name = "Bolero";

    protected String brand= "Scorpio";

    public void color() {
        System.out.println("White");
    }
    class brand extends  Main{
        public void brandname(){
            System.out.println("Suzuki");
        }
    }
        public static void main(String[] args) {
            Main main = new Main();
            main.color();
            System.out.println(main.brand_name);
            System.out.println(main.brand);
        }
    }