
package computadora;
import java.util.Scanner;

public class Computadora {

    public static int dato,dato1,lineas2;
    public static String jugador1,jugador2;
    public static void main(String[] args) {
       Scanner z = new Scanner(System.in);
      boolean salir4= false;
      
      while(!salir4){
      String juego[][];
      juego = new String[3][3];
      int n1=0;
      int fila;
      int columna;
       for (int a1=0; a1<=2; a1=a1+1) {
                for (int b1=0; b1<=2; b1=b1+1) {
                juego[a1][b1]=" ";
                
                }
 
    }
       System.out.println("    BIENVENIDO AL JUEGO DE GATO");
       System.out.println("    Persona vs Computadora");
       System.out.println(" ");
System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
        
        System.out.print("Ingresa tu nombre: ");
        jugador1 =z.nextLine();
        System.out.println("");
        

while(n1<10){
    
    System.out.println("Es tu turno "+jugador1);
    

       
do{
    System.out.print ("Seleccione fila ");
    dato =z.nextInt();
}while (dato<0 || dato>2);
       
do{
System.out.print ("Seleccione Columna ");
dato1 =z.nextInt();
 
}
while (dato1<0 || dato1>2);   

while (juego[dato][dato1]== "X" || juego[dato][dato1]== "O" ) {
    System.out.println("");
    System.out.println("");
System.out.println("A ingresado una jugada en donde ya existia una anteriormente");

do{
 System.out.print ("Seleccione fila ");
    dato =z.nextInt();
}
while (dato<0 || dato>2);

do{
System.out.print ("Seleccione Columna ");
dato1 =z.nextInt();
 
}
while (dato1<0 || dato1>2); 
    
}
lineas2=50;
    for ( int i2=0; i2< lineas2; i2++)
    {
    System.out.println("");
    } 
juego[dato][dato1] = "X";

    
System.out.println("        \n Tu turno \n");
System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
 
n1++;

if (juego[0][0]== "X" && juego[0][1]== "X" && juego [0][2]== "X") {
        System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[1][0]== "X" && juego[1][1]== "X" && juego [1][2]== "X") {
        System.out.println("Has ganado el juego "+jugador1);
break;
}
else if (juego[2][0]== "X" && juego[2][1]== "X" && juego [2][2]== "X") {
       System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][0]== "X" && juego[1][0]== "X" && juego [2][0]== "X") {
       System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][1]== "X" && juego[1][1]== "X" && juego [2][1]== "X") {
         System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][2]== "X" && juego[1][2]== "X" && juego [2][2]== "X") {
        System.out.println("Has ganado el juego "+jugador1);
break;
}
//diagonales faltan
if (juego[0][0]== "X" && juego[1][1]== "X" && juego [2][2]== "X") {
         System.out.println("Has ganado el juego "+jugador1);
break;
}
if (juego[0][2]== "X" && juego[1][1]== "X" && juego [2][0]== "X") {
      System.out.println("Has ganado el juego "+jugador1);
break;
}

if(n1==5){
    System.out.println("EMPATE!");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    break;
    
}
int ayuda2=0;
if(n1==1){
if (juego[1][1]== "X" ) {
        juego[0][0]= "O" ;
ayuda2=1;
}
if (juego[1][1]== " " ) {
        juego[1][1]= "O" ;
ayuda2=1;
}
}


//CONDICIONES PARA PONER "O" EN PUNTO DONDE LO HACE GANAR
boolean ayuda=false;
if(ayuda2==0){
if (juego[0][0]== "O" && juego[0][1]=="O" && juego[0][2]==" " ) {
        juego[0][2]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[1][0]== "O" && juego[1][1]=="O" && juego[1][2]==" "  ) {
        juego[1][2]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "O" && juego[2][1]=="O" && juego[2][2]==" " ) {
        juego[2][2]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "O" && juego[1][0]=="O" && juego[2][0]==" " ) {
        juego[2][0]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][1]== "O" && juego[1][1]=="O" && juego[2][1]==" "  ) {
        juego[2][1]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "O" && juego[1][2]=="O" && juego[2][2]==" "  ) {
        juego[2][2]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "O" && juego[1][1]=="O" && juego[2][2]==" " ) {
        juego[2][2]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "O" && juego[1][1]=="O" && juego[0][2]==" " ) {
        juego[0][2]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "O" && juego[1][1]=="O" && juego[2][0]==" " ) {
        juego[2][0]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][2]== "O" && juego[1][1]=="O" && juego[0][0]==" " ) {
        juego[0][0]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "O" && juego[0][2]=="O" && juego[0][1]==" " ) {
        juego[0][1]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[1][0]== "O" && juego[1][2]=="O" && juego[1][1]==" " ) {
        juego[1][1]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "O" && juego[2][2]=="O" && juego[2][1]==" " ) {
        juego[2][1]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "O" && juego[2][0]=="O" && juego[1][0]==" " ) {
        juego[1][0]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][1]== "O" && juego[2][1]=="O" && juego[1][1]==" " ) {
        juego[1][1]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "O" && juego[2][2]=="O" && juego[1][2]==" " ) {
        juego[1][2]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "O" && juego[2][2]=="O" && juego[1][1]==" " ) {
        juego[1][1]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "O" && juego[0][2]=="O" && juego[1][1]==" " ) {
        juego[1][1]= "O" ;
        ayuda=true;
        ayuda2=1;
}
}
// Empiezan las jugadas de la computadora para evitar perder

//HORIZONTALES A LA DERECHA
while(!ayuda){
if(ayuda2==0){
if (juego[0][0]== "X" && juego[0][1]=="X" && juego[0][2]==" ") {
        juego[0][2]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[1][0]== "X" && juego[1][1]=="X" && juego[1][2]==" " ) {
        juego[1][2]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "X" && juego[2][1]=="X" && juego[2][2]==" " ) {
        juego[2][2]= "O" ;
        ayuda2=1;
}
}
//HORIZONTALES A LA IZQUIERDA
if(ayuda2==0){
if (juego[0][0]== " " && juego[0][1]=="X" && juego[0][2]=="X") {
        juego[0][0]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[1][0]== " " && juego[1][1]=="X" && juego[1][2]=="X" ) {
        juego[1][0]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== " " && juego[2][1]=="X" && juego[2][2]=="X" ) {
        juego[2][0]= "O" ;
        ayuda2=1;
}
}

//VERTICALES HACIA ABAJO
if(ayuda2==0){
if (juego[0][0]== "X" && juego[1][0]=="X" && juego[2][0]==" ") {
        juego[2][0]= "O" ;
         ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][1]== "X" && juego[1][1]=="X" && juego[2][1]==" " ) {
        juego[2][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "X" && juego[1][2]=="X" && juego[2][2]==" " ) {
        juego[2][2]= "O" ;
       ayuda2=1;
}
}
//VERTICALES HACIA ARRIBA
if(ayuda2==0){
if (juego[0][0]== " " && juego[1][0]=="X" && juego[2][0]=="X") {
        juego[0][0]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][1]== " " && juego[1][1]=="X" && juego[2][1]=="X" ) {
        juego[0][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== " " && juego[1][2]=="X" && juego[2][2]=="X" ) {
        juego[0][2]= "O" ;
        ayuda2=1;
}
}
//DIAGONAL
if(ayuda2==0){
if (juego[0][0]== "X" && juego[1][1]=="X" && juego[2][2]==" " ) {
        juego[2][2]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "X" && juego[1][1]=="X" && juego[0][2]==" " ) {
        juego[0][2]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][2]== "X" && juego[1][1]=="X" && juego[0][0]==" ") {
        juego[0][0]= "O" ;
       ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "X" && juego[1][1]=="X" && juego[2][0]==" " ) {
        juego[2][0]= "O" ;
        ayuda2=1;
}
}
// Centros de lineas
if(ayuda2==0){
if (juego[0][0]== "X" && juego[0][2]=="X" && juego[0][1]==" " ) {
        juego[0][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[1][0]== "X" && juego[1][2]=="X" && juego[1][1]==" " ) {
        juego[1][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "X" && juego[2][2]=="X" && juego[2][1]==" " ) {
        juego[2][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "X" && juego[2][0]=="X" && juego[1][0]==" ") {
        juego[1][0]= "O" ;
       ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][1]== "X" && juego[2][1]=="X" && juego[1][1]==" ") {
        juego[1][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "X" && juego[2][2]=="X" && juego[1][2]==" ") {
        juego[1][2]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "X" && juego[2][2]=="X" && juego[1][1]==" ") {
        juego[1][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[2][0]== "X" && juego[0][2]=="X" && juego[1][1]==" " ) {
        juego[1][1]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "X" && juego[1][2]=="X" && juego[1][1]=="O" && juego[0][2]==" " ) {
        juego[0][2]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "X" && juego[1][0]=="X" && juego[1][1]=="O" && juego[0][0]==" " ) {
        juego[0][0]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "X" && juego[2][2]=="X" && juego[1][1]=="O" && juego[1][0]==" ") {
        juego[1][0]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][2]== "X" && juego[2][0]=="X" && juego[1][1]=="O" && juego[1][0]==" " ) {
        juego[1][0]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[1][1]== "X" && juego[0][0]=="O" && juego[2][2]=="X" && juego[2][0]==" ") {
        juego[2][0]= "O" ;
        ayuda2=1;
}
}

if(ayuda2==0){
if (juego[0][0]== "X" && juego[1][1]=="O" && juego[2][1]=="X" && juego[1][2]==" ") {
        juego[1][2]= "O" ;
        ayuda2=1;
}
}

ayuda=true;
}

if(ayuda2==0){
int datob;
datob = (int)(Math.random()*3)+0;
int datob2;
datob2 = (int)(Math.random()*3)+0;
while (juego[datob][datob2]== "O" || juego[datob][datob2]== "X" ) {
 
datob = (int)(Math.random()*3)+0;
datob2 = (int)(Math.random()*3)+0;
 
}

juego[datob][datob2] = "O";
}

    System.out.println("");
    System.out.println("");
    System.out.println("Turno de la computadora: ");

System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
 


if (juego[0][0]== "O" && juego[0][1]== "O" && juego [0][2]== "O") {
       System.out.println("");
       System.out.println("");
       System.out.println("La computadora ha ganado!");
break;
}
if (juego[1][0]== "O" && juego[1][1]== "O" && juego [1][2]== "O") {
       System.out.println("");
       System.out.println("");
        System.out.println("La computadora ha ganado!");
break;
}
else if (juego[2][0]== "O" && juego[2][1]== "O" && juego [2][2]== "O") {
       System.out.println("");
       System.out.println("");
       System.out.println("La computadora ha ganado!");
break;
}
if (juego[0][0]== "O" && juego[1][0]== "O" && juego [2][0]== "O") {
       System.out.println("");
       System.out.println("");
       System.out.println("La computadora ha ganado!");
break;
}
if (juego[0][1]== "O" && juego[1][1]== "O" && juego [2][1]== "O") {
          System.out.println("");
          System.out.println("");
         System.out.println("La computadora ha ganado!");
break;
}
if (juego[0][2]== "O" && juego[1][2]== "O" && juego [2][2]== "O") {
         System.out.println("");
         System.out.println("");
        System.out.println("La computadora ha ganado!");
break;
}

if (juego[0][0]== "O" && juego[1][1]== "O" && juego [2][2]== "O") {
       System.out.println("");
       System.out.println("");
       System.out.println("La computadora ha ganado!");
break;
}
if (juego[0][2]== "O" && juego[1][1]== "O" && juego [2][0]== "O") {
       System.out.println("");
       System.out.println("");
     System.out.println("La computadora ha ganado!");
break;
}




}
          System.out.println("");
          System.out.println("1.Volver a Jugar");
          System.out.println("2.Salir");
          int eleccion =z.nextInt();
          while(eleccion<1 || eleccion>2){
              System.out.println("");
          System.out.println("Ingresaste un numero invalido");
          System.out.println("");
          System.out.println("1.Volver a Jugar");
          System.out.println("2.Salir");
          eleccion =z.nextInt();
          }
          if(eleccion==1){
              salir4=false;
              System.out.print("");
        String ayuda =z.nextLine();
        lineas2=50;
    for ( int i2=0; i2< lineas2; i2++)
    {
    System.out.println("");
    } 
          }
          if(eleccion==2){
              salir4=true;
              }
          

      }
        System.out.println("Saliste!");      
    }
    
}
