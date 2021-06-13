class Main {
  
  public static int factorial(int n) {
    if(n==0) return 1;
  return n*factorial(n-1);
  }

  public static void main(String[] args) {
    //System.out.println(factorial(3));
    TowerOfHanoi toh = new TowerOfHanoi();
    toh.Move(3, 'A', 'C', 'B');
  }
}