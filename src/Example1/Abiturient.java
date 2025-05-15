package Example1;

class Abiturient {
    String surname;
    String name;
    int math;
    int physics;
    int lang;

    double average (){
        return (double) (math + physics + lang) / 3;
    }

    void print(){
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f", surname, name, math, physics, lang, average());
    }
}
