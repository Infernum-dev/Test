import java.util.Scanner;  

class Latihan2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
    System.out.print("Masukkan tinggi badan (cm) : ");
    double height = input.nextDouble();
    System.out.print("Masukkan berat badan (kg) : ");
    double weight = input.nextDouble();
    double bmi = weight / (height * height);
    System.out.println("Nilai BMI Anda adalah " + bmi);
    if (bmi < 18.5) {
        System.out.println("Anda termasuk kategori underweight");
    }
    else if (bmi >= 18.5 && bmi < 24.9) {
        System.out.println("Anda termasuk kategori normal");
    }
    else if (bmi >= 25.0 && bmi < 29.0) {
        System.out.println("Anda termasuk kategori overweight");
    }
    else if (bmi >= 30.0 && bmi < 40.0) {
        System.out.println("Anda termasuk kategori Obese");
    }
    else {
        System.out.println("Anda termasuk kategori extreme obese");
    }
  }
}