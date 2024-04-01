package LeetCode;

public class JewelsStones {

    public static int numJewelsInStones(String jewels, String stones) {



        String modified = stones;

        for (int i = 0; i < jewels.length(); i++) {
            String element = Character.toString(jewels.charAt(i));
            modified = modified.replaceAll(element, "");
        }


        System.out.println(stones.length());
        System.out.println(stones);
        System.out.println(modified);
        System.out.println(modified.length());


        return stones.length() - modified.length();
    }

    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA","aAAbbbb"));

    }
}
