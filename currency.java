import java.util.Scanner;
class currency{
        public static void main(String [] abbas){
              Scanner s1 = new Scanner(System.in);
               System.out.print("Enter the number :");
               int num = s1.nextInt(); // taking input at runtime from user 
               int five=0;       // five variable count the number of currency note or coins 
                                           while(num>=5000){
                                                       num-=5000;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("5000"+"     "+five);       
                                         
                                          five=0;   
                                           while(num>=1000){
                                                       num-=1000;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("1000"+"     "+five);       
                                           
                                           five=0;  
                                           while(num>=500){
                                                       num-=500;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("500"+"      "+five);       
                                           

                                           five=0;
                                           while(num>=100){
                                                       num-=100;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("100"+"      "+five);       
                                           
                                            five=0;
                                           while(num>=50){
                                                       num-=50;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("50"+"       "+five);       
                                           
                                           five=0;
                                           while(num>=10){
                                                       num-=10;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("10"+"       "+five);       
                                           
                                           five=0;
                                           while(num>=5){
                                                       num-=5;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("5"+"        "+five);       
                                           
                                           five=0;
                                           while(num>=2){
                                                       num-=2;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("2"+"        "+five);       
                                           
                                         five=0;   
                                          while(num>=1){
                                                       num-=1;
                                                       five++;                                                       
                                                                    }		
                                           System.out.println("1"+"        "+five);      
		  }
                   
 }
