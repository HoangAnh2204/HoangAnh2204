import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EmployManagement {
    public static void main (String args[]) throws FileNotFoundException{

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Có bao nhiêu nhân viên : ");
        int n = keyboard.nextInt();
        Employee[] epms = new Employee[n];

        for (int i = 0; i < epms.length; i++){
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + " : ");
            System.out.print("Tên : ");
            String name = keyboard.next();
            System.out.print("Tuổi : ");
            int age = keyboard.nextInt();
            System.out.print("Số giờ làm : ");
            Double hours = keyboard.nextDouble();
            System.out.print("Địa chỉ : ");
            String address = keyboard.next();

            Employee epm = new Employee(name, age, hours, address);
            epms[i] = epm;
            keyboard.nextLine();

        }
        double luongTong = 0.0;
        for (int i = 0; i < epms.length; i++){

            luongTong += epms[i].getSalary();

        }
        System.out.println("Tổng lương nhân viên :" + df.format(luongTong));
        for (int m = 0; m < epms.length; m++){
            double Min = epms[0].getSalary();
            for (int k = 1; k < epms.length; k++ ){
                if (epms[m].getSalary() < epms[k].getSalary()){
                    Employee nhanvien;
                    nhanvien = epms[m];
                    epms[m] = epms[k];
                    epms[k] = nhanvien;

                
                
            }
        }
        for (int i = 0; i < epms.length; i++){
            String outputFile = (epms[i].getName() +" - " + epms[i].getAge() + " - " + epms[i].getHours() +" - " + df.format(epms[i].getSalary()));

            PrintWriter output = new PrintWriter("salaries.txt");   
            
            System.out.println(outputFile);
            output.println(outputFile);
            output.close();
        }

        }

    }
}

