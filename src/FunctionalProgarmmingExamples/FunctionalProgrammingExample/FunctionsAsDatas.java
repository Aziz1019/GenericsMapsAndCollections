package FunctionalProgarmmingExamples.FunctionalProgrammingExample;

import FunctionalProgarmmingExamples.FunctionInterfaces.NoArgsFunctionExample;

public class FunctionsAsDatas {
    protected static class Person{
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    protected static class DataLoader{
        private final NoArgsFunctionExample<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment ? this::loadPersonFake : this::loadPersonReal;
        }

        private Person loadPersonReal(){
            System.out.println("Loading Person ...");
            return new Person("Real Person", 30);
        }
        private Person loadPersonFake(){
            System.out.println("Loading Person ...");
            return new Person("Fake Person", 65);
        }

        @Override
        public String toString() {
            return "DataLoader{" +
                    "loadPerson=" + loadPerson +
                    '}';
        }
    }

    public static void main(String[] args) {
        Boolean is_development = false;
        DataLoader dataLoader = new DataLoader(is_development);
        System.out.println(dataLoader.loadPerson.apply());
    }
}

