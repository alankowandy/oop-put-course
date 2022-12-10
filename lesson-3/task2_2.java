interface Number {
    public double doubleValue() throws Exception;
}

class Logarithm implements Number {

  private double base, argument;

  @Override
  public double doubleValue() throws Exception {
      
        if (base <= 0) throw new Exception("Incorrect base! Base must be a positive value and cannot be equal to 1!");
        else if (base == 1) throw new Exception("Incorrect base! Base must be a positive value and cannot be equal to 1!");
        else if (argument <= 0) throw new Exception("Incorrect argument! Argument must be a positive value!");
        
        return Math.log(this.argument) / Math.log(this.base);

 }

  public Logarithm(double inputBase, double inputArgument) {
    this.base = inputBase;
    this.argument = inputArgument;
  }
  
}

public class task2_2 {

    public static void main(String[] args) {
        
        Logarithm newLogarithm = new Logarithm(4, 0);
        double result;
        try {
            result = newLogarithm.doubleValue();
        } catch (Exception err) {
            System.out.println("Error: " + err);
            return;
        }
        System.out.println(result);
    }
}
