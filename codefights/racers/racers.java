int[] racers(int t, int[] a, int[] s) {
    int l=a.length,m,i=0,j;
    double c,z;
    double[] k = new double[l];
    
    for (; i<l; i++){
        c = Math.sqrt(2.0*t/a[i]);
        z = (float)s[i]/a[i];
        k[i]=c>z?z+(t-a[i]*z*z/2)/s[i]:c;
    }
    for (i=0; i<l;){
        m=0;
        for (j=0; j<l; j++)
            m+=k[i]>k[j] ||(k[i]==k[j] && i>j)?1:0;
        a[i++] = m; 
    }
    return a; 
}
