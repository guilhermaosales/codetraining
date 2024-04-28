package org.example.iterations;

import java.util.HashSet;

public class FirstDuplicateID {

    public static String findFirstDuplicateID(String[] ids) {
        HashSet<String> idSet = new HashSet<>();
        String lastUniqueId = "";

        for (String id : ids) {
            if (Boolean.FALSE.equals(idSet.add(id))) {
                lastUniqueId = id;
                break;
            }
        }


        return lastUniqueId;
    }

    public static void main(String[] args) {
        System.out.println(findFirstDuplicateID(new String[]{"X123", "A456", "X123", "B789", "A456", "C111"})); // Expected "X123"
        System.out.println(findFirstDuplicateID(new String[]{"Z999", "Y888", "Z999", "Y888"})); // Expected "Z999"
        System.out.println(findFirstDuplicateID(new String[]{"E100", "B200", "C300", "E100", "D400", "C300"})); // Expected "E100"
    }

}
