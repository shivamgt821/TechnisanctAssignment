import java.util.Scanner;
class Nested_for_$tar_Diamond
{
	public static void main(String[] args){
	System.out.print("enter data : ");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int space=n/2;
	int star=1;

	for(int i=1;i<=n;i++){

	// Space providing

	for(int j=1;j<=space;j++){
	System.out.print(" ");
	}

	// Star providing
	
	for(int j=1;j<=star;j++){
	System.out.print("*");
	}
	if(i<=n/2){
	space--;
	star+=2;
	}
	else{
	space++;
	star-=2;
  	}
	System.out.println();
	}
   }
}

