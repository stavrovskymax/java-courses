class Vehicle {
 int passengers;
 int fuelcap;
 int mpg;
 
 Vehicle (int �, int f, int m) {
  passengers = �;
  fuelcap = f;
  mpg = m;
 }
    
 int range () {
  return mpg * fuelcap;
 }
    
 double fuelneeded(int miles) {
  return (double) miles / mpg;
 }
}
class Vehcons {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle(4, 16, 21);
    Vehicle sportscar = new Vehicle(2, 14, 12);
    double gallons;
    int dist = 252;
    
/*    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.mpg = 21;
        
    sportscar.passengers = 2;
    sportscar.fuelcap = 14;
    sportscar.mpg = 12;    */
 
    gallons = minivan.fuelneeded(dist);
    System.out.println("��� ����������� " + dist 
       + " ���� ����-������� ��������� "
       + gallons + " �������� ������� " + " ����� ��������� " 
       + minivan.passengers + " ��� ���� ������� " + minivan.range());
 
    gallons = sportscar.fuelneeded(dist);
    System.out.println("��� ����������� " + dist  
       + " ���� ����������� ���������� ��������� " 
       + gallons + " �������� ������� " + " ����� ��������� " + 
       + sportscar.passengers + " ��� ���� ������� " + sportscar.range());
  }
}