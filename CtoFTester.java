public static double CtoF(double degrees){
   return (degrees - 32) * 9.0  / 5.0;
}

public static double  FtoC(double degrees){
   return degree * 5.0/9.0 + 32;
}
public static void Testing() {
  System.out.print FtoC(3);
  System.out.print FtoC(4);
  System.out.print FtoC(5);
  System.out.print FtoC(6);
  System.out.print CtoF(3);
  System.out.print CtoF(4);
  System.out.print CtoF(5);
  System.out.print CtoF(6);
}
