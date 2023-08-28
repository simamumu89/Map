import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("田中", "島根県出身。20歳です。");
        userMap.put("鈴木", "東京都出身。22歳です。");
        userMap.put("山田", "大阪府出身。19歳です。");

        System.out.println(userMap.get("田中"));
        System.out.println(userMap.get("鈴木"));
        System.out.println(userMap.get("山田"));
    }
}