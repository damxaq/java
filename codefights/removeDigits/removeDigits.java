long[] removeDigits(long n, int k) {
    int o=0,i=0,j;
    long m=n,a=0,x=0,l=0;
    while (n>0)
    {
        a*=10;
        a+=(n%10);
        n/=10;
        o++;
    }
    long [] t = new long[o];
    while (a>0)
    {
        t[i]=a%10;
        i++;
        a/=10;
    }

    
    for (i=0; i<o-k+1; i++){
        for (j=i; j<i+k; j++){
            l*=10;
            l += t[j];
            
        }
       
        if (l > x) x = l;
        if (l < m) m = l;
        l = 0;
    }
    long r[] = {m,x};
    return r;
}

