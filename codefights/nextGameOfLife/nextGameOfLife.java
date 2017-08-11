int x,y,n,a=0,b;

int[][] nextGameOfLife(int[][] s) {
    
    x=s.length;
    y=s[0].length;
    
    int[][] r = new int[x][y];

    for (;a<x; a++)
        for (b=0; b<y;){
            n=h(s);
            r[a][b]=s[a][b++]==1?n<2 || n>3?0:1:n==3?1:0;
        }
    
    return r;
}

int h(int[][] s){
    int r=0,i=a-1,j;
    for (; i<a+2; i++)
        for (j=b-1; j<b+2; j++){
            if (i<0 || j<0 || i>=x || j>=y || (i==a && j==b)) continue;
            if (s[i][j]==1) r++;
        }
    return r;
}
