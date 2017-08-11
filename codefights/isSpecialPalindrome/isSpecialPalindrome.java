boolean isSpecialPalindrome(int n) {
 
    int z=0,i=0,j=0;
    String x="";
    while(n>0){
        x+=n%2+"";
        if (n%2==0) z++;
        n/=2;
        j++;   
    }

    for (;i<j;)
        if (x.charAt(i)!=x.charAt(j-1-i++)) return false;

    return z!=1?false:true;
}



