String[][] BookKeeper(String[][] b) {
    
    String[] t,m,w;
    String[][] s;
    int [] l;
    int [][] z;
    int i=0,k=0,d=0,a=0,p=0,j=0,h,x=0;
    
    for(String[] r:b){
        for(String y:r) i++;
        k++;
    }
    
    w = new String[i];
    s = new String[k][];
    k =0;
    t = new String[i];
    m = new String[i];
    l = new int[i];
    i=0;
    
    for(String[] r:b){
        for(String y:r) {
            d++;
            w[i]=y;
            y = y.replace("Of ", "");
            y = y.replace(" of ", " ");
            y = y.replace("The ", "");
            y = y.replace(" the ", " ");
            y = y.replace("A ", "");
            y = y.replace(" a ", " ");
            y = y.replace("And ", "");
            y = y.replace(" and ", " ");
            t[i]=y;
            m[i++]=y;
        }
        s[k++] = new String[d]; 
        d=0;
    }
    
    Arrays.sort(t);
    
    for (; j<i; j++) 
        for (h=0; h<i; h++)
            if (m[j]==t[h]) l[h]=j;

    k=0;
    i=0;
    for(String[] r:b){
        for(String y:r) {
            s[k][d]=w[l[a++]];
            m[i++]=s[k][d++];
        }
        k++;
        x=d>x?d:x;
        d=0;
    } 
    
    z = new int[k][x];
    
    i=0;
    a=1;
    for(String[] r:b){
        for(String y:r) z[d][i++]=a++;
        i=0;
        d++;
    }     
    
    for (j=0; j<x; j++)
        for (h=0; h<k; h++)
            if (z[h][j]!=0) l[i++]=z[h][j]-1;
    

    k = 0;
    d=0;
    for(String[] r:b){
        for(String y:r) {
            for (a=0; a<i; a++) if (p==l[a]) b[k][d]=m[a];
            p++;
            d++;
        }
        k++;
        d=0;
    }   
    return b;
}
