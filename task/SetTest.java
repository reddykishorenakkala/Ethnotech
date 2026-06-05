package task;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Man");
        names.add("Kishore");
        names.add("Anand");
        names.add("Man"); 

        System.out.println("Names Set: " + names);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of IDs: ");
        int n = sc.nextInt();

        Set<Integer> ids = new HashSet<>();

        System.out.println("Enter IDs:");

        for (int i = 0; i < n; i++) {
            ids.add(sc.nextInt());
        }

        System.out.println("IDs: " + ids);

        System.out.println("Size of Set: " + ids.size());
        System.out.println("Contains 104? " + ids.contains(104));

        ids.remove(101);
        System.out.println("After removing 101: " + ids);

        System.out.println("Is Set Empty? " + ids.isEmpty());
        System.out.println("All IDs:");
        for (Integer id : ids) {
            System.out.println(id);
        }

        Set<Integer> newIds = new HashSet<>();
        
        newIds.add(201);
        newIds.add(202);
        ids.retainAll(newIds);
        System.out.println(ids.equals(newIds));
        ids.addAll(newIds);
        System.out.println("After addAll(): " + ids);

         ids.clear();
        System.out.println("After clear(): " + ids);

        System.out.println("Is Set Empty Now? " + ids.isEmpty());

        sc.close();
    }
}