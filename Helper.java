public class Helper {
    protected static void declareTitle(String text){
        System.out.println(text);
        System.out.println("");
    }

    protected static void showResult(String[] resultArr){
        if(resultArr == null){
            System.out.println("The array is null.");
            return;
        }

        for(String out : resultArr){
            System.out.println(out + " ");
        }

        System.out.println("----------------");
    }

    protected static void showResult(int[] resultArr){
        if(resultArr == null){
            System.out.println("The array is null.");
            return;
        }

        for(int out : resultArr){
            System.out.println(out + " ");
        }

        System.out.println("----------------");
    }
}
