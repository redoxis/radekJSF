package jsf;







public class checkPerson {
 
 public static boolean sprawdz(String pesel){
 
  int[] wagi = {1, 3, 7, 9, 1, 3, 7 ,9 ,1 ,3};

 
  if (pesel.length() != 11) return false;
  
  
  int suma = 0;
  
  
  for (int i = 0; i < 10; i++)
     suma += Integer.parseInt(pesel.substring(i, i+1)) * wagi[i];
  
  
  int cyfraKontrolna = Integer.parseInt(pesel.substring(10, 11));

  
  suma %= 10;
  suma = 10 - suma;
  suma %= 10;
  
  
  return (suma == cyfraKontrolna);
  
 }
 
/* public static boolean sprawdzDate(Calendar dataUrodzenia, String pesel)
 {
	 if(dataUrodzenia == null)
	 {
		 return false;
	 }
	 else
	 {
		 
	 
	int dd = 0;
	int mm = 0;
	int yy = 0;
	int dd2 = dataUrodzenia.get(dataUrodzenia.DAY_OF_MONTH);
	int mm2 = dataUrodzenia.get(dataUrodzenia.MONTH);
	int yy2 = dataUrodzenia.get(dataUrodzenia.YEAR);	
 
	    yy=Integer.parseInt(pesel.substring(0, 1));
	    mm=Integer.parseInt(pesel.substring(2, 3));
	    dd=Integer.parseInt(pesel.substring(4, 5));
	      	
	    if(yy==yy2 && mm==mm2 && dd==dd2)
	    {
	    	return true;
	    }
		 
	
	 return false;
	 }
	 
 }
 
 */
 public static void main(){

 }
}
