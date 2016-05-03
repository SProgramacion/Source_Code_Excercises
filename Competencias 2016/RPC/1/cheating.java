import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.math.*;
import java.io.InputStreamReader;
import java.io.InputStream;
public class cheating {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static final int MODULO = (int) (1e9 + 7);
		private static final BigDecimal SQRT_DIG = new BigDecimal(13);
		private static final BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());

/**
 * Private utility method used to compute the square root of a BigDecimal.
 * 
 * @author Luciano Culacciatti 
 * @url http://www.codeproject.com/Tips/257031/Implementing-SqrtRoot-in-BigDecimal
 */
		private static BigDecimal sqrtNewtonRaphson  (BigDecimal c, BigDecimal xn, BigDecimal precision){
			BigDecimal fx = xn.pow(2).add(c.negate());
			BigDecimal fpx = xn.multiply(new BigDecimal(2));
			BigDecimal xn1 = fx.divide(fpx,2*SQRT_DIG.intValue(),RoundingMode.HALF_DOWN);
			xn1 = xn.add(xn1.negate());
			BigDecimal currentSquare = xn1.pow(2);
			BigDecimal currentPrecision = currentSquare.subtract(c);
			currentPrecision = currentPrecision.abs();
			if (currentPrecision.compareTo(precision) <= -1){
				return xn1;
			}
			return sqrtNewtonRaphson(c, xn1, precision);
		}
		
/**
 * Uses Newton Raphson to compute the square root of a BigDecimal.
 * 
 * @author Luciano Culacciatti 
 * @url http://www.codeproject.com/Tips/257031/Implementing-SqrtRoot-in-BigDecimal
 */
		public static BigDecimal bigSqrt(BigDecimal c){
			return sqrtNewtonRaphson(c,new BigDecimal(1),new BigDecimal(1).divide(SQRT_PRE));
		}
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
			while(n-- > 0)
			{
				int d, x, y;
				d = in.nextInt();
				x = in.nextInt();
				y = in.nextInt();
				BigDecimal dist = new BigDecimal(x*x + y*y);
				BigDecimal d1 = new BigDecimal(d);
				if( x==0 && y==0)
					out.println("0");
				else if(dist.compareTo(d1) == 0)
					out.println("1");
				else if( dist.compareTo(d1) == -1)
					out.println("2");				
				else
				{					
					dist = bigSqrt(dist);
					d1 = bigSqrt(d1);
					dist = dist.divide(d1, BigDecimal.ROUND_CEILING );
					//dist = dist.
					double ouput = (double)dist.doubleValue();
					ouput = Math.ceil(ouput);
					out.println(""+ (long)ouput);
				}
			}
		}

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

