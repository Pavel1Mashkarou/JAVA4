import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    //Организовать ввод и хранение данных пользователей. ФИО возраст, пол и выход из режима ввода информации
    //вывод в формате Фамилия И.О. возраст пол
    //добавить возможность выхода или вывода списка отсортированного по возрасту!)
    //*реализовать сортировку по возрасту с использованием индексов
    //*реализовать сортировку по возрасту и полу с использованием индексов

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> secondName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();
        ArrayList<String> age = new ArrayList<>();
        while (true){
            //System.out.println("Введите имя: ");
            firstName.add(scanner.nextLine());
            //System.out.println("Введите фамилию:");
            secondName.add(scanner.nextLine());
            //System.out.println("Введите отчество: ");
            lastName.add(scanner.nextLine());
            //System.out.println("Введите пол(м/ж): ");
            s.add(scanner.nextLine());
            //System.out.println("Введите возраст: ");
            age.add(scanner.nextLine());
            //System.out.println("Вы хотите продолжить (да/нет)");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("нет")) break;
        }
        for (int i=0;i<firstName.size();i++){
            System.out.println(firstName.get(i)+" "+secondName.get(i)+" "+lastName.get(i)+" "+age.get(i)+" "+s.get(i));
        }
        System.out.println();
        //Сортировка по возрасту!!!
        String tempFN; String tempSN; String tempLN; String tempS; String tempAge;
        boolean sort = false;

        while(!sort){
            sort = true;
            for (int i = 0; i < age.size()-1; i++) {
                if(Integer.valueOf(age.get(i)) > Integer.valueOf(age.get(i+1))){
                    sort = false;
                    tempAge = age.get(i); tempFN=firstName.get(i);tempSN= secondName.get(i);tempLN=lastName.get(i);tempS = s.get(i);
                    age.set(i,age.get(i+1));firstName.set(i,firstName.get(i+1));secondName.set(i,secondName.get(i+1));lastName.set(i,lastName.get(i+1));s.set(i,s.get(i+1));
                    age.set(i+1,tempAge);firstName.set(i+1,tempFN);secondName.set(i+1,tempSN);lastName.set(i+1,tempLN);s.set(i+1,tempS);
                }
            }
        }

        for (int i=0;i<firstName.size();i++){
            System.out.println(firstName.get(i)+" "+secondName.get(i)+" "+lastName.get(i)+" "+age.get(i)+" "+s.get(i));
        }
        System.out.println();
        //Сортировка по возрасту и полу(Ж)
        String gender = scanner.nextLine();
        for (int i =0;i<s.size();i++){
            if (s.get(i).toLowerCase().equals(gender.toLowerCase())){
                System.out.println(firstName.get(i)+" "+secondName.get(i)+" "+lastName.get(i)+" "+age.get(i)+" "+s.get(i));
            }
        }
        for (int i =0;i<s.size();i++){
            if (!s.get(i).toLowerCase().equals(gender.toLowerCase())){
                System.out.println(firstName.get(i)+" "+secondName.get(i)+" "+lastName.get(i)+" "+age.get(i)+" "+s.get(i));
            }
        }
        //Сортировка по возрасту и полу(М)
        System.out.println();
        String gender1 = scanner.nextLine();
        for (int i =0;i<s.size();i++){
            if (s.get(i).toLowerCase().equals(gender1.toLowerCase())){
                System.out.println(firstName.get(i)+" "+secondName.get(i)+" "+lastName.get(i)+" "+age.get(i)+" "+s.get(i));
            }
        }
        for (int i =0;i<s.size();i++){
            if (!s.get(i).toLowerCase().equals(gender1.toLowerCase())){
                System.out.println(firstName.get(i)+" "+secondName.get(i)+" "+lastName.get(i)+" "+age.get(i)+" "+s.get(i));
            }
        }
    }
}

