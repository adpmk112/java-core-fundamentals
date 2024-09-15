public class CopyingArrayTest {
    public static void main(String[] args) {
        String[] languages = {
            "C#", "Java", "Python", "TypeScript", "JavaScript", "Kotlin", "Swift", "Php",
        };
    
        String[] favLanguages = new String[3];
    
        // Will get Java Python and TypeScript
        System.arraycopy(languages, 1, favLanguages, 0, 3);

        Helper.declareTitle("Testing System.arraycopy");
        Helper.showResult(favLanguages);

        // Will get Kotlin and Swift
        // Note: The second parameter (toIndex) in the Arrays.sort method specifies the end index (exclusive). 
        // For example, using 10 as the second parameter sorts elements from index 4 up to, but not including, index 10.
        String[] langaugesForMobile = java.util.Arrays.copyOfRange(languages, 5, 7);

        Helper.declareTitle("Testing java.util.Arrays.copyOfRange");
        Helper.showResult(langaugesForMobile);

        Helper.declareTitle("Testing stream method");
        java.util.Arrays.stream(languages).map(language -> language + " ").forEach(System.out::println);
        System.out.println("----------------");
    }
}
