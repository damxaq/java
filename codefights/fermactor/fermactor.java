int[] fermactor(int n) {
    double p=0,l=1,q,j;
    while(p<n) p=Math.pow(l++,2);
    for(j=1,q=0;;p=Math.pow(l++,2)){
        for(;p-q>n;)
            q=Math.pow(j++,2);
        if (p-q==n) return new int[] {(int)Math.sqrt(p),(int)Math.sqrt(q)};
    }
}

