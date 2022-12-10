public class Comparisons {
    private int a, b;

    Comparisons (int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int max(){
        return a > b ? a : b;
    }

    public int min(){
        return a < b ? a : b;
    }

    public float avg(){
        return (a + b) / 2.0f;
    }
    
    public static void main(String[] args) {
        Comparisons comparisons = new Comparisons(1, 2);
        System.out.println("Max: " + comparisons.max());
        System.out.println("Min: " + comparisons.min());
        System.out.println("Avg: " + comparisons.avg());
    }

}