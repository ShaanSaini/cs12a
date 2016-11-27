/* GCD.c
 * shksaini
 * Shaan Saini
 * lab8
 * Returns the greatest common denominator of two given numbers
 */

#include<stdio.h>
#include<stdlib.h>

int main(){
  int a,b,s;
  char str[100];

  printf("Enter a positive integer: ");
  while( 1 ){
    s = scanf("%d",&a);
    while(s!=1){
      scanf("%s", str);
      printf("Please enter a positive integer: ");
      s = scanf(" %d", &a);
    }
    if(a>0) break;
    printf("Please enter a positive integer: ");
  }

  printf("Enter another positive integer: ");
  while( 1 ){
    s = scanf("%d", &b);
    while(s!=1){
      scanf("%s", str);
      printf("Please enter a positive integer: ");
      s = scanf("%d", &b);
    }
    if(b>0) break;
    printf("Please enter a positive integer: ");
  }
  printf("The GCD of %d and %d is ", a, b);
  while(a!=b){
    if(a>b)
      a-=b;
    else
      b-=a;
  }
  printf("%d\n", a);
  return 0;
}
