package java_day2;

public class ExceptionTest {
    public static void main(String[] args) {
//        try {
        int[] numbers = {1, 2, 4};
        int result = divide(numbers, 0);

//        } catch (ArithmeticException ex){
//            System.out.println("ArimethicException: " + ex.getMessage() );
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("ArrayIndexException:" + ex.getMessage());
//        }catch (Exception ex){
//            System.out.println("Generic exception:" + ex.getMessage());
//        }finally {
//            System.out.println("Cleanup code here");
//        }

    }

    public static int divide(int[] numbers, int divisor) {
        int result = 0;
        try {
            result = numbers[0] / divisor;
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception:" + ex.getMessage());
//            throw ex;
        } catch (ArrayIndexOutOfBoundsException ex) {
//            throw ex; //Rethrow Exception
            System.out.println("ArrayIndexException:" + ex.getMessage());
        } finally {
            System.out.println("Cleanup code here");
//        }

        }
        return result;
    }
}
