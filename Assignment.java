import java.util.ArrayList;

import java.util.*;
public class Assignment {
    public void details(){
        System.out.println("Enter your personal details.");
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter your name :- ");
        String Name=s.nextLine();
        System.out.print("Enter your gender :- ");
        String gender=s.nextLine();
        System.out.print("Enter your age :- ");
        Integer age=s.nextInt();
        System.out.println("Add your medicines. ");
        System.out.print("Number of medicines :- ");
        Integer medicines=s.nextInt();
        System.out.println("___________________________________________________________________");
        List<String> list = new ArrayList<String>();
        int i=1;
        while (i<=medicines){
            System.out.print("Medicines name: ");
            String mdName=s1.nextLine();
            System.out.print("Time(24HR Format): ");
            String mdTime=s1.nextLine();
            list.add(mdName+"##"+mdTime);
            i++;
        }
        System.out.println("\n\n\n\n\n");
        System.out.println("Here is your");
        System.out.println("___________________________________________________________________");
        System.out.println("***"+" "+"Name :"+" "+Name+" "+"======"+" "+"Age :"+" "+age+"Y"+" "+"======"+" "+"Gender :"+" "+gender+" "+"***");
        System.out.println("___________________________________________________________________");
        System.out.println("Medicines Summary. ");
        System.out.println("___________________________________________________________________");
        System.out.println("Name\t\t\t\tTime");
        for(String med : list){
            String[] splits = med.split("##");
            System.out.println(splits[0]+"\t\t\t\t"+splits[1]);
        }


        /**
         * Reminder code
         */
        while(true){
            Date currentTime = new Date();
            String hour = currentTime.getHours()+"";
            String min = currentTime.getMinutes()+"";
            String finalTime = hour+":"+min;
            for(String med : list){
                String[] splits = med.split("##");
                String name = splits[0];
                String time = splits[1];
                if(finalTime.equalsIgnoreCase(time)){
                    System.out.println("Hi "+Name+", It's time to take your Medicine "+name);
                }
            }
            try {
                Thread.sleep(60000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Assignment m=new Assignment();
        m.details();
    }
}
