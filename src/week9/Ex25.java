package week9;

import java.util.HashSet;
import java.util.Set;

public class Ex25 {
    public static void main(String[] args) {
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Current number of duplicates: " +
                remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Current number of duplicates: " +
                remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
                remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: " +
                remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
                remover.getUniqueCharacterStrings());
    }

    public interface DuplicateRemover {
        void add(String characterString);

        int getNumberOfDetectedDuplicates();

        Set<String> getUniqueCharacterStrings();

        void empty();
    }

    public static class PersonalDuplicateRemover implements DuplicateRemover {
        private Set<String> entries = new HashSet<>();
        private int duplicateCount = 0;

        public void add(String characterString) {
            if (!this.entries.add(characterString)) {
                this.duplicateCount++;
            }
        }

        public int getNumberOfDetectedDuplicates() {
            return this.duplicateCount;
        }

        public Set<String> getUniqueCharacterStrings() {
            return this.entries;
        }

        public void empty() {
            this.entries.clear();
            this.duplicateCount = 0;
        }

    }
}