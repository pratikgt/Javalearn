import java.util.HashMap;

class Hasings {
    public static void main(String[] args) {
        HashMap<String, Integer> examscores = new HashMap<String, Integer>();

        examscores.put("math", 75);
        examscores.put("social", 85);
        examscores.put("english", 89);
        examscores.putIfAbsent("math", 89);

        System.out.println(examscores.getOrDefault("english", -1));
        System.out.println(examscores.size());
        examscores.remove("english");
        System.out.println(examscores.containsKey("math"));

    }
}
