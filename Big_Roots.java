import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.*;
public class Big_Roots {

  public static BigInteger root(int n, BigInteger p){
    BigInteger negativeOne = new BigInteger("-1");
    BigInteger zero = new BigInteger("0");
    BigInteger one = new BigInteger("1");
    BigInteger two = new BigInteger("2");
    BigInteger number;
    BigInteger highNum = p;
    BigInteger lowNum = one;

    while (lowNum.compareTo(highNum) == -1){
      if ((lowNum.add(highNum)).mod(two) == zero){
        number = (lowNum.add(highNum)).divide(two);
      }
    else{
      number = lowNum.add(highNum).add(one).divide(two);
    }
    if ((number.pow(n)).compareTo(p)== 0 || (number.pow(n)).compareTo(p)==-1){
      lowNum = number;
    }
    else{
      highNum = number.subtract(one);
    }
    }
    if (highNum.pow(n).compareTo(p) != 0){
      return negativeOne;
    }
    return highNum;
  }

public static void main(String[] args) throws IOException{
  Scanner in = new Scanner(System.in);
  int cases = 1;
  BigInteger result;

  while(true){
    int n = in.nextInt();
    if (n == 0){
      break;
    }
    BigInteger p = in.nextBigInteger();
      result = root(n,p);
      if (result.equals(BigInteger.valueOf(-1))){
        System.out.println("Case " + cases + ": " + "No solution" + "\n");
      }
      else{
        System.out.println("Case " + cases + ": " + result + "\n");
      }
      cases++;
  }
}
}
//scanning Sc.nextBigInteger();