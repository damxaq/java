long[][] sumBitReverse(long[] n) {
    int i=0,j,l=n.length;
    long[][] s = new long[l][l];
 
    for (; i<l; i++)
        for (j=0; j<l;)
            s[i][j]=r(r(n[i])+r(n[j++]));

    return s;
}

long r(long a){
    List<Integer> t = new ArrayList<Integer>();
    int s;
    for(s=-1;a>0;a/=2,s++)
        t.add((int)(a%2));

    for (int i:t)
        a+=Math.pow(2,s--)*i;
    
    return a;
}
