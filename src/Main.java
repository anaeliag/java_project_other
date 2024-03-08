import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)
    {
        String task = null;
        Integer no_of_task = null;
        System.out.println("Bienvenido al menu de inicio!\n");
        System.out.println("Cual es tu nombre: ?");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Bienvenido "+name);

        int choice;

        TreeMap<Integer, String> taskmap = new TreeMap<Integer, String>();

        do
        {
            //Display the Menu
            System.out.println("Elige una opcion\n");
            System.out.println("1. Ingresa una tarea ");
            System.out.println("2. Remueve una tarea ");
            System.out.println("3. Actualiza una tarea ");
            System.out.println("4. Lista una tarea ");
            System.out.println("5. Salir");
            choice = in.nextInt();


            switch(choice)
            {
                case 1:
                    System.out.println("Ingrese el numero de la tarea: ");
                    no_of_task = Integer.valueOf(in.nextInt());
                    in.nextLine();
                    System.out.println("Ingresa la tarea");
                    task = in.nextLine();
                    taskmap.put( no_of_task, task);
                    break;
                case 2:
                    System.out.println("Que tarea quieres remover ");
                    no_of_task = Integer.valueOf(in.nextInt());
                    // in.nextLine();
                    Object eliminartarea = taskmap.remove(no_of_task);
                    break;
                case 3:
                    System.out.println("Que tarea quieres modificar ");
                    no_of_task = Integer.valueOf(in.nextInt());
                    System.out.println("Cual es la nueva tarea? ");
                    task = in.next();
                    System.out.println("Actualizando ");
                    taskmap.put(no_of_task, task);
                    break;
                case 4:
                    System.out.println("Lista todas las tareas ");
                    list_all(taskmap);
                    break;
                default:
                    // do nothing
            }
        } while ( choice != 5);
    }

    public static void list_all( TreeMap<Integer, String> tm)
    {
        for (Map.Entry<Integer, String> item : tm.entrySet())
        {
            System.out.print(item.getKey()); System.out.print(" "); System.out.println(item.getValue());
        }
    }
}