public class Forum10Bad {
    public static void main(String[] args) {
        try {
//            melemparkanException();
        } catch (Exception ex) {
            System.err.println("Exception yang terlempar dari blok catch pada "
                    + "line 7 ditangani di main method");
        }
//        tidakMelemparkanException();

        try {
            System.out.println(OverloadingException.method(10, 20.0));
            System.out.println(OverloadingException.method(10.0, 20));
            System.out.println(OverloadingException.method(10.0, 20.0));
            System.out.println(OverloadingException.method(10));
        }catch (Exception exception){
            System.out.println("exception : "+exception);
        }
    }

    public static void tidakMelemparkanException() {
        try {
            System.out.println("Method tidakMelemparkanException dijalankan");
        }
        //blok catch ini tidak akan dieksekusi karena method tidak melemparkan exception
        catch (Exception ex) {
            System.err.println(ex);
        } finally {
            System.err.println("Pernyataan dalam blok finally pada line 22 dieksekusi");
        }
        System.out.println("Akhir dari method tidakMelemparkanException");

    }

    public static void melemparkanException() throws Exception {
        try {
            System.out.println("Pernyataan pada line 31 dieksekusi");
            throw new Exception();
        } catch (Exception ex) {
            System.out.println("Exception yang terlempar dari "
                    + "method melemparkanException telah ditangkap oleh blok catch pada line 36");
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + ex.getMessage());
            System.err.println("getLocalizedMessage():"
                    + ex.getLocalizedMessage());
            System.err.println("toString():" + ex);
            System.err.println("printStackTrace():");
            ex.printStackTrace();
            throw ex;//exception ini akan ditangani oleh blok catch di main method
        } finally {
            System.err.println("Pernyataan dalam blok finally pada line 41 dieksekusi");
        }
    }

    public static class OverloadingException {
        static double method(int i) throws Exception {
            return i / 0;
        }

        static boolean method(boolean b) {
            return !b;
        }

        static double method(int x, double y) throws Exception {
            return x + y;
        }

        static double method(double x, double y) {
            return x + y - 3;
        }
    }
}
